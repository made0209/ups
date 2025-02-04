package com.example.ups.poo.config;

import com.example.ups.poo.entity.Person;
import com.example.ups.poo.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner{

    private final PersonRepository personRepository;

    public BootStrapData(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        Person p1 = new Person();
        p1.setName("Made");
        p1.setLastname("Ortiz");
        p1.setAge(19);
        p1.setPersonId("0953340312");

        Person p2 = new Person();
        p2.setName("Majo");
        p2.setLastname("Barzola");
        p2.setAge(20);
        p2.setPersonId("0953340533");

        personRepository.save(p1);
        personRepository.save(p2);

        System.out.println("------------Started Repository");
        System.out.println("Number of Person: " + personRepository.count());
    }
}
