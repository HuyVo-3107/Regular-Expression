

public class Regulax2 
{
	public static void main(String[] args) 
	{
		try
		{
			
			String email= "tuhuy@gmail.com";
			System.out.println("Email:" +email);
			boolean match = email.matches("[a-zA-Z_0-9]{5,}@[a-z]{2,}.[a-z]{3,}");
			boolean match2 = email.matches("[a-zA-Z_0-9]{5,}@[a-z]{2,}.[a-z]{3,}.[a-z]{1,}");
			System.out.println("KEtQua:" + match);
			System.out.println("KetQua2:"  + match2);
			
			if(match==true || match2 == true)
			{
				System.out.println("Email:" +email);
			}
			else
			{
				System.out.println("Sai Dinh Dang Email");
			}
	
		}catch (Exception e) {
			System.out.println("Error. Please check!");
		}
		
		
		//kiem  tra sdt
		try
		{
			String sdt= "01235649810";
			System.out.println("sdt:" + sdt);
			boolean ktra = sdt.matches("[0-9]{10,11}");
			System.out.println("Ket Qua:" +ktra);
			if(ktra==true)
			{
				System.out.println("Sdt:" +sdt);
			}
			else
			{
				System.out.println("Day ko la sdt !!!");
			}
	
		}catch (Exception e) {
			System.out.println("Error. Please check! ");
		}
		
		//kiem tra Text
		try
		{
			String text= "adasdfsafsdf sdfasfdfasf15616165sdfsadfasdfsafsfdasdf";
			System.out.println("text:" + text);
			boolean ktra = text.matches(".*");
			if(ktra==true)
			{
				System.out.println("NoiDung:" +text);
			}
			else
			{
				System.out.println("Ko the lay text !!!");
			}
	
		}catch (Exception e) {
			System.out.println("Error. Please check! ");
		}
		
		//kiem tra jpg, png
		
		try
		{
			String text= "";
			System.out.println("text:" + text);
			boolean ktra = text.matches(".*");
			if(ktra==true)
			{
				System.out.println("Anh:" +text);
			}
			else
			{
				System.out.println("Ko co Images!!!");
			}
	
		}catch (Exception e) {
			System.out.println("Error. Please check! ");
		}
	}
}
