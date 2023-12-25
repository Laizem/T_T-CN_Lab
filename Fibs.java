import java.util.Scanner;

public class Fibs{
	public static void main(String args[]){
		Scanner in =new Scanner(System.in);
		int N,n1=0,n2=1,n3,i;
		System.out.println("Enter the number ");
		N=in.nextInt();
		System.out.print("Fibonacci seq: ");
		if(N==0)
			System.out.print(" ");
		else if(N==1)
			System.out.print(" "+n1);
		else if(N==2)
			System.out.print(" "+n1+" "+n2+" ");
		else{
			System.out.print(" "+n1+" "+n2+" ");
			for(i=2;i<N;i++){
				n3=n1+n2;
				System.out.print(n3+" ");
				n1=n2;
				n2=n3;
			}
		}
	}
}
