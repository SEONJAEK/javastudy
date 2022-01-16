package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int number = scanner.nextInt();
		
		int num2 = number/2;
		int result = 0;
		if(number%2==0) {
			for(int i=0; i<=num2; i++) {
				result+=2*i;
			}
		}else {
			for(int i=0; i<=num2; i++) {
				result += 2*i+1;
			}
		}
		System.out.println("결과 값 :"+result);
		scanner.close();
	}
}
