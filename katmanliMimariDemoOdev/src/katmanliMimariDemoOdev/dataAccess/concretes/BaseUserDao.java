package katmanliMimariDemoOdev.dataAccess.concretes;

import java.util.List;

import katmanliMimariDemoOdev.dataAccess.abstracts.UserDao;
import katmanliMimariDemoOdev.entities.concretes.User;

public class BaseUserDao implements UserDao {
	@Override
    public void addUser(User user) {
        users.add(user);
        System.out.println("Kullanýcý Ekleme Ýþlemi Baþarýlý!");

    }

    @Override
    public void deleteUser(User user) {
        users.remove(user);
        System.out.println("Kullanýcý Silme Ýþlemi Baþarýlý!");
    }

    @Override
    public List<User> getAll() {
        return users;
    }
}
