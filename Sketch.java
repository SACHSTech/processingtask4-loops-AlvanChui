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
      c = w * 255*2 / width;
      stroke(c);
      line(w, height/2, w, height);
    }
    //Quadrant 4
    translate(width * 3 / 4, height * 3 / 4);
    for (int count = 0; count < 8; count++) {
      fill(0, 160, 127); 
      ellipse(width / 10, 0 , width / 5, height / 12 );
      rotate(radians(45));
      fill(255, 200, 0); 
      ellipse(0, 0, width / 10, height / 10);
      
    }
  }
}