import java.util.Scanner;
class Frame{
	int frameno;
	String data;
}
public class FrameSort{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Frames : ");
		int n = sc.nextInt();
		System.out.println("Enter the Frame Details");
		Frame frames[] = new Frame[n];
		for(int i=0;i<n;i++){
			frames[i]=new Frame();
			System.out.print("Enter Frame Number : ");
			frames[i].frameno = sc.nextInt();
			System.out.print("Enter Frame Data : ");
			frames[i].data = new String();
			frames[i].data = sc.next();
		}
		sortframe(frames,n);
		System.out.println("Sorted Frames");
		for (Frame f : frames){
			System.out.println(f.frameno+" | "+f.data);
		}
	}
	static void sortframe(Frame frames[], int n){
		Frame temp = new Frame();
		int exec=0;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(frames[j].frameno>frames[j+1].frameno){
					exec=1;
					temp = frames[j];
					frames[j]=frames[j+1];
					frames[j+1]=temp;
				}
			}
			if(exec==0)
				break;
		}
	}
}

