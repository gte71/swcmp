package teljstedt.com.swcmp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import teljstedt.com.swcmp.model.Event;
import teljstedt.com.swcmp.repository.EventRepository;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @RequestMapping(value = "events", method = RequestMethod.GET)
    public List<Event> list() {
        return eventRepository.findAll();
    }

    @RequestMapping(value = "events/{id}", method = RequestMethod.GET)
    public Event get(@PathVariable Long id) {
        return eventRepository.findOne(id);
    }

    @RequestMapping(value = "events", method = RequestMethod.POST)
    public Event create(@RequestBody Event event) {
        return eventRepository.saveAndFlush(event);
    }
}
