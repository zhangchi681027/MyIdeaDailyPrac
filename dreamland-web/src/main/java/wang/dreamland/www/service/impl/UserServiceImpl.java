package wang.dreamland.www.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wang.dreamland.www.dao.UserMapper;
import wang.dreamland.www.entity.User;
import wang.dreamland.www.service.UserService;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserMapper userMapper;

    @Transactional
    @Override
    public int regist(User user)
    {
        return userMapper.insert(user);
//        int i = userMapper.insert(user);
//        i = i/0;
//        return i;
    }

    @Transactional
    @Override
    public User login(String email, String password)
    {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        return userMapper.selectOne(user);
    }

    @Transactional
    @Override
    public User findByEmail(String email)
    {
        User user = new User();
        user.setEmail(email);
        return userMapper.selectOne(user);
    }

    @Transactional
    @Override
    public User findByPhone(String phone)
    {
        User user = new User();
        user.setPhone(phone);
        return userMapper.selectOne(user);
    }

    @Transactional
    @Override
    public User findById(Long id)
    {
        User user = new User();
        user.setId(id);
        return userMapper.selectOne(user);
    }

    @Transactional
    @Override
    public void deleteByEmail(String email)
    {
        User user = new User();
        user.setEmail(email);
        userMapper.delete(user);
    }

    @Transactional
    @Override
    public void update(User user)
    {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Transactional
    @Override
    public User findByEmailActive(String email)
    {
        User user = new User();
        user.setEmail(email);
        return userMapper.selectOne(user);
    }

    @Transactional
    @Override
    public User findById(String id)
    {
        User user = new User();
        user.setId(Long.parseLong(id));
        return userMapper.selectOne(user);
    }
}
