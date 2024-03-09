import processing.core.PApplet;

public class Sketch extends PApplet {
  // Define the variables
  float sunX;
  float sunY;
  float boatX;
  float boatY;
  float mastX;
  float mastY;

  // Define and intialize time variables
  int intCurrentHour = hour();
  int intCurrentMinute = minute();
  int intCurrentMonth = month();
  int intCurrentDate = day();
  int intCurrentYear = year();

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
    // Give values to the defined variables
    sunX = random(0, 400);
    sunY = random(0, 150);
    boatX = random(100, 300);
    boatY = random(300, 350);
    mastX = random(100, 300);
    mastY = random(300, 350);

    // Change the background colour depending on the variable's value
    if (sunX > 200) {
      background(19, 24, 98);
    }
    else if (sunX >= 150 && sunX <= 250) {
      background(255, 127, 127);
    }
    else {
      background(135, 206, 250);
    }
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // create a upside down trapezoid and a vertical rectangle, fill both with brown colour 
    fill(139, 69, 19);
    quad(boatX, boatY, boatX + 25, boatY + 50, boatX + 125, boatY + 50, boatX + 150, boatY);
    rect(boatX + 70, boatY, 10, -100);

    // create a sideways triangle, fill with white colour
    fill(255, 255, 255);
    triangle(boatX + 80, boatY - 50, boatX + 115, boatY - 70, boatX + 80, boatY - 90);

    // create a circle shape, colour changes based on the variable's value
    if (sunX > 200) {
      fill(194, 197, 204);
    }
    else {
      fill(255, 255, 0);
    }
    ellipse(sunX, sunY, 90, 90);

    // Displays the current time
    fill(0);
    textSize(20);
    text("Year: " + intCurrentYear, 20, 100);
    text("Day: " + intCurrentDate, 20, 75);
    text("Month: " + intCurrentMonth, 20, 50);
    text("Hour: " + intCurrentHour, 20, 125);
    text("Minute: " + intCurrentMinute, 20, 150);
  
  // define other methods down here.
  }
}