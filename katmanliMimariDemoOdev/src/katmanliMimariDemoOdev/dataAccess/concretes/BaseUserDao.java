package katmanliMimariDemoOdev.dataAccess.concretes;

import java.util.List;

import katmanliMimariDemoOdev.dataAccess.abstracts.UserDao;
import katmanliMimariDemoOdev.entities.concretes.User;

public class BaseUserDao implements UserDao {
	@Override
    public void addUser(User user) {
        users.add(user);
        System.out.println("Kullan�c� Ekleme ��lemi Ba�ar�l�!");

    }

    @Override
    public void deleteUser(User user) {
        users.remove(user);
        System.out.println("Kullan�c� Silme ��lemi Ba�ar�l�!");
    }

    @Override
    public List<User> getAll() {
        return users;
    }
}
