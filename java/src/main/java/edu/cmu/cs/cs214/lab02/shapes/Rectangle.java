package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {
    private double height;
    private double width;
    
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    public double getPerimeter() {
        return 2 * (height + width);
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }
    @Override
    public double getArea() {
        return height * width;
    }
    @Override public String getShapeName(){
        return "Rectangle";
    }
    
}
