public class Main {
	public static void main(String[] args) {
		int c = 0;
		int n1 = 0;
		int n2 = 1;
		System.out.println(n1);
		System.out.println(n2);
		while (c < 8) {
			int n = n2;
			n2 = n1 + n2;
			n1 = n;
			System.out.println(n2);
			c++;
		}
	}
}