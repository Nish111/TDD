package d090723;

import org.junit.Test;

public class Main {
	@Test
	int add(String numbers) {
		if(numbers.isEmpty()) return 0;
		if(numbers.length()<2) return Integer.parseInt(numbers);
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
