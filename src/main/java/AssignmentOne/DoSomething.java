package AssignmentOne;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Random;
import java.util.Scanner;

public class DoSomething {

    public DoSomething() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number or 'q' to quit");
        try {
            String input = sc.nextLine();
            if (input.equals("q") || input.equals("Q")){
                System.out.println("This is the quit message");
                System.exit(0);
            } else {
                int inputNum = Integer.parseInt(input);
                if(inputNum > 0){
                    int count = 0;
                    while(count < inputNum){
                        doSomething(inputNum);
                        count++;
                    }
                } else{
                    System.out.println("This is the error message: input larger than 0 is needed");
                }
            }
        } catch (Exception e){
            System.out.println("Invalid input entered");
        }
        sc.close();
    }

    public void doSomething(int inputNum){
        //randomly perform one of the four methods.
        int min = 1;
        int max = 4;
        Random random = new Random();
        int value = random.nextInt(max + min) + min;
        if(value == 1){
            int result = getSum(inputNum);
            System.out.println("getSum() was performed, sum 1 to "+inputNum+" is "+result);
        } else if(value == 2){
            String timeStamp = getTimeStamp();
            System.out.println("getTimeStamp() was performed, current timestamp is "+timeStamp);
        } else if(value == 3){
            System.out.println("createFile() was performed");
            createFile(inputNum);
        } else{
            //"do something reasonable" -
            int resultNum = getSquare(inputNum);
            System.out.println("getSquare() was performed, result is "+resultNum);
        }
    }

    public int getSum(int inputNum){
        int sum = 0;
        for(int i = 1; i <= inputNum; i++){
            sum += i;
        }
        return sum;
    }

    public String getTimeStamp(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.toString();
    }

    public void createFile(int inputNum){
        try {
            String filename = inputNum+".txt";
            File myObj = new File(filename);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getSquare(int inputNum){
        return inputNum*inputNum;
    }

}
