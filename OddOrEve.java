import java.util.Scanner;
public class OddOrEve{
	public static void main(String args[]){
		int n1;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number: ");
		n1=in.nextInt();
		if(n1%2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}
