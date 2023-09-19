package basics;

public class Array {

	static void details(int index, String[] phones, String[] model, String[] origin) {
		System.out.println("Smartphone: " + phones[index]);
		System.out.println("Latest Model: " + model[index]);
		System.out.println("Country or State or Origin: " + origin[index] + "\n");
	}

	static String[] phones = {
			"Google Pixel",
			"iPhone",
			"Redmi",
			"OnePlus",
			"Motorolla",
			"Infinix",
			"Samsung"
	};
	static String[] model = {
			"7 Pro",
			"15 Pro Max",
			"Note 15",
			"10 Pro",
			"5 GenX",
			"Hot 30i",
			"Galaxy Z-Fold 5"
	};
	static String[] origin = {
			"California",
			"USA",
			"China",
			"Shenzhen",
			"Chicago",
			"China",
			"South Korea"
	};

	public static void main(String[] args) {

		System.out.println("Below are a list of smartphones, latest models and origin: " + "\n");
		int index;
		for (index = 0; index < phones.length; index++) {

			details(index, phones, model, origin);

		}

		// Multi-dimensional array

		int[][] arrayNum = { { 1, 2, 3, 4 }, { 1, 1, 2, 4 }, { 1, 2, 3, 5 } };
		// Oth array 1st position in 0th array
		// | |
		System.out.println(arrayNum[0][1]);

		for (int i = 0; i < arrayNum.length; i++) {
			for (int j = 0; j < arrayNum[i].length; j++) {
				// print out all elements of the arrayNum
				System.out.println(arrayNum[i][j]);
			}
			System.out.println();
		}

	}

}