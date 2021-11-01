var life = 0;
var car1, car2, car3,car4;
var boundary1, boundary2;
var sam;

  boundary1 = createSprite(190,120,420,3);
  boundary2 = createSprite(190,260,420,3);
  
  sam = createSprite(20,190,13,13);
  sam.shapeColor = "green";
  
  car1 = createSprite(100,130,10,10);
  car1.shapeColor = "red";
  car2 = createSprite(215,130,10,10);
  car2.shapeColor = "red";
  car3 = createSprite(165,250,10,10);
  car3.shapeColor = "red";
  car4 = createSprite(270,250,10,10);
  car4.shapeColor = "red";
  
  car1.velocityY=5;
  car2.velocityY=5;
  car3.velocityY=-5;
  car4.velocityY=-5;


//Agrega velocidad para hacer que el auto se mueva.

function draw() {
   background("white");
  text("Lives: " + life,200,100);
  strokeWeight(0);
  fill("yellow");
  rect(0,120,52,140);
  fill("yellow");
  rect(345,120,52,140);
  car1.bounceOff(boundary1);
  car1.bounceOff(boundary2);
  car2.bounceOff(boundary1);
  car2.bounceOff(boundary2);
  car3.bounceOff(boundary1);
  car3.bounceOff(boundary2);
  car4.bounceOff(boundary1);
  car4.bounceOff(boundary2);
  
// Crea la función bounceoff para hacer que el auto rebote en los límites.
//Agregar la condición para hacer que Sam se mueva de izquiera a derecha.
if (keyDown("left")) {
  sam.x = sam.x - 2;
}
if (keyDown("right")) {
  sam.x = sam.x + 2;
}


//Agregar la condición de reducir la vida de Sam si toca el carro.
  if (sam.isTouching(car1)) {
    sam.y=190
    sam.x=20
  }
  if (sam.isTouching(car2)) {
    sam.y=190
    sam.x=20
  }
  if (sam.isTouching(car3)) {
    sam.y=190
    sam.x=20
  }
  if (sam.isTouching(car4)) {
    sam.y=190
    sam.x=120
  }
  
  
 drawSprites();
}