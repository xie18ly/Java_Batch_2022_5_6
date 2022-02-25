package AssignmentThree;

import java.util.*;

public class ListMap {
    private List A;
    private HashMap<String, String> B;

    public ListMap(){

    }

    public ListMap(List A, HashMap<String, String> B){
        this.A = A;
        this.B = B;
    }

    public List<Integer> getDiff(){
        List<Integer> C = new ArrayList<>(A);
        for(Map.Entry<String, String> entry: B.entrySet()){
            int element = Integer.parseInt(entry.getValue());
            if(C.contains(element)){
                Integer toRemove = element;
                A.remove(toRemove);
            }
        }
        return A;
    }
}
