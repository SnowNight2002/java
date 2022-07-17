public class table {
    public static void main(String [ ] args) {
    System.out.print("  ");    
    for(int k=0;k<=9;k++){
     System.out.printf("%3d",k);
}
    System.out.println();

    System.out.print("+");
    for(int k=0;k<=9;k++){
        System.out.print("---");
}
    System.out.println();

    for(int i=0;i<=9;i++){
        System.out.print(i+"|");
        for(int j=0;j<=9;j++){
            System.out.printf("%3d",i*j);

        }

       System.out.println();
    }

    
    
    
    
    }
}
