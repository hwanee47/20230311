package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void test1() throws Exception {
        // given
        User user = new User();
        user.setName("trest");
        user.setAge(10);

        // when
        User saveUser = userRepository.save(user);
        User findUser = userRepository.findById(saveUser.getId()).orElseThrow(() -> new RuntimeException());

        // then
//        System.out.println(saveUser.getName() + "::" + findUser.getName()+"2");

        Assertions.assertThat(saveUser).isEqualTo(findUser);


    }
}