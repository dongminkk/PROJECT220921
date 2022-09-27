package wk2;
//2017038093 김동민
import java.util.Scanner;

public class ex_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		char c = s.charAt(0);
		for (char j = c; j >= 'a'; j--) {
			for (char i = 'a'; i <= c; i++) {
				System.out.print(i);
			}
			c--;
			System.out.println();
		}
		scanner.close();
	}
}
