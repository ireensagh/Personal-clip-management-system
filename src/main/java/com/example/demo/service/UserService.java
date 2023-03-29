package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Value("${api.url}")
    private String apiUrl;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    public void importUsersFromApi() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<User[]> response = restTemplate.getForEntity(apiUrl, User[].class);
        User[] users = response.getBody();
        for (User user : users) {
            userRepository.save(user);
        }
    }
}

