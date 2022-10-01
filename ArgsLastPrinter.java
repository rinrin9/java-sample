public class ArgsLastPrinter {
	public static void main(String[] args) {
		int i = args.length;
		if (args.length == 0) {
			System.out.println("なし");
		} else {
			System.out.println(args[i - 1]);
		}
	}
}