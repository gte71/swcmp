package teljstedt.com.swcmp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import teljstedt.com.swcmp.repository.EventRepository;
import teljstedt.com.swcmp.repository.PersonRepository;

@RestController
@RequestMapping("api/v1")
public class MainController {
    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private PersonRepository personRepository;

}
