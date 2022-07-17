import java.util.*;
/*
The user can enter no more than 10 numbers.  
The program should stop prompting input when the user has entered the 10th number or input a negative value, e.g. -1.  
Then, the program starts to calculate the following statistics.


*/
public class Lab8Ex8 {
    public static void main(String[] args) {
        double sum=0,count=0,data;
        double max,min;
        double[] values=new double[10];
        Scanner kb = new Scanner(System.in);
        for(int i=0; i<values.length; i++){  
            System.out.print("values?");
            data = kb.nextDouble();
            if (data<0)  
                break;
            values[i]= data;
            sum += data;
            count++;
        }
        max=values[0];
        min=values[0];
        for(int i=1;i<count;i++){ 
            if(values[i]>max){
             max=values[i];  }    
            if(values[i]<min){
             min=values[i];  }     } 
        System.out.format("Sum =%.2f\n", sum);
        System.out.format("Mean =%.2f\n", sum/count);
        System.out.println("Max = "+ max);
        System.out.println("Min = "+  min);




    }

}
