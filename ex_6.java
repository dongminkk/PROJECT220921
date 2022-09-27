package wk2;
//2017038093 김동민
import java.util.Scanner;

public class ex_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unit = { 50000, 10000, 1000, 100, 10, 1 };
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int n = scanner.nextInt();

		for (int i = 0; i < unit.length; i++) {
			System.out.printf("%d 원 짜리 : %d개 \n", unit[i], n / unit[i]);
			n = n - (n / unit[i]) * unit[i];
		}

		scanner.close();

	}
}
