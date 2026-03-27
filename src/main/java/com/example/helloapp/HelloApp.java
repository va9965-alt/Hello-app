public class helloapp {
	public static void main(string[] args) {
		string name = "world";
		if(args.lenth > 0 ) {
			name =args[0];
		}
		System.out.println("hello, " + name + "!");
	}
}