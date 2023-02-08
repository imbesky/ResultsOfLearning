package practice1;

public class BinaryCalculation {

	public static void main(String[] args) {
		int PNum = 0B00000000000000000000000001111011;
		int NNum = 0B11111111111111111111111110000101;
		int sum = PNum + NNum;
		int why = 0B11111110;
		
		System.out.println(PNum);
		System.out.println(NNum);
		System.out.println(sum);
		System.out.println(why);

	}

}
