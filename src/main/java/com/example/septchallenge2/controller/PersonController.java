package com.example.septchallenge2.controller;

import com.example.septchallenge2.dao.Person;
import com.example.septchallenge2.dao.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path="/person")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    //Get by ID
    @GetMapping(path="/{id}", produces = "application/json")
    public Optional<Person> getPerson(@PathVariable("id") int id) {

        return personRepository.findById(id);
    }

    //Get all
    @GetMapping(path="s/person")
    public @ResponseBody Iterable<Person> getAllPersons() {
        return personRepository.findAll();
    }

    //Update item
    @PutMapping Person updatePerson(@RequestBody Person person) {
        return personRepository.save(person);
    }

    //Delete item
    @DeleteMapping(path = "/{id}", produces = "application/json")
    public void deleteItem(@PathVariable("id") int id){
        personRepository.deleteById(id);
    }

    //Add Person
    @PostMapping(path="")
    public @ResponseBody String addNewPerson (@RequestParam String name, @RequestParam String address, @RequestParam int postcode,
                                              @RequestParam int age, @RequestParam String job, @RequestParam String email,
                                              @RequestParam int phoneno) {
        Person n = new Person();
        n.setName(name);
        n.setAddress(address);
        n.setPostcode(postcode);
        n.setAge(age);
        n.setJob(job);
        n.setEmail(email);
        n.setPhoneno(phoneno);
        personRepository.save(n);
        return "Saved";
    }
}
