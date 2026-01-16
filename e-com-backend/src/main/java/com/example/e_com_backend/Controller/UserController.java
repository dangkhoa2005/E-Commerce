package com.example.e_com_backend.Controller;

import com.example.e_com_backend.Entity.User;
import com.example.e_com_backend.Service.UserService;
import com.example.e_com_backend.dto.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/user")
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping()
    public User createUser(@RequestBody RegisterRequest body) {
        return userService.createUser(body);
    }

    @GetMapping()
    public ResponseEntity<List<User>> getAll() {
        try {
            List<User> response = userService.getAllUsers();

            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(null);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getById(@PathVariable int id) {
        try {
            User response = userService.getUserById(id);

            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(null);
        }
    }
}
