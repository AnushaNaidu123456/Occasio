package com.example.eventmanagement.Service;

import com.example.eventmanagement.Entity.User;
import com.example.eventmanagement.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public User insert(User user)
    {
        return userRepository.save(user);
    }
    public List<User> insertmany(List<User> user)
    {
        return userRepository.saveAll(user);
    }
    public List<User> fetch()
    {
        return userRepository.findAll();
    }
    public User fetchbyid(Integer id)
    {
        return userRepository.findById(id).orElse(null);
    }
    public User update(Integer id,User user)
    {
        User user1=userRepository.findById(id).orElse(null);
        if(user1!=null)
        {
            user1.setUserName(user.getUserName());
            user1.setEmail_id(user.getEmail_id());
            user1.setPassword(user.getPassword());
            user1.setPhone_number(user.getPhone_number());
            user1.setRole(user.getRole());
            return userRepository.save(user);
        }
        return null;
    }
    public String delete(Integer id)
    {
        if(userRepository.existsById(id))
        {
            userRepository.deleteById(id);
            return "data deleted";
        }
        return "id doesnot existt";
    }
}
