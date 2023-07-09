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
	}
	public int addition(String[] list) {
		int sum = 0;
		StringBuilder stringBuilder = new StringBuilder();
		for(String item:list) {
			if(Integer.parseInt(item)<0) {
				{
					if(stringBuilder.toString().equals("")) {
						stringBuilder = new StringBuilder(Integer.parseInt(item));
					} 
					else stringBuilder.append(",").append(Integer.parseInt(item));
				}
			}
			if(Integer.parseInt(item)>0) {
				sum +=Integer.parseInt(item);
			}
			if(!stringBuilder.toString().equals("")) {
				throw new IllegalArgumentException("Negatives not allowed: "+stringBuilder);
			}
		}
		return sum;
	}
	public String[] divideNumbers(String numbers, String delimiter) {
		return numbers.split(delimiter);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
