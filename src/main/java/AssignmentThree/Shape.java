package AssignmentThree;

public abstract class Shape implements Comparable<Shape> {
    private double area;
    private double perimeter;

    public double getArea(){
        return area;
    }

    public double getPerimeter(){
        return perimeter;
    }

    public void setArea(double area){
        this.area = area;
    }

    public void setPerimeter(double perimeter){
        this.perimeter = perimeter;
    }

    @Override
    //it compares the area of two shapes
    public int compareTo(Shape other){
        if(this.getArea() == other.getArea()){
            return 0;
        } else if(this.getArea() < other.getArea()){
            return 1;
        }  else{
            return -1;
        }
    }

}
