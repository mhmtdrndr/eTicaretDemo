package katmanliMimariDemoOdev.entities.concretes;

import java.util.Scanner;

public class VerificationEmail {
	
	 public boolean verify(User user){
	        boolean verifyStatus = false;
	        System.out.print("Email adresinizi onaylýyor musunuz?(E/H): ");
	        Scanner scanner = new Scanner(System.in);
	        String result = scanner.nextLine();

	        if (result.equals("E")){
	            System.out.println("Sayýn "+ user.getFirstName() +" E-mail adresiniz onaylandý!");
	            verifyStatus = true;
	        }
	        else if(result.equals("H")) {
	            System.out.println("Sayýn "+ user.getFirstName() +"E-mail adresiniz onaylanamadý!");
	        }
	        else{
	            System.out.println("E veya H deðerini giriniz!");
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
