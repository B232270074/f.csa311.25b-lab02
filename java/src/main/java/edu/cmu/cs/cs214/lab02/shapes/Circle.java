package edu.cmu.cs.cs214.lab02.shapes;

/**
 * Circle хэлбэрийг тодорхойлох класс.
 */
public class Circle implements Shape {
  private double radius;

  /**
   * Circle класс үүсгэх байгуулагч.
   *
   * @param radius тойргийн радиус
   */
  public Circle(double radius) {
    this.radius = radius;
  }

  /**
   * Радиусыг авах.
   *
   * @return радиус
   */
  public double getRadius() {
    return radius;
  }

  /**
   * Радиусыг шинэчлэх.
   *
   * @param radius шинэ радиус
   */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  /**
   * Тойргийн талбайг тооцоолох.
   *
   * @return талбай
   */
  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }

  /**
   * Фигура нэрийг авах.
   *
   * @return "Circle"
   */
  @Override
  public String getShapeName() {
    return "Circle";
  }
}
