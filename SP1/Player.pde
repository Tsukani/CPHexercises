class Player {
  int x, 
    y, 
    type = 1, 
    health,
    score = 0;
  boolean canTakeDamage = true;  

  Player(int x, int y) {
    this.x = x;
    this.y = y;
    health = 100;
  }

  //Movement
  void moveUp() {
    if (y == 0) return;
    y--;
    grid[x][y] = type;
  }

  void moveDown() {
    if (y == gridHeight-1) return;
    y++;
    grid[x][y] = type;
  }

  void moveLeft() {
    if (x == 0) return;
    x--;
    grid[x][y] = type;
  }

  void moveRight() {
    if (x == gridWidth-1) return;
    x++;
    grid[x][y] = type;
  }

  //Take damage (touching enemy)
  void takeDamage() {
    if (canTakeDamage) {
      canTakeDamage = false;
      health -= 20;
      if (health >=0) {
        println("Health: " + health);
      }
    }
    
  }
  
  //Increase score (eating food)
  void increaseScore() {
    score++;
    println("Score: " + score);
  }
}
