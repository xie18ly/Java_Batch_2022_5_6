package AssignmentThree;

public class Circle extends Shape{
    private double radius;
    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (22.0/7.0) * radius * radius;
    }

    @Override
    public double getPerimeter(){
        return (22.0/7.0) * 2 * radius;
    }
}
