package com.example.ups.poo.service;

import com.example.ups.poo.dto.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    List<Person> personList = new ArrayList<>();

    public List<Person> getAllPeople() {
       Person p1 = new Person();
       p1.setName("Made");
       p1.setLastname("Ortiz");
       p1.setAge(19);
       p1.setId("0953340312");

       Person p2 = new Person("Deby", "Benavides", 20, "0918818766");

        personList.add(p1);
        personList.add(p2);
        return personList;
    }
}