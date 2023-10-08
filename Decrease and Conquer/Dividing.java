

import java.util.Scanner;

public class Dividing{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int amountOfLogs = input.nextInt();
        int[] logs = new int[amountOfLogs];
        int maximum =-1;
        for(int i =0; i < amountOfLogs; i++){
            logs[i] = input.nextInt();
            if(logs[i]> maximum){
                maximum = logs[i];
            }
        }
        int minimum = input.nextInt();
        input.close();
        
        Search(logs, minimum, maximum,1);

    } 

    public static void Search(int[] logs, int minimum, int maximum, int start){
    
       while(start < maximum){

        int middle = (start+maximum +1)/2;
        int count = caculateMaxLogs(middle, logs);

        if(count >= minimum){
            start = middle;
          
        }

        else 
            maximum = middle -1;
        
       

    }
    System.out.println(start);
        
    }

    

    public  static int caculateMaxLogs(int size,int[] logs){
        int count =0;
        for(int i =0; i < logs.length;i++){
            count += logs[i] / size;
        }
        
        return count;

    }
}