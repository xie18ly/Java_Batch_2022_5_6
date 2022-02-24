package AssignmentOne;

import java.util.PriorityQueue;

public class SecondLargest {
    public SecondLargest(){

    }

    public SecondLargest(int[] input){
        System.out.println(getSecondLargest(input));
    }

    public int getSecondLargest(int[] input){
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>((a,b) -> a - b);
        for(int i : input){
            heap.offer(i);
            if(heap.size() > 2){
                heap.poll();
            }
        }
        return heap.poll();
    }
}
