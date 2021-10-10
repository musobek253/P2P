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
        User editUser = (User) object;
        boolean isSuccess = false;
        for (int i = 0; i < users.size() && !isSuccess; i++) {
            if (users.get(i) != null) {
                if (users.get(i).getPhoneNumber().equals(editUser.getPhoneNumber())) {
                    isSuccess = true;
                    users.get(i).setAge(editUser.getAge());
                    users.get(i).setName(editUser.getName());
                }
            }
        }
        return isSuccess;
    }

    @Override
    public boolean delete(Object object) {
        return false;
    }

    @Override
    public void list() {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if(users.get(i)!= null){
                System.out.println("=============== " + (i + 1) + "=======================");
                System.out.println("username: " + user.getPhoneNumber());
                System.out.println("name: " + user.getName());
                System.out.println("password: " + getMaskPassword(user.getPassword()));
            }

        }
    }

    @Override
    public void list(Object object) {

    }
    public String getMaskPassword(String str){
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            s+= "*";


        }
        return s;
    }
}
