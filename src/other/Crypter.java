package other;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Crypter extends Thread {
	
	private final static char[] HEX = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D',
			'E', 'F' };

	private static void scan() throws UnsupportedEncodingException {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your text (use \"!\" in before comand's name):");
		StringBuilder textResult = new StringBuilder();

		while (scan.hasNextLine()) {
			String textStop = scan.nextLine();
			textResult.append(textStop + "\n");
			if (textStop.equals("!exit")) {
				break;
			} else if (textStop.equals("!help")) {
				System.out.println(
						new String(read("0A2A49742069732073696D706C65206D657373656E67657220696E20456E676C697368"
								+ "0A2A546F20636F6E74696E756520746861742077726974652022686F7720697420776F726B73"
								+ "222E0A2A546F20657869742070726F6772616D206A7573742077726974652022657869742220"
								+ "6F722077616974203130206D696E206F7220657869742065636C697063652D776F726B737061"
								+ "6365")));

				textResult.delete(0, textResult.length());
			} else if (textStop.equals("!how it works")) {
				System.out.println(
						new String(read("0A546F2067656E6572617465206D657373656E67650A2D20707265737320656E746572"
								+ "20616E642077726974652022636F6E766572742220616E6420707265737320656E7465720A2D"
								+ "20636F70792074686520726573756C7420616E642073656E640A0A0A546F2072656164206D65"
								+ "73736567650A2D20696E7365727420746865206D6573736567650A2D20707265737320656E74"
								+ "657220616E6420777269746520227265616422")));
				textResult.delete(0, textResult.length());

			} else if (textStop.equals("!convert")) {
				System.out.println(convert(textResult.toString().replaceAll("!.+|^.+\\s+?[^\\w]", "").getBytes("UTF-8")));
				textResult.delete(0, textResult.length());

			} else if (textStop.equals("!read")) {
				System.out.println(new String(read(textResult.toString().replaceAll("!.+|^.+\\s+\\b", ""))));
				textResult.delete(0, textResult.length());
			}
		}
	}

	public static String convert(byte[] byteArray) {
		StringBuffer hexBuffer = new StringBuffer(byteArray.length * 2 - 2);
		for (int i = 0; i < byteArray.length - 2; i++)
			for (int j = 1; j >= 0; j--)
				hexBuffer.append(HEX[(byteArray[i] >> (j * 4)) & 0xF]);
		return hexBuffer.toString();
	}

	public static byte[] read(String s) {
		byte[] r = new byte[s.length() / 2];
		for (int i = 0; i < r.length; i++) {
			int digit1 = s.charAt(i * 2), digit2 = s.charAt(i * 2 + 1);
			if (digit1 >= '0' && digit1 <= '9')
				digit1 -= '0';
			else if (digit1 >= 'A' && digit1 <= 'F')
				digit1 -= 'A' - 10;
			if (digit2 >= '0' && digit2 <= '9')
				digit2 -= '0';
			else if (digit2 >= 'A' && digit2 <= 'F')
				digit2 -= 'A' - 10;
			if ((byte) ((digit1 << 4) + digit2) < 0) {
				break;
			}
			r[i] = (byte) ((digit1 << 4) + digit2);
		}
		return r;
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
		Crypter mess = new Crypter();
		mess.setDaemon(true);
		mess.start();
		mess.join(600000);
		System.err.println("Program was stopped");
	}
}
