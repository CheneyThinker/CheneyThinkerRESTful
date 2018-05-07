package com.cheney.thinker.mysql.controller;

import com.cheney.thinker.core.Result;
import com.cheney.thinker.core.ResultGenerator;
import com.cheney.thinker.mysql.entity.User;
import com.cheney.thinker.mysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(maxAge = 3600, origins = "*")
@RestController
@RequestMapping(path = "/jsonUser")
public class UserCController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/add")
    public Result addUser(@RequestParam String name, @RequestParam String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        repository.save(user);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/all")
    public Result getAllUsers() {
        return ResultGenerator.genSuccessResult(repository.findAll());
    }

}
