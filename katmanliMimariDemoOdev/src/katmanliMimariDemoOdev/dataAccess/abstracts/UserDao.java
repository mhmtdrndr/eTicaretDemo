package katmanliMimariDemoOdev.dataAccess.abstracts;

import java.util.ArrayList;
import java.util.List;

import katmanliMimariDemoOdev.entities.concretes.User;

public interface UserDao {
    void addUser(User user);
    void deleteUser(User user);

    ArrayList<User> users = new ArrayList<>();
    List<User> getAll();
}
