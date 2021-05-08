package katmanliMimariDemoOdev.business.concretes;

import katmanliMimariDemoOdev.business.abstracts.UserService;
import katmanliMimariDemoOdev.dataAccess.abstracts.UserDao;
import katmanliMimariDemoOdev.entities.concretes.User;
import katmanliMimariDemoOdev.entities.concretes.UserCheck;
import katmanliMimariDemoOdev.entities.concretes.UserEmailControl;
import katmanliMimariDemoOdev.entities.concretes.VerificationEmail;

public class UserManager implements UserService {
	private UserCheck userCheck;
    private UserDao userDao;
    private UserEmailControl emailControl;
    private VerificationEmail verificationEmail;

    public UserManager(UserCheck userCheck, UserDao userDao, UserEmailControl emailControl, VerificationEmail verificationEmail) {
        this.userCheck = userCheck;
        this.userDao = userDao;
        this.emailControl = emailControl;
        this.verificationEmail = verificationEmail;
    }

    @Override
    public void signIn(String email, String password) {
        boolean signInStatus = false;

        for (int i=0; i<userDao.users.size(); i++){
            if (userDao.users.get(i).getEmail().equals(email) &&
                userDao.users.get(i).getPassword().equals(password)) {

                signInStatus = true;
                break;
            }
        }
        if (signInStatus){
            System.out.println("Ba�ar�yla giri� yap�ld�!");
        }
        else {
            System.out.println("E-mail veya Parola hatal�!");
        }
    }

    @Override
    public void signUp(User user) {

        String email = user.getEmail();
        String fName = user.getFirstName();
        String lName = user.getLastName();
        String uName = user.getUsername();
        String password = user.getPassword();

        if (emailControl.isValid(email)){
            System.out.println("Sisteme kay�tl� e-mail!");

        }
        else {
            if (userCheck.checkEmail(email) &&
                    userCheck.checkPassword(password) &&
                    userCheck.checkFirstName(fName) &&
                    userCheck.checkLastName(lName) &&
                    userCheck.checkUserName(uName)){

                    userDao.addUser(user);
                
            }
        }

    }
}
