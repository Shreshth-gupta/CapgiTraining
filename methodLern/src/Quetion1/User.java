package Quetion1;

import java.util.HashMap;

public class User implements IValidate{
    HashMap<String, String> users = new HashMap<>();

    @Override
    public boolean IsAuthenticated(String userId, String password) {
        return users.containsKey(userId) && users.get(userId).equals(password);
    }

    public void addUser(String id, String pass) {
        users.put(id, pass);
    }
}
