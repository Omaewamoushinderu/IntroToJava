   PImage mustache; 
   PImage friend;

void setup(){
  friend = loadImage("friend.jpg");
         mustache = loadImage("mustache.png");
               friend.resize(800,600);


      size(800, 600);
}
void draw(){
  background(friend);
if(mousePressed){
                  image(mustache,mouseX,mouseY);


    
}




}