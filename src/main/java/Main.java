import AssignmentOne.DoSomething;
import AssignmentOne.MergeTwoArray;
import AssignmentOne.SecondLargest;
import AssignmentThree.*;
import AssignmentTwo.Counter;
import AssignmentTwo.Criteria;

import java.util.*;

public class Main {
    public static void main(String[] args){
        List<Shape> shapeCollection = new ArrayList<>();
        shapeCollection.add(new Circle(2.9));
        shapeCollection.add(new Square((10.1)));
        shapeCollection.add(new Rectangle(2,4.5));
        Collections.sort(shapeCollection);
        for(Shape s: shapeCollection){
            System.out.println(s.getArea());
        }
    }
}
