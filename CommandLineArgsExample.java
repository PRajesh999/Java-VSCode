public class CommandLineArgsExample {
    	public static void main(String[] args) {
		System.out.println(args.length);
		int a = Integer.parseInt(args[0]); // 10 --> "10"
		int b = Integer.parseInt(args[1]);
		System.out.println(a * b);

		// java CommandLineArgsExample 10 20 --> 2 200

	}

}