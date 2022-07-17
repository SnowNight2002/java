import java.util.Scanner;


public class BINGO {
    public static void main( String[] args ) {
    char[][] p1 = {{24,2,8,1,25},{12,16,7,17,15},{5,6,20,19,13},{14,23,22,4,3},{10,18,11,21,9}}; //play 1
    char[][] p2 = {{24,21,17,15,6},{10,3,8,18,20},{14,7,16,12,5},{25,23,13,19,11},{22,4,9,1,2}}; //play 2
    int[] numbercheck=new int[25]; //check number is repeated or not
    int bingo=0;

   System.out.println("Player1's Card:");  // show play 1
   for(int i=0;i<5;i++){
      for(int j=0;j<5;j++){

          System.out.printf("%3d",(int)p1[i][j]);}
      System.out.println();
   }
   System.out.println();
   System.out.println("Player2's Card:"); // show play 2
   for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
          System.out.printf("%3d",(int)p2[i][j]);}
       System.out.println();
   }
    Scanner input = new Scanner(System.in);  
    for(int g=0;g<25;g++){     // game play start  
      System.out.println("Game Host call (0 to exit):");
      int inputnumber = input.nextInt();  //Game Host call number
      numbercheck[g]=inputnumber;
       for(int rr=0;rr<g;rr++){   //use to check number is not repeated
        if(numbercheck[g]==numbercheck[rr])
         System.out.println(" The number " + inputnumber + " is repeated, please call again!");
         continue;
       }

       if(inputnumber==0) // if Game Host call number 0  will exit
         System.exit(0);
       else if(inputnumber>=26){  // if Game Host call number over 26  will call again
         System.out.println(" The number must be between 1 to 25, please call again!");
         g--;
         continue;}
       else if(inputnumber<=-1){ // if Game Host call number  small than one  will call again
         System.out.println(" The number must be between 1 to 25, please call again!");
         g--;
         continue;}

      System.out.println("Player1's Card:"); //show when Game Host call number, play1 card's
       for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
           int s=p1[i][j];
           if (s==inputnumber){  //if number == Game Host call number, will change number to XX
            p1[i][j] = 0;}  
            int f=p1[i][j];
            if (f==0){
             System.out.printf(" XX");
             continue;
            }
           System.out.printf("%3d",(int)p1[i][j]);
           }
       System.out.println();}
        
      System.out.println("Player2's Card:"); //show when Game Host call number, play2 card's
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
            int s=p2[i][j];
            if (s==inputnumber){  //if number == Game Host call number, will change number to XX
                p2[i][j] = 0;}
                int f=p2[i][j];
                if (f==0){
                System.out.printf(" XX");
                continue;
                }
            System.out.printf("%3d",(int)p2[i][j]);
            }
        System.out.println();}
    
    if((int)p1[0][0]==0 && (int)p1[1][1]==0 && (int)p1[2][2]==0&& (int)p1[3][3]==0&& (int)p1[4][4]==0){
        System.out.println("Player1 Bingo!");
        bingo++;   //check player 1 is bingo or not 
    }
    if((int)p2[0][0]==0 && (int)p2[1][1]==0 && (int)p2[2][2]==0&& (int)p2[3][3]==0&& (int)p2[4][4]==0){
        System.out.println("Player2 Bingo!");
        bingo++;  //check player 2 is bingo or not 
    }
    if((int)p1[0][4]==0 && (int)p1[1][3]==0 && (int)p1[2][2]==0&& (int)p1[3][1]==0&& (int)p1[4][0]==0){
        System.out.println("Player1 Bingo!");
        bingo++;  //check player 1 is bingo or not 
    }
    if((int)p2[0][4]==0 && (int)p2[1][3]==0 && (int)p2[2][2]==0&& (int)p2[3][1]==0&& (int)p2[4][0]==0){
        System.out.println("Player2 Bingo!");
        bingo++;  //check player 2 is bingo or not 
    }
    if((int)p1[0][4]==0 && (int)p1[0][3]==0 && (int)p1[0][2]==0&& (int)p1[0][1]==0&& (int)p1[0][0]==0){
        System.out.println("Player1 Bingo!");
        bingo++;  //check player 1 is bingo or not 
    }
    if((int)p1[1][4]==0 && (int)p1[1][3]==0 && (int)p1[1][2]==0&& (int)p1[1][1]==0&& (int)p1[1][0]==0){
        System.out.println("Player1 Bingo!");
        bingo++;  //check player 1 is bingo or not 
    }    
    if((int)p1[2][4]==0 && (int)p1[2][3]==0 && (int)p1[2][2]==0&& (int)p1[2][1]==0&& (int)p1[2][0]==0){
        System.out.println("Player1 Bingo!");
        bingo++;  //check player 1 is bingo or not 
    }    
    if((int)p1[3][4]==0 && (int)p1[3][3]==0 && (int)p1[3][2]==0&& (int)p1[3][1]==0&& (int)p1[3][0]==0){
        System.out.println("Player1 Bingo!");
        bingo++;  //check player 1 is bingo or not 
    }   
    if((int)p1[4][4]==0 && (int)p1[4][3]==0 && (int)p1[4][2]==0&& (int)p1[4][1]==0&& (int)p1[4][0]==0){
        System.out.println("Player1 Bingo!");
        bingo++;  //check player 1 is bingo or not 
    }    
    if((int)p1[0][4]==0 && (int)p1[1][4]==0 && (int)p1[2][4]==0&& (int)p1[3][4]==0&& (int)p1[4][4]==0){
        System.out.println("Player1 Bingo!");
        bingo++;  //check player 1 is bingo or not 
    }
    if((int)p1[0][3]==0 && (int)p1[1][3]==0 && (int)p1[2][3]==0&& (int)p1[3][3]==0&& (int)p1[4][3]==0){
        System.out.println("Player1 Bingo!");
        bingo++;  //check player 1 is bingo or not 
    }    
    if((int)p1[0][2]==0 && (int)p1[1][2]==0 && (int)p1[2][2]==0&& (int)p1[3][2]==0&& (int)p1[4][2]==0){
        System.out.println("Player1 Bingo!");
        bingo++;  //check player 1 is bingo or not 
    }    
    if((int)p1[0][1]==0 && (int)p1[1][1]==0 && (int)p1[2][1]==0&& (int)p1[3][1]==0&& (int)p1[4][1]==0){
        System.out.println("Player1 Bingo!");
        bingo++;  //check player 1 is bingo or not 
    }   
    if((int)p1[0][0]==0 && (int)p1[1][0]==0 && (int)p1[2][0]==0&& (int)p1[3][0]==0&& (int)p1[4][0]==0){
        System.out.println("Player1 Bingo!");
        bingo++;  //check player 1 is bingo or not 
    }    
    if((int)p2[0][4]==0 && (int)p2[1][4]==0 && (int)p2[2][4]==0&& (int)p2[3][4]==0&& (int)p2[4][4]==0){
        System.out.println("Player2 Bingo!");
        bingo++;  //check player 2 is bingo or not 
    }
    if((int)p2[0][3]==0 && (int)p2[1][3]==0 && (int)p2[2][3]==0&& (int)p2[3][3]==0&& (int)p2[4][3]==0){
        System.out.println("Player2 Bingo!");
        bingo++;  //check player 2 is bingo or not 
    }    
    if((int)p2[0][2]==0 && (int)p2[1][2]==0 && (int)p2[2][2]==0&& (int)p2[3][2]==0&& (int)p2[4][2]==0){
        System.out.println("Player2 Bingo!");
        bingo++;  //check player 2 is bingo or not 
    }    
    if((int)p2[0][1]==0 && (int)p2[1][1]==0 && (int)p2[2][1]==0&& (int)p2[3][1]==0&& (int)p2[4][1]==0){
        System.out.println("Player2 Bingo!");
        bingo++;  //check player 2 is bingo or not 
    }   
    if((int)p2[0][0]==0 && (int)p2[1][0]==0 && (int)p2[2][0]==0&& (int)p2[3][0]==0&& (int)p2[4][0]==0){
        System.out.println("Player2 Bingo!");
        bingo++;  //check player 2 is bingo or not 
    }    
    if((int)p2[0][4]==0 && (int)p2[0][3]==0 && (int)p2[0][2]==0&& (int)p2[0][1]==0&& (int)p2[0][0]==0){
        System.out.println("Player2 Bingo!");
        bingo++;  //check player 2 is bingo or not 
    }
    if((int)p2[1][4]==0 && (int)p2[1][3]==0 && (int)p2[1][2]==0&& (int)p2[1][1]==0&& (int)p2[1][0]==0){
        System.out.println("Player2 Bingo!");
        bingo++;  //check player 2 is bingo or not 
    }    
    if((int)p2[2][4]==0 && (int)p2[2][3]==0 && (int)p2[2][2]==0&& (int)p2[2][1]==0&& (int)p2[2][0]==0){
        System.out.println("Player2 Bingo!");
        bingo++;  //check player 2 is bingo or not 
    }    
    if((int)p2[3][4]==0 && (int)p2[3][3]==0 && (int)p2[3][2]==0&& (int)p2[3][1]==0&& (int)p2[3][0]==0){
        System.out.println("Player2 Bingo!");
        bingo++;  //check player 2 is bingo or not 
    }   
    if((int)p2[4][4]==0 && (int)p2[4][3]==0 && (int)p2[4][2]==0&& (int)p2[4][1]==0&& (int)p2[4][0]==0){
        System.out.println("Player2 Bingo!");
        bingo++;  //check player 2 is bingo or not 
    }    
   if(bingo>=1) //if have player bingo ,end game
    break;






}

  

   
    }}