import java.util.Scanner;
public class Reversal{
	public static void main(String args[]){
		int n1, rev=0, temp;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n1=in.nextInt();
		while(n1 != 0){
			temp=n1%10;
			rev=rev*10+temp;
			n1/=10;
		}
		System.out.println("Reversed number: "+rev);
	}
}
