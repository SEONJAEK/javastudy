package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력
		for(int i=0; i<3; i++) {
			String str = scanner.nextLine();
			String arr[] = str.split(" ");
			Goods good1 = new Goods();
			good1.setName(arr[0]);
			good1.setPrice(Integer.parseInt(arr[1]));
			good1.setCnt(Integer.parseInt(arr[2]));
			goods[i] = good1;
		}
		
		// 상품 출력
		for(int i=0; i<3; i++) {
			System.out.printf("%s(가격:%d원)이 %d개 입고 되었습니다.%n", goods[i].getName(),goods[i].getPrice(),goods[i].getCnt() );
		}
		
		// 자원정리
		scanner.close();
	}
	
	
}
