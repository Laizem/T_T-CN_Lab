import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        List<int[]> frameList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Frames >> ");
        int n = scanner.nextInt();

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int seqNum = random.nextInt(10000) + 1;
            System.out.print("Enter the data for " + (i + 1) + "th frame >> ");
            int data = scanner.nextInt();
