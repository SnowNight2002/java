package lab18;

public class SumIntegers {
    public static void main(String [] args) {
int total=0;
if (args.length>0){
    for(int i=0;i<args.length;i++){
     System.out.print(Integer.parseInt(args[i])+"+");
     total += Integer.parseInt(args[i]);}
    System.out.print("=" + total);


}
else 
System.out.println("No input!");





    }
}
