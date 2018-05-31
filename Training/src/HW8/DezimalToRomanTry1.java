package HW8;

public class DezimalToRomanTry1 {
	public static String decimal2Roman(int n) {

		String[] arr = { "I", "V", "X", "L", "C" };

		String j = "";
		String v = "";
		String x = "";
		String l = "";
		String c = "";
		
		
		
//		String result = c + l + x + v + j;
		
		int count = 0;

		for (int i5 = 0; i5 < 1; i5++) {

			for (int i4 = 0; i4 < 1; i4++) {
				for (int i3 = 0; i3 < 1; i3++) {
					
//					System.out.println("i3" + i3);
					
//					if(i3 == 1) {
//						y = arr[2];
//					}

					for (int i2 = 0; i2 < 2; i2++) { // i2 0 - count 0; i2 1 - count 5;
				
						if(i2 == 1) {
							
							j = "";
							v = arr[1];}
						
						for (int i1 = 0; i1 < 4; i1++) {

							// System.out.println("i5" + i5);
							// System.out.println("i4" + i4);
							// System.out.println("i3" + i3);
							// System.out.println("i2" + i2);
							// System.out.println("i1" + i1);

							if (n == count) { // i1 0 - count 0; i1 1 - cou 1; i1 2 cou 2;
								String result = c + l + x + v + j; 
								return result;		//i2 2 i1 0 - c 5; i1 - c 6; i1 c 7; i1 c 8
							}
							count++;

							j += arr[0]; // i1 0 - y I; i1 1 - y II; i1 2 y III;

							if (i1 == 3) {
								j = arr[0];
							}
							
						}

						v = j + arr[1];
						count++;
						System.out.println("i2" + v);		
					
					}
//					y += arr[2];
//					count++;
				}
			}
		}
		return "мимио";

		// for (int i = 0; i < n; i++) {
		// y = (y.equals("IIII")) ? I : y + I;
		// if (n > 3 && i > 3) {
		// }
		// }
	}

	// public static int roman2Decimal(String s) { }

	public static void main(String[] args) {

		int n = 4;

		System.out.println(DezimalToRomanTry1.decimal2Roman(n));

	}
}
