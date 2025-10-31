
public class Bill3 {
	public static void main(String[] args) {
	    String name1 = args[0];
	    String name2 = args[1];
		String name3 = args[2];
		double sum1= Double.parseDouble(args[3]);
		sum1=sum1/3;
		double sum2=Math.ceil(sum1);
		System.out.println(name3+", "+name2+", "+name1+", pay "+sum2+" shekels.");
	}
}
