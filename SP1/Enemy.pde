class Enemy {
  int x, 
      y,
      type = 2,
      randomWait = (int)random(2,10),
      wait = randomWait,
      enemyColor = 255-(randomWait*10)*2;

  Player player;

  Enemy(int x, int y, Player player) {
    this.x = x;
    this.y = y;
    this.player = player;
  }

  //Movement
  void MoveTowardsPlayer() {
    if (wait != 0) {
      wait--; 
      return;
    }
    wait = randomWait;
    int xDistance = player.x - x;
    int yDistance = player.y - y;
    // random chance (~25% chance) for at enemy flytter sig i en tilfældig retning.
    int randomChance = (int)random(0,3);
    if (randomChance == 0) {
      int randomMovement = (int)random(0,3);
      switch (randomMovement) {
        case 0:
          this.moveUp();
          break;
        case 1:
          this.moveRight();
          break;
        case 2:
          this.moveDown();
          break;
        case 3:
          this.moveLeft();
          break;
      }
    } else {
      if (Math.abs(xDistance) > Math.abs(yDistance)) {
        if (xDistance>0) {
          this.moveRight();
        } else if (xDistance<0) {
          this.moveLeft();
        }
      } else {
        if (yDistance>0) {
          this.moveDown();
        } else if (yDistance<0) {
          this.moveUp();
        }
      }
    }
  }

  
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
} 
