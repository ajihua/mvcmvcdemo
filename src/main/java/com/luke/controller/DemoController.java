package com.luke.controller;

import com.luke.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/restful")
public class DemoController {

    @GetMapping("/request")
    //@ResponseBody
    public String doGetRequest() {
        return "{\"message\":\"李佐元get\"}";
    }

    @PostMapping("/request/{rid}")
    //@ResponseBody
    public String doPostRequest(@PathVariable("rid") Integer requestId, User user) {
        System.out.println(user.getName() + "---" + user.getAge());
        return "{\"message\":\"李佐元post\",\"id\":" + requestId + "}";
    }

    @PutMapping("/request")
    //@ResponseBody
    public String doPutRequest(User user) {
        System.out.println(user.getName() + "---" + user.getAge());
        return "{\"message\":\"李佐元put\"}";
    }

    @DeleteMapping("/request")
    //@ResponseBody
    public String doDeleteRequest() {
        return "{\"message\":\"李佐元delete\"}";
    }

    @GetMapping("/user")
    //@ResponseBody
    public User findByUserId(Integer id) {
        User user = new User();
        if (id == 1) {
            user.setName("李佐元");
            user.setAge(22);
        } else if (id == 2) {
            user.setName("luke");
            user.setAge(25);
        }
        return user;
    }

    @GetMapping("/users")
    //@ResponseBody
    public List<User> findByUsers() {
        List<User> list = new ArrayList<>();
        User u1 = new User();
        User u2 = new User();
        u1.setName("李佐元");
        u1.setAge(22);
        u1.setDate(new Date());
        u2.setName("luke");
        u2.setAge(25);
        u2.setDate(new Date());
        list.add(u1);
        list.add(u2);
        return list;
    }
}
