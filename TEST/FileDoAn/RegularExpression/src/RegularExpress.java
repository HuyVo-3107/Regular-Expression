

public class RegularExpress 
{
	public static void main(String[] args) 
	{
		String s1= "a";
		System.out.println("S1=" + s1);
		boolean match = s1.matches(".");
		System.out.println("KetQuaTest: " + match);
		
		
		String s2= "Nguyen Thanh Phong";
		System.out.println("S1=" +s2);
		boolean match1 = s2.matches(".*");
		System.out.println("KetQuaTest: " + match1);
		
		String split = "s sd q";
		System.out.println("TEXT=" + split);
	      // Khoảng trắng xuất hiện 1 hoặc nhiều lần.
	      // Các ký tự khoảng trắng:  \t\n\x0b\r\f
	      // Kết hợp quy tắc: \s và +
	      String regex = "\\S+";
	      String[] splitString = split.split(regex);
	      System.out.println(splitString.length);
	      for (String string : splitString) {
	          System.out.println(string);
	      }
	      /*String newRepley = split.replaceAll("\\s+", "\t");
	      System.out.println("New Text:" + newRepley);*/
	      
	     
	}
}
