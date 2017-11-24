package teljstedt.com.swcmp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import teljstedt.com.swcmp.model.Person;
import teljstedt.com.swcmp.repository.PersonRepository;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(value = "person", method = RequestMethod.GET)
    public List<Person> list() {
        return personRepository.findAll();
    }

    @RequestMapping(value = "person/{id}", method = RequestMethod.GET)
    public Person get(@PathVariable Long id) {
        return personRepository.findOne(id);
    }

    @RequestMapping(value = "person", method = RequestMethod.POST)
    public Person create(@RequestBody Person person) {
        return personRepository.saveAndFlush(person);
    }
}
