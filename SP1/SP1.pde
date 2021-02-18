//Setup
int[][] grid;

//Change size of grid (see line 28)
int size = 10,

    keyPressedInt = 0,
    gridWidth,
    gridHeight,
    time,
    oldTime;
boolean gameOver = false; 

//Objects

  
Player player;
//            Number of enemies
Enemy enemy[] = new Enemy[3];
Food food;


void setup() {
  rectMode(CENTER);
  textSize(24);
  frameRate(15);
  
  //Window width and height must return a modulus of the "int size"'s value equal to 0 for the grid to work!
  size(1000, 450);
  if (width%size != 0 || height%size != 0) { 
    println("Invalid grid size");
    background(0);
    textSize(64);
    textAlign(CENTER, CENTER);
    fill(255, 0, 0);
    text("Invalid grid size", width/2, height/2);
    return;
  }
  gridWidth = width/size;
  gridHeight = height/size;
  println("Grid width: " + gridWidth + " tiles\nGrid height: " + gridHeight + " tiles");
  grid = new int[gridWidth][gridHeight];
  
  //Initialize player, enemies and food
  player = new Player((int)random(0,gridWidth), (int)random(0,gridHeight));  
  for (int i = 0; i < enemy.length; i++) {
    enemy[i] = new Enemy((int)random(0,gridWidth), (int)random(0,gridHeight), player);
  }
  food = new Food((int)random(0,gridWidth), (int)random(0,gridHeight), player);
}

void draw() {
  if (width%size == 0 && height%size == 0 && !gameOver) {
    clearBoard();
    updateEntities();
    drawBackground();
    checkDrawPlayerHealth();
    checkKeyboardKey();
  }
}

void clearBoard() {
  for (int x = 0; x < gridWidth; x++) {
    for (int y = 0; y < gridHeight; y++) {
       grid[x][y] = 0;
    }
  }
}

void updateEntities() {
  //Update player
  grid[player.x][player.y] = player.type;
  
  //Update enemy
  for (int i = 0; i < enemy.length; i++) {
    grid[enemy[i].x][enemy[i].y] = enemy[i].type;
    enemy[i].MoveTowardsPlayer();
    if (player.x == enemy[i].x && player.y == enemy[i].y && player.canTakeDamage) {
      player.takeDamage();
      time = millis();
      oldTime = time;
    }
  }
  
  //Update food
  if (player.x == food.x && player.y == food.y) {
    food.newPosition();
    player.increaseScore();
  } else { 
    grid[food.x][food.y] = food.type;
  }
}

void drawBackground() {
  for (int x=0; x<gridWidth; x++) {
    for (int y=0; y<gridHeight; y++) {
      fill(getColorFromType(grid[x][y], x, y));
      rectMode(CORNER);
      square(x*size, y*size, size);
    }
  }
}

void checkDrawPlayerHealth() {
  if (player.health > 0) {
    fill(255, 255, 255, 100);
    rect(0,0,width/2,10);
    fill(255,0,0, 100);
    rect(0,0,width/200*player.health,10);
    if(!player.canTakeDamage) {
      int time = millis();
      if (time > oldTime+2000) {
        player.canTakeDamage = true;
      }
    }
    fill(255);
    textAlign(RIGHT, CENTER);
    text("Score: " + player.score, width, 10);
  } else {
    gameOver = true;
    background(0);
    textSize(64);
    textAlign(CENTER, CENTER);
    fill(255, 0, 0);
    text("Game Over", width/2, height/2);
    textSize(24);
    fill(255);
    text("Score: " + player.score, width/2, height/2+60);
    
  }
}

void checkKeyboardKey() {
  switch(keyPressedInt) {
      case 1:
        player.moveUp();
        break;
      case 2:
        player.moveDown();
        break;
      case 3:
        player.moveLeft();
        break;
      case 4:
        player.moveRight();
        break;
      }
}

color getColorFromType(int type, int x, int y) {
  color c = color(100);
  switch(type) {
    case 1:
      if (!player.canTakeDamage) {
        c = color(0,0,150);
      } else {
        c = color(0,0,255);
      }
      break;
    case 2:
      //Enemy
      for (int i = 0; i < enemy.length; i++) {
        if (x == enemy[i].x && y == enemy[i].y) {
          c = color(enemy[i].enemyColor, 0, 0);
        }
      }
      break;
    case 3:
      c = color(0,255,0);
      break;
  }
  return c;
}


void keyPressed() {
  if (keyPressedInt>0) return;
  switch(keyCode) {
  case UP:
    keyPressedInt = 1;
    break;
  case DOWN:
    keyPressedInt = 2;
    break;
  case LEFT:
    keyPressedInt = 3;
    break;
  case RIGHT:
    keyPressedInt = 4;
    break;
  }
}

//keyReleased() is very slow resulting in uncomfortable gameplay when moving quickly.
void keyReleased() {
  keyPressedInt = 0;
}
