package FreePractice;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

public class MessengerFull extends Thread {
	
	private final static char[] HEX = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D',
			'E', 'F' };

	private static void scan() throws UnsupportedEncodingException {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your text: \n");
		StringBuilder textResult = new StringBuilder();

		while (scan.hasNextLine()) {
			String textStop = scan.nextLine();
			textResult.append(textStop + "\n");
			if (textStop.equals("!exit")) {
				break;
			} else if (textStop.equals("!help")) {
				System.out.println(
						new String(read("49742069732073696D706C65206D657373656E6765722C20666F72206F757220636F6D"
								+ "6D756E696F6E2E20496620796F752077616E742069742C206F6620636F75727365203A29290A"
								+ "496620796F752077616E7420636F6E74696E756520746861742077726974652022686F772069"
								+ "7420776F726B73222E0A496620796F752077616E7420746F20657869742070726F6772616D20"
								+ "6A75737420777269746520226578697422206F722077616974203130206D696E206F72206578"
								+ "69742065636C697063652D776F726B73706163652E")));

				textResult.delete(0, textResult.length());
			} else if (textStop.equals("!how it works")) {
				System.out.println(
						new String(read("4974277320776F726B7320736F20656173793A0A2D20777269746520796F7572206D65"
								+ "7373656E67650A2D20707265737320656E74657220616E642077726974652022636F6E766572"
								+ "74220A2D20636F70792074686520726573756C7420616E642073656E6420746F206D6520696E"
								+ "20736B79706520776974682061206D657373656E6765")));
				textResult.delete(0, textResult.length());

			} 
//			else if (textStop.equals("!convertToUni")) {
//				System.out.println(Arrays.toString(convertToUni(textResult)));
//				System.out.println(convertToUni(textResult).toString().getBytes());
//				textResult.delete(0, textResult.length());
//
//			} else if (textStop.equals("!readUni")) {
//				System.out.println(readUni(textResult));
//				textResult.delete(0, textResult.length());
//
//			} 
			else if (textStop.equals("!convert") || textStop.equals("!конверт")) {
				System.out.println(convertCharMass(textResult));
				textResult.delete(0, textResult.length());

			} else if (textStop.equals("!read") || textStop.equals("!считать")) {
				System.out.println(read(textResult.toString().replaceAll("!.+|^.+\\s+\\b", "")));
				textResult.delete(0, textResult.length());
			}
		}
	}

	private static String convertCharMass(StringBuilder stringBuilder) {
		String str = stringBuilder.toString().replaceAll("!.+|^.+\\s+\\b", "");
		stringBuilder.delete(0, stringBuilder.length());
//		char[] charMass = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
//			charMass[i] = str.charAt(i);
			stringBuilder.append(Integer.toHexString(str.charAt(i)));
		}
		return stringBuilder.toString();
	}

//	private static String readUni(StringBuilder stringBulider) {
//		String[] stringMass = stringBulider.toString().replaceAll("[\\[\\]]|!\\w+", "").split("\\D+");
//		stringBulider.delete(0, stringBulider.length());
//		int[] numbers = new int[stringMass.length];
//		for (int i = 0; i < stringMass.length && !stringMass[i].equals(""); i++) {
//			if (!stringMass[i].equals("10")) {
//				numbers[i] = Integer.parseInt(stringMass[i]);
//				char ch = (char) numbers[i];
//				stringBulider.append(ch);
//			}
//		}
//		return stringBulider.toString();
//	}

	public static String convert1(byte[] byteArray) {
		StringBuffer hexBuffer = new StringBuffer(byteArray.length * 2 - 2);
		for (int i = 0; i < byteArray.length - 2; i++)
			for (int j = 1; j >= 0; j--)
				hexBuffer.append(HEX[(byteArray[i] >> (j * 4)) & 0xF]);
		return hexBuffer.toString();
	}
	
	public static String convert(char[] charArray) {
		StringBuffer hexBuffer = new StringBuffer(charArray.length * 2 - 2);
		for (int i = 0; i < charArray.length - 2; i++)
			for (int j = 1; j >= 0; j--)
				hexBuffer.append(HEX[(charArray[i] >> (j * 4)) & 0xF]);
		return hexBuffer.toString();
	}

	public static String read(String s) {
		StringBuilder stringbuilder = new StringBuilder(s.length());
		char[] charMass = new char[s.length() / 2];
//		byte[] r = new byte[s.length() / 2];
		for (int i = 0; i < s.length() /2; i++) {
			int digit1 = s.charAt(i * 2), digit2 = s.charAt(i * 2 + 1);
			if (digit1 >= '0' && digit1 <= '9')
				digit1 -= '0';
			else if (digit1 >= 'A' && digit1 <= 'F')
				digit1 -= 'A' - 10;
			if (digit2 >= '0' && digit2 <= '9')
				digit2 -= '0';
			else if (digit2 >= 'A' && digit2 <= 'F')
				digit2 -= 'A' - 10;
			
//			int numberChar = ((digit1 << 4) + digit2);
			if ((char) ((digit1 << 4) + digit2) < 0) {
				break;
			}
//			charMass[i] = (char) ((digit1 << 4) + digit2);
			stringbuilder.append((char) ((digit1 << 4) + digit2));
//			r[i] = (byte) ((digit1 << 4) + digit2);
		}
		return stringbuilder.toString();
	}
	
	@Override
	public void run() {
			try {
				scan();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
	}

	public static void main(String[] args) throws UnsupportedEncodingException, InterruptedException {
		Messenger mess = new Messenger();
		mess.setDaemon(true);
		mess.start();
		mess.join(600000);
		System.err.println("Program was stopped");
	}
}

