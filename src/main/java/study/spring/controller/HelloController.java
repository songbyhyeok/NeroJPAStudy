package study.spring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import study.spring.entity.User;
import study.spring.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final UserRepository userRepository;

    @GetMapping("hello")
    public List<User> hello() {
        List<User> all = userRepository.findAll();
        return all;
    }

    @PostMapping("user")
    public void save(User user) {
        userRepository.save(user);
    }
}
