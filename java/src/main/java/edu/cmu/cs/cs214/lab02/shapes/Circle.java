package edu.cmu.cs.cs214.lab02.shapes;

/**
 * asdfasdfasdf.
 */
public class Circle implements Shape {
  private double radius;

  /**
   * sadfdsfsfa.
   *
   * @param radius тойргийн радиус
   */
  public Circle(double radius) {
    this.radius = radius;
  }

  /**
   * fasdfdsf.
   *
   * @return radius
   */
  public double getRadius() {
    return radius;
  }

  /**
   * fsdfsadfa.
   *
   * @param radius sdfasdf
   */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  /**
   *fsadfsadg.
   *
   * @return S
   */
  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }

  /**
   * dsfasd.
   *
   * @return "Circle"
   */
  @Override
  public String getShapeName() {
    return "Circle";
  }
}
