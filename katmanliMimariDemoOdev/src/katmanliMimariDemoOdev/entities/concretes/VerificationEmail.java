package katmanliMimariDemoOdev.entities.concretes;

import java.util.Scanner;

public class VerificationEmail {
	
	 public boolean verify(User user){
	        boolean verifyStatus = false;
	        System.out.print("Email adresinizi onayl�yor musunuz?(E/H): ");
	        Scanner scanner = new Scanner(System.in);
	        String result = scanner.nextLine();

	        if (result.equals("E")){
	            System.out.println("Say�n "+ user.getFirstName() +" E-mail adresiniz onayland�!");
	            verifyStatus = true;
	        }
	        else if(result.equals("H")) {
	            System.out.println("Say�n "+ user.getFirstName() +"E-mail adresiniz onaylanamad�!");
	        }
	        else{
	            System.out.println("E veya H de�erini giriniz!");
	        }

	        if (verifyStatus){
	            user.setEmailStatus(true);
	        }
	        else{
	            user.setEmailStatus(false);
	        }

	        return false;
	    }

}
