import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255,255,127);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    //Quadrant 1
    for (int w = 0; w <= width / 2 ; w += width / 20) {
      stroke(0);
      line(w, 0, w, height / 2);  
    }
    for (int h = 0; h <= height / 2 ; h += height / 20) {
      stroke(0);
      line(0, h, width/2, h);
    }
    //Quadrant 2
    for(int w = width / 2 + width / 20; w <= width; w += width / 10) {
      for(int h = height / 20; h <= height / 2; h += height / 10) {
        fill(255, 200, 0);
        ellipse(w, h, width / 15, width / 15);
      }
    }
    //Quadrant 3
    int c = 0;
    for (int w = 0 ; w <= width / 2; w ++) {  
      stroke(c);
      line(w, height/2, w, height);
      c++ ;
    }
    //Quadrant 4
  
    int i = 0;
    int a = 0;
    int b = -15;
    for (int count = 0; count < 8; count++) {
    
      fill(0, 160, 127); 
      ellipse(width * 3 / 4 + a, height * 3 / 4 + b, 20, 60);
      rotate(radians(i));
      i += 45;
      if (count <= 2) {
        a += 7.5;
        b += 7.5;
      } 
      if (count > 2 && count <= 4) {
        a -= 7.5;
        b += 7.5;
      } 
      if (count > 4 && count <= 6) {
        a -= 7.5;
        b -= 7.5;
      } 
      if (count > 6 && count <= 8) {
        a += 7.5;
        b -= 7.5;
      }
      fill(255, 200, 0); 
      ellipse(width * 3 / 4, height * 3 / 4, 30, 30);
      
    }
  }
}