class Food {
  int x, 
      y, 
      type = 3;

  Player player;

  Food(int x, int y, Player player) {
    this.x = x;
    this.y = y;
    this.player = player;
  }
  
  void newPosition() {
    x = (int)random(0,gridWidth);
    y = (int)random(0,gridHeight);
  }
}
