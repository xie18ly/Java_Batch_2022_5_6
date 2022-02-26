package AssignmentFour;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;

public class ReaderThread implements Runnable{

    //A Queue that additionally supports operations that wait for the queue to become non-empty when retrieving an element, and wait for space to become available in the queue when storing an element.
    protected BlockingQueue<String> queue;

    public ReaderThread(BlockingQueue<String> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(new File("input.txt")));
            String buffer = null;
            while((buffer = br.readLine()) != null){
                queue.put(buffer);
            }
            queue.put("EOF");
        } catch(Exception e) {
            e.printStackTrace();
        } finally{
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
