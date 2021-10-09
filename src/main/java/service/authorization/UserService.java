package service.authorization;

import model.authorization.User;
import service.base.BaseService;

import java.util.ArrayList;

public class UserService extends BaseService {
    ArrayList<User>  users = new ArrayList<User>();

    public User singIn(String phoneNumber, String password){
        User user = null;
        for (int i = 0; i < users.size()&& (user == null); i++) {
            if(users.get(i)!=null){
                if(users.get(i).getPhoneNumber().equals(phoneNumber)&&users.get(i).getPassword().equals(password))
                    user = users.get(i);
            }

        }
        return user;
    }
    @Override
    public boolean add(Object object, Object object1) {
        User newUser = (User) object;
        boolean isHasUser = false;
        for (int i = 0; i < users.size() && !isHasUser; i++) {
            if(users.get(i)!=null){
                if(users.get(i).getPhoneNumber().equals(newUser.getPhoneNumber()))
                    isHasUser = true;
            }

        }if(!isHasUser)
            users.add(newUser);

        return !isHasUser;
    }

    @Override
    public boolean add(Object object) {
        return false;
    }

    @Override
    public boolean edit(Object object) {
        return false;
    }

    @Override
    public boolean delete(Object object) {
        return false;
    }

    @Override
    public void list() {

    }

    @Override
    public void list(Object object) {

    }
}
