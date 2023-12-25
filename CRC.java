sem5c2@servercse:~/Pratham/CRC$ 
import java.util.Scanner;

public class CRC{
	public static String crcfn (String data){
		int polynomial = 0x1021;
		int crc = 0xFFFF;
		for (char c : data.toCharArray()){
			int byteValue = (int) c;
			crc ^= (byteValue << 8) & 0xFFFF;
			for(int i=0;i<8;i++){
				if((crc & 0x8000)!=0)
					crc = (crc<<1)^polynomial;
				else
					crc <<= 1;
			}
			crc &= 0xFFFF;
		}
		return Integer.toString(crc);
	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		//Sender Side
		System.out.print("Enter Data : ");
		String data = sc.nextLine().trim();
		String crc = crcfn(data);
		String sentData = data+crc;
		System.out.println("Transmitted Data : "+sentData);
		
              int crc = 0xFFFF;
                for (char c : data.toCharArray()){
                        int byteValue = (int) c;
                        crc ^= (byteValue << 8) & 0xFFFF;
                        for(int i=0;i<8;i++){
                                if((crc & 0x8000)!=0)
                                        crc = (crc<<1)^polynomial;
                                else
                                        crc <<= 1;
                        }
                        crc &= 0xFFFF;
                }
                return Integer.toString(crc);
        }
        public static void main(String []args){
                Scanner sc = new Scanner(System.in);
                //Sender Side
                System.out.print("Enter Data : ");
		//Received Data
		System.out.print("Enter Received Data : ");
		String receivedData = sc.nextLine().trim();
		String receivedMessage = receivedData.substring(0,receivedData.length()-5);
		String receivedCRC = receivedData.substring(receivedData.length()-5);
		String checkCRC = crcfn(receivedMessage);
		if(checkCRC.equals(receivedCRC))
			System.out.println("Data is Intact\nReceived Message : "+receivedMessage);
		else
              int crc = 0xFFFF;
                for (char c : data.toCharArray()){
                        int byteValue = (int) c;
                        crc ^= (byteValue << 8) & 0xFFFF;
                        for(int i=0;i<8;i++){
                                if((crc & 0x8000)!=0)
                                        crc = (crc<<1)^polynomial;
                                else
                                        crc <<= 1;
                        }
                        crc &= 0xFFFF;
                }
                return Integer.toString(crc);
        }
        public static void main(String []args){
                Scanner sc = new Scanner(System.in);
                //Sender Side
                System.out.print("Enter Data : ");
			System.out.println("Data Corrupted\nMessage Discarded");
	}
}

