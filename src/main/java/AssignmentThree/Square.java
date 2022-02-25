package AssignmentThree;

public class Square extends Rectangle{
    private double side;
    public Square(){

    }

    public Square(double side){
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
