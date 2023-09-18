package basics;

public class Array {

	public static void main(String[] args) {

		String[] phones = {
				"Google Pixel",
				"iPhone",
				"Redmi",
				"OnePlus",
				"Motorolla",
				"Infinix",
				"Samsung"
		};
		String[] model = {
				"7 Pro",
				"15 Pro Max",
				"Note 15",
				"10 Pro",
				"5 GenX",
				"Hot 30i",
				"Galaxy Z-Fold 5"
		};
		String[] origin = {
				"California",
				"USA",
				"China",
				"Shenzhen",
				"Chicago",
				"China",
				"South Korea"
		};

		System.out.println("Below are a list of smartphones, latest models and origin: " + "\n");

		int index;
		for (index = 0; index < phones.length; index++) {

			System.out.println("Smartphone: " + phones[index]);
			System.out.println("Latest Model: " + model[index]);
			System.out.println("Country or State or Origin: " + origin[index] + "\n");

		}

	}

}