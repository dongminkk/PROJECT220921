package wk2;
//2017038093 김동민
public class ex_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			try {
				sum += Integer.parseInt(args[i]);
			} catch (NumberFormatException e) {
				continue;
			}
		}
		System.out.println(sum);
	}

}
