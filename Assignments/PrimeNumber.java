package week1.day1.Assignments;

public class PrimeNumber {
	
public static void main(String[] args) {
	int input=5;
	if (input==0 || input==1)
	{
		System.out.println(input+ "is not a prime number");
		}else {
		for (int i=2;i<=input;i++) {
		int reminder=input%i;
		if (reminder==0) {
			System.out.println(input+" is not a prime number");
			break;
		}else {
			System.out.println(input + "is a prime number");
		break;}
		}
	}
}
}