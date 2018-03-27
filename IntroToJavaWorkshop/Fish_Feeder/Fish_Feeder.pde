int food=3;
float randomNumber = random(800);
int score;
int x;
int y;
void setup() {
  size(800, 700);
}
void draw() {

  
  drawFish();
  food=food+2;
  fill(#4D0A0A);
  ellipse(randomNumber, food, 10, 10);
  if (food>height) {
    food=3;
    randomNumber = random(800);
    
  }
  checkCatch((int)randomNumber,food);
}
void drawFish() {

  background(141, 233, 237);

  noStroke();

  fill(255, 255, 255);

  ellipse(mouseX-17, mouseY-17, 20, 20); //back side eye

  fill(255, 200, 88);

  ellipse(mouseX, mouseY, 90, 50); //body

  triangle(mouseX+30, mouseY, mouseX+70, mouseY+30, mouseX+70, mouseY-30); //tail

  stroke(0);

  triangle(mouseX, mouseY, mouseX+15, mouseY+10, mouseX+15, mouseY-10); //side fin

  noStroke();

  fill(255, 200, 88);

  ellipse(mouseX, mouseY, 15, 15); //side fin cover

  noStroke();

  fill(255, 255, 255);

  ellipse(mouseX-25, mouseY-15, 20, 20); //front eye

  fill(0, 0, 0);

  ellipse(mouseX-25, mouseY-15, 5, 5); //pupil

  fill(141, 233, 237);

  ellipse(mouseX-45, mouseY, 25, 25); //mouth
}
void checkCatch(int x, int y) {

  if (x > mouseX && x < mouseX+50) {

    if (y > mouseY && y < mouseY+30) {

      score++;
      food=3;
    }
  } else if (y > 700 && score > 0) {

    score--;
    food=3;
  }

  println("Your score is now: " + score);
   fill(0, 0, 0);

textSize(16);

text("Score: " + score, 20, 20);
}