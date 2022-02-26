package AssignmentFour;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Stack;
import java.util.concurrent.BlockingQueue;

public class WriterThread implements Runnable{

    protected BlockingQueue<String> queue;

    public WriterThread(BlockingQueue<String> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        PrintWriter writer = null;
        try{
            writer = new PrintWriter(new File("output.txt"));
            while(true){
                String buffer = queue.take();
                if(buffer.equals("EOF")){
                    break;
                }
                String bufferForResult;
                if(buffer.equals(" ") || buffer.equals("")) continue;
                bufferForResult = calculate(buffer);
                writer.write(bufferForResult+"\n");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally{
            writer.close();
        }
    }

    public String calculate(String s){
        String str = new String(s);
        str.replaceAll("\\s+","");
        int result = 0;
        int number = 0;
        int sign = 1;
        char[] array = str.toCharArray();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)) {
                number = 10 * number + (int) (c - '0');
            } else if(c == '+'){
                result += sign * number;
                number = 0;
            } else if(c == '-') {
                result -= sign * number;
                number = 0;
            }
        }
        return s +String.valueOf(result);
    }
}
