package a3d4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		Scanner scan =new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.print("Enter num: ");
			int num = scan.nextInt();
			nums.add(num);
		}
		for(int i=0;i<nums.size();i++) {
			System.out.printf("Похiдна з числа %s = 0 \n",nums.get(i));
		}
	}
	
}
