package sessionNotes;

public class MathOperation {
	public static void main(String[] args) {

		System.out.println(10 / 2);
		System.out.println(9 / 2);// 4

		System.out.println(9.0 / 2); //4.5
		System.out.println(9 / 2.0); //4.5
		System.out.println(9.0 / 2.0);//4.5

		// System.out.println(9/0);//AE
		System.out.println(0 / 9);// 0
		System.out.println(0 / 1);//0

		System.out.println(9 / 0.0);// Infinity
		System.out.println(9.0 / 0);// Infinity
		System.out.println(9.0 / 0.0);// Infinity
		// System.out.println(0/0);//AE
		System.out.println(0.0 / 0.0);// NaN - not a number
		System.out.println(0.0 / 0);// NaN
		System.out.println(0 / 0.0);// NaN

		System.out.println(100 / 0.0);// Infinity

		System.out.println(10 % 2);//0
		System.out.println(9 % 2);//1

		System.out.println(9.2 % 2);//1.99999999999993

	}
}
