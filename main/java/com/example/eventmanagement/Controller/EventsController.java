package com.example.eventmanagement.Controller;

import com.example.eventmanagement.Entity.Events;
import com.example.eventmanagement.Service.EventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventsController {
    @Autowired
    EventsService eventsService;
    @PostMapping("/insert")
    public Events insert(@RequestBody Events events)
    {
        return eventsService.insert(events);
    }
    @PostMapping("/insertmany")
    public List<Events> insertmany(@RequestBody List<Events> events)
    {
        return eventsService.insertmany(events);
    }
    @GetMapping("/fetch")
    public List<Events> fetch()
    {
        return eventsService.fetch();
    }
    @GetMapping("/fetchbyid/{id}")
    public Events fetchbyid(@PathVariable Integer id)
    {
        return eventsService.fetchbyid(id);
    }
    @PutMapping("/update/{id}")
    public Events update(@PathVariable Integer id,@RequestBody Events events)
    {
        return eventsService.update(id,events);
    }
    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable Integer id)
    {
        return eventsService.delete(id);
    }
}
