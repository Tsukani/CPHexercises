//3.a, 3.b & 3.c
color bg = color(0),
      red = color(255,0,0),
      yellow = color(255,255,0),
      green = color(0,255,0),
      grey = color(100);

int time,
    oldTime = 0;

//false = red | true = green
boolean state = false;

void setup() {
  size(300, 600);
  background(bg);
  ellipseMode(CENTER);
  fill(red);
  circle(150, 100, 170); 
  fill(grey);
  circle(150, 300, 170); 
  fill(grey);
  circle(150, 500, 170);
}

void draw() {
   time = millis();
  //3 seconds interval
  if (time > oldTime+3000) {
    fill(grey);
    if (!state) {
      circle(150, 100, 170); 
      fill(green);
      circle(150, 500, 170);
      state = true;
    } else {
      circle(150, 500, 170);
      fill(red);
      circle(150, 100, 170);
      state = false;
    }
    oldTime=time;
  }
}
