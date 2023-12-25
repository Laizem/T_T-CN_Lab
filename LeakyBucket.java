import java.util.Scanner;

public class LeakyBucket{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the no.of packets: ");
		int n= sc.nextInt();

		System.out.println("Enter the size of the bucket: ");
		int bsize= sc.nextInt();
		
		System.out.println("Enter the output rate: ");
		int outrate=sc.nextInt();
		
		System.out.println("Enter the size packets in order: ");
		int packets[]=new int[n];
		for(int i=0;i<n;i++)	packets[i]=sc.nextInt();
		int remains=0;
		
		for(int i=0;i<n;i++){
			if(packets[i]<=bsize){
				if(packets[i]+remains <= outrate){
					remains=0;
					System.out.println("Packet of size "+(packets[i]+remains)+" transmitted");
				}else{
					remains=packets[i]-outrate;
					System.out.println("Packet of size "+(packets[i]-remains)+" transmitted");
				}
			}else{
				System.out.println("Packet of size "+packets[i]+" dropped");
				if(remains!=0){
					if(remains<=outrate){
						System.out.println("Packet of size "+remains+" transmitted");
						remains=0;
					}else{
						System.out.println("Packet of size "+outrate+" transmitted");
						remains-=outrate;
					}
				}
			}
		}
	}
}
