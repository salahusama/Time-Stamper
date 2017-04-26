void setup() {
  size(500, 500);
}

Shape shape = new Shape();

void draw() {
  background(0);
  shape.createShape();
  arc(200, 200, 50, 50, PI, 0);
}