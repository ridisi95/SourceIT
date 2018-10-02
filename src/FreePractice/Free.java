package FreePractice;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Free {
	
	
	public static void main(String []args) throws UnsupportedEncodingException {
		
		String str = "4a";
//		
//		System.out.println(str.getBytes("Cp1047"));

//		ByteBuffer byteBuffer = Charset.forName("UTF-8").encode(str);
//		System.out.println(byteBuffer);
		
		
//		byte[] ptext = str.getBytes("ISO-8859-1"); 
//		String value = new String(ptext, "UTF_8");
		
		
		String str1 = new String(str.getBytes(),"cp1047");
		String str2 = new String(str1.getBytes(),"UTF-8");
		
		System.out.println(str1);
		System.out.println(str2);
	}
	
	
//	public static void main(String[] args) throws UnsupportedEncodingException {
//String reqMsg = "ISO0150000150800C220000080000000040000050000000215102190000000014041615141800001427690161 0B0    000123450041234";
//char[] hexed = getHex(reqMsg, "UTF-8", "Cp1047");
//
//System.out.println(hexed);
//
//System.out.println(getString(hexed));
//}
//
//public static char[] getHex(String source, String inputCharacterCoding,
//    String outputCharacterCoding) throws UnsupportedEncodingException {
//return Hex.encodeHex(new String(source.getBytes(inputCharacterCoding),
//        outputCharacterCoding).getBytes(), false);
//}
//
//public static String getString(char[] source),
//    UnsupportedEncodingException {
//return new String(Hex.decodeHex(source), Charset.forName("UTF-8"));
//}
	
	
}

