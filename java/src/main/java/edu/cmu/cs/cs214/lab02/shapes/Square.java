package edu.cmu.cs.cs214.lab02.shapes;

/**
* Constructs a Square with the specified side length.
*/

public class Square implements Shape {
  private double sideLen;

  public Square(double sideLen) {
    this.sideLen = sideLen;
  }
  
  public void setSideLen(double sideLen) {
    this.sideLen = sideLen;
  }
  
  public double getSideLen() {
    return sideLen;
  }
  
  @Override
    public double getArea() {
    return sideLen * sideLen;
  }
  
  @Override public String getShapeName() {
    return "Square";
  }
}
/**
* Constructs a Square with the specified side length.
*/
