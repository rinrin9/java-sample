public class FizzBuzz {
	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		for (int k = 1; k <= i; k++) {
			if (k % 3 == 0 && k % 5 == 0) {
				System.out.print("FizzBuzz" + " ");
			} else if (k % 5 == 0) {
				System.out.print("Buzz" + " ");
			} else if (k % 3 == 0) {
				System.out.print("Fizz" + " ");
			} else {
				System.out.print(k + " ");
			}
		}

	}
}