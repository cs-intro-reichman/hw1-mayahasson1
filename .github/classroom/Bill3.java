
public class Bill3 {
	public static void main(String[] args) {
	    String name1 = args[0];
	    String name2 = args[1];
		String name3 = args[2];
		int sum1= Integer.parseInt(args[3]);
		double sum2=Math.ceil(sum1/3);
		System.out.println(name3+", "+name2+"and "+name1+", pay "+sum2+" shekels.");
	}
}
