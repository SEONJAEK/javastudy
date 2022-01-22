package prob5;

public class Prob5 {
	public static void main(String[] args) {

		for (int i = 1; i <= 99; i++) {
			String a = String.valueOf(i);
			String arr[] = a.split("");
			int cnt = 0;

			for (int j = 0; j < arr.length; j++) {
				if (arr[j].equals("3") || arr[j].equals("6") || arr[j].equals("9")) {
					cnt++;
				}
			}
			if (cnt == 0) {
				continue;
			} else {
				System.out.print(i + " ");
				for (int n = 0; n < cnt; n++) {
					System.out.printf("짝");
				}
				System.out.println();
			}
		}
	}

}