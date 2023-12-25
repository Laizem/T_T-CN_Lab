import java.util.Scanner;

public class ASCII{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char ch = in.next().charAt(0);
		int ascii=(int)ch;
		System.out.println("ASCII value of "+ch+" is: "+ascii);
	}
}
