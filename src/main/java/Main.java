import AssignmentFour.ReaderThread;
import AssignmentFour.WriterThread;
import AssignmentOne.DoSomething;
import AssignmentOne.MergeTwoArray;
import AssignmentOne.SecondLargest;
import AssignmentThree.*;
import AssignmentTwo.Counter;
import AssignmentTwo.Criteria;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args){
        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);

        ReaderThread reader = new ReaderThread(queue);
        WriterThread writer = new WriterThread(queue);

        new Thread(reader).start();
        new Thread(writer).start();
    }
}
