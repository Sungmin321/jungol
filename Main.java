package jungol;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[] arr = {'J', 'U', 'N', 'G', 'O', 'L'};

		for (int i = 0 ; i<arr.length ; i++) {
			boolean flag =false;
			String st = s.next();
			i = 0;
			
			for(int j = 0 ; j <arr.length ; j++) {
				if (arr[j] == st.charAt(0)) {
					System.out.print(j);
					flag = !flag;
				}
			}
			if (flag == true) {//출력했을때
				continue;
			}else if (flag == false) {
				System.out.println("none");
				break;
			}
		}

		s.close();


	}
}