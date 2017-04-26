class Shape {
  
  void createShape() {
    float w = 50;
    float l = 100;
    float r = 5;
    
    stroke(255);
    strokeWeight(1);
    noFill();
    beginShape();
    line(0, r, 0, l-r);
    arc(r, l-r, r*2, r*2, HALF_PI, PI);
    line(r, l, w-r, l);
    arc(w-r, l-r, r*2, r*2, 0, HALF_PI);
    line(w, l-r, w, r);
    arc(w-r, r, r*2, r*2, HALF_PI*3, TWO_PI);
    line(w-r, 0, r, 0);
    arc(r, r, r*2, r*2, PI, HALF_PI*3);
    endShape();
  }
}