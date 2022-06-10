package jungol;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = new int[10];

		for (int i = 0 ; i<arr.length ; i++) {
			arr[i] = s.nextInt();
		}
		s.close();

		int esum = 0 ,vsum = 0, count = 0;

		for(int i = 1 ; i<=arr.length ; i++) {

			if (i % 2 == 0) { // Â¦¼ö¸é
				esum += arr[i-1];
			}else {
				vsum += arr[i-1];
				count++;
			}
		}

		System.out.println("sum : "+esum);
		System.out.printf("avg : %.1f", vsum/(double)count);
	}
}