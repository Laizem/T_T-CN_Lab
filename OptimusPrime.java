import java.util.Scanner;

public class OptimusPrime{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n1,flag=0;
		System.out.print("Enter a number: ");
		n1=in.nextInt();
		for(int i=2;i<=n1/2;i++){
			if(n1%i == 0){
				flag=1;
				break;
			}
		}
		if(flag!=1)
			System.out.println(n1+" is a prime no.");
		else
			System.out.println(n1+" is not a prime no.");
	}
}
