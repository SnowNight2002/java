import java.util.*;

public class CountDown {
	public static void main(String [] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("? ");
		int num = kb.nextInt();
		countDown(num);//倒數
	}

	public static void countDown(int n) {
        for(int i=n;i>0;i--)
		System.out.print(i +" ");
	}
}
