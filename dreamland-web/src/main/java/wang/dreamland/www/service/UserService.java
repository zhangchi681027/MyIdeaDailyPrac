package wang.dreamland.www.service;

import wang.dreamland.www.entity.User;

public interface UserService {
    int regist(User user);
    User login(String email,String password);
    User findByEmail(String email);
    User findByPhone(String phone);
    User findById(Long id);
    void deleteByEmail(String email);
    void update(User user);
    User findByEmailActive(String email);
    User findById(String id);
}
