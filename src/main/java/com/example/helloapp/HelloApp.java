public class helloapp {
	public static void main(string[] args) {
		string name ="world";
		if(args.lenth > 0 ) {
			StringBuilder nameBuilder = new StringBuilder();
			for (int i = 0; i < args.lenth; i++) {
				nameBuilder.append(args[i]);
				if(i < args.length - 1) {
					nameBuilder.append(",");
				}
			}
			name=nameBuilder.toString();
		}
		System.out.println("hello, " + name + "!");
	}
}