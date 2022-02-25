import AssignmentOne.DoSomething;
import AssignmentOne.MergeTwoArray;
import AssignmentOne.SecondLargest;
import AssignmentThree.ListMap;
import AssignmentTwo.Counter;
import AssignmentTwo.Criteria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List A =  new ArrayList(Arrays.asList(1, 2, 3, 4, 10));
        HashMap<String, String> B = new HashMap<>();
        B.put("a","1");
        B.put("b","2");
        B.put("c","10");
        ListMap map = new ListMap(A,B);
        System.out.println(map.getDiff());
    }
}
