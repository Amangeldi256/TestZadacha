package com.example.TestZadacha.repository;

import com.example.TestZadacha.entity.Text;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class TextRepositoryTest {

    @Autowired
    private  TextRepository textRepository;

    @Test
    void saveMethod() {

        Text text = new Text();
        text.setName("Komp");

        Text savedObject = textRepository.save(text);
        System.out.println(savedObject.getId());
        System.out.println(savedObject.toString());
    }

}