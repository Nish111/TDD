package d090723;

public class Main {

	public int add(String numbers) {
		if(numbers.isEmpty()) return 0;
		if(numbers.length()<2) return Integer.parseInt(numbers);
		else {
			String delimiter = ",";
			if(numbers.matches("//(.*)\n(.*)")) {
				delimiter = Character.toString(numbers.charAt(2));
				numbers = numbers.substring(4);
			}
			String[] list = divideNumbers(numbers, delimiter +"|\n");
			return addition(list);
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
