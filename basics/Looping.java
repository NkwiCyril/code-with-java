package basics;

public class Looping {
	public static void main(String[] args) {
		int i = 0;
		int j;
		int k = 0;

		// while loop
		while (i < 5) {
			System.out.print(i + "\t");
			i++;
		}

		// for loop
		for (j = 0; j < 5; j++) {
			System.out.println("Working with loops in Java");
		}

		// do-while loop
		do {
			System.out.println("this is a do-while loop");
			k++;
		} while (k < 7);

		// nested loop (for)
		for (i = 1; i <= 12; i++) {
			for (j = 1; j <= 12; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
				if (j == 12) {
					System.out.println();
				}
			}
		}

		// the for-each looping mechanism
		// it used excusively to loop through arrays (meaning it is the best and most efficient way)

		String[] cars = {"benz", "ferrari", "toyota","volkswagen"};

		for (String string : cars) { 
			// this loop says:
				// for each string encountered upon looping in the cars array, print out that string/car
			System.out.println(string);
		}
	}
}
