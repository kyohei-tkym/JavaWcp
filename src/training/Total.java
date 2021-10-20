package training;

public class Total {
	public static void main(String[] args) {
		//1から100までの和
		int total = 0;
		for (int i = 1; i <= 100; i++) {
			total += i;
		}
		System.out.println(total);
		
		//1から100までの偶数の和
		int evenTotal = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evenTotal += i;
			}
		}
		System.out.println(evenTotal);
	}
}
