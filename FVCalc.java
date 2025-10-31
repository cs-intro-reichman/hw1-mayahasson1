
public class FVCalc {
	public static void main(String[] args){
		int currentValue=Integer.parseInt(args[0]);
		double rate=Double.parseDouble(args[1]);
		rate= (rate/100)+1;
		int year=Integer.parseInt(args[2]);
		double futureValue = currentValue*(Math.pow(rate,year));
		System.out.println((int) futureValue);
	}
}