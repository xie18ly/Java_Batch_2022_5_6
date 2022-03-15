import AssignmentFour.ReaderThread;
import AssignmentFour.WriterThread;
import AssignmentOne.DoSomething;
import AssignmentOne.MergeTwoArray;
import AssignmentOne.SecondLargest;
import AssignmentThree.*;
import AssignmentTwo.Counter;
import AssignmentTwo.Criteria;
import Week4.CRUDTest;

import java.sql.SQLException;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) throws SQLException {
        CRUDTest test = new CRUDTest();
        test.doTest();
    }
}
