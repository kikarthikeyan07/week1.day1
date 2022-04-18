package week1.day1.Assignments;
public class FibonacciSeries {
	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		System.out.println(first);
		System.out.println(second);
		for (int i=1; i<=10;i++) {
			int fibo=first+second;
			first = second;
			second = fibo;
			System.out.println(fibo);
		}
	}
}