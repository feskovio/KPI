package network.cool.service;

import java.util.List;

import network.cool.model.User;
 
 
public interface UserService {
     
    User findById(int id);
     
    User findBySSO(String sso);
     
    void saveUser(User user);
     
    void deleteUserBySSO(String sso);
 
    List<User> findAllUsers(); 
    
    void updateUser(User user);
     
    boolean isUserSSOUnique(Integer id, String sso);
 
}