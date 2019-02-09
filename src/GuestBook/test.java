package GuestBook;

public class test {
	public static void main(String[] args) {
		String[] cities = {"San Diego", "Tijuana", "Los Angeles"};
		cities[3] = "San Francisco";
		for (int j = 0; j < cities.length; j++) {
			System.out.println(cities[j]);
		}
	}
}
