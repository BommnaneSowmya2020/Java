package corejava;

public class StringReg {

	public static void main(String[] args) {
		String name = "Sowmya";
		String regexName ="[A-Z]{1}[a-z]{3,}";
		System.out.println(name.matches(regexName));
		
		String mobile = "9704975514";
		String regexMobile = "[7-9][0-9]{9}";
				System.out.println(mobile.matches(regexMobile));
				
				String mail = "Sowmyareddy337@gmail.com";
				String regexMail ="[A-Za-z0-9]+@[a-z0-9.+]{2,}$";
				System.out.println(mail.matches(regexMail));
				
				String credit ="1234567890123456";
				String regexCredit = "[0-9]{16}";
				System.out.println(credit.matches(regexCredit));
		


	}

}
