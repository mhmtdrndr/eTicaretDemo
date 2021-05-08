package katmanliMimariDemoOdev.entities.concretes;

import katmanliMimariDemoOdev.entities.abstracts.UserCheckManager;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserCheck implements UserCheckManager{

    @Override
    public boolean checkFirstName(String fName) {
        if (fName.length() < 2){
            System.out.println("Ýsminiz 2 karakterden kýsa olamaz!");
            return false;
        }
        return true;
    }

    @Override
    public boolean checkLastName(String lName) {
        if (lName.length() < 2){
            System.out.println("Soyadýnýz 2 karakterden kýsa olamaz!");
            return false;
        }
        return true;
    }

    @Override
    public boolean checkUserName(String uName) {
        String regex = "^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(uName);

        if(matcher.matches()) {
            return true;
        } else {
            System.out.println("Geçersiz bir kullanýcý girdiniz. Tekrar Deneyiniz!");
            return false;
        }
    }

    @Override
    public boolean checkPassword(String password) {
        if (password.length() < 6)
        {
            System.out.println("Parolanýz 6 karakterden kýsa olamaz! Tekrar deneyiniz.");
            return false;
        }
        return true;
    }

    @Override
    public boolean checkEmail(String email) {
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if(matcher.matches()) {
            System.out.println("Geçerli bir e-posta adresi girildi!");
            return true;
        } else {
            System.out.println("Geçersiz bir e-posta adresi girdiniz. Tekrar Deneyiniz!");
            return false;
        }
    }
}
