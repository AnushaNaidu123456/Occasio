package com.example.eventmanagement.Controller;

import com.example.eventmanagement.Entity.User;
import com.example.eventmanagement.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/insert")
    public User insert(@RequestBody User user)
    {
        return userService.insert(user);
    }
    @PostMapping("/insertmany")
    public List<User> insertmany(@RequestBody List<User> user)
    {
        return userService.insertmany(user);
    }
    @GetMapping("/fetch")
    public List<User> fetch()
    {
        return userService.fetch();
    }
    @GetMapping("/fetchbyid/{id}")
    public User fetchbyid(@PathVariable Integer id)
    {
        return userService.fetchbyid(id);
    }
    @PutMapping("/update/{id}")
    public User update(@PathVariable Integer id,@RequestBody User user)
    {
        return userService.update(id,user);
    }
    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable Integer id)
    {
        return userService.delete(id);
    }
}
