package com.example.ups.poo.service;

import com.example.ups.poo.dto.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
        p1.setAge(20);
        p1.setId("0915515515");

        Person p2 = new Person("Deby", "Diaz", 22, "0910452671");

        personList.add(p1);
        personList.add(p2);

        return personList;
    }

    public ResponseEntity getPersonById(String id) {
        for (Person person: personList) {
            if (id.equalsIgnoreCase(person.getId())) {
                return ResponseEntity.status(HttpStatus.OK).body(person);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Person with id: "+ id + " not found");
    }
}