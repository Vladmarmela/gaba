package a3d5;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
	
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.print("Enter num: ");
			int num = scan.nextInt();
			nums.add(num);
		}
		int sum=0;
		for(int i=0;i<nums.size();i++) {
			if(nums.get(i) == 0) {
				for(int j=i+1;j<nums.size();j++) {
					if(nums.get(j) == 0) {
						break;
					}
					sum = sum + nums.get(j);
				}
				break;
			}
		}
		System.out.printf("Result is: %s",sum);
	}

}
