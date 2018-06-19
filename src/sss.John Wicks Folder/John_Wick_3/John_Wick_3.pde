PImage rainbow;
PImage unicorn;

void setup(){
  rainbow = loadImage("my rainbow.jpg");
  size(834,678);
  rainbow.resize(width,height);
  background(rainbow);
  unicorn = loadImage("8-2-unicorn-free-png-image.png");
  unicorn.resize(width/4, height/4);
}

void draw(){
  background(rainbow);
   image(unicorn,mouseX,mouseY);
}