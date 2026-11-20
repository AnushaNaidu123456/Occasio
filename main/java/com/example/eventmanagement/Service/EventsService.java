package com.example.eventmanagement.Service;

import com.example.eventmanagement.Entity.Events;
import com.example.eventmanagement.Repository.EventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventsService {
    @Autowired
    EventsRepository eventsRepository;
    public Events insert(Events events)
    {
        return eventsRepository.save(events);
    }
    public List<Events> insertmany(List<Events> events)
    {
        return eventsRepository.saveAll(events);
    }
    public List<Events> fetch()
    {
        return eventsRepository.findAll();
    }
    public Events fetchbyid(Integer id)
    {
        return eventsRepository.findById(id).orElse(null);
    }
    public Events update(Integer id,Events events)
    {
        Events events1=eventsRepository.findById(id).orElse(null);
        if(events1!=null)
        {
            events1.setEvent_name(events.getEvent_name());
            events1.setEvent_date(events.getEvent_date());
            events1.setEvent_time(events.getEvent_time());
            events1.setEvent_description(events.getEvent_description());
            events1.setTotal_seats(events.getTotal_seats());
            events1.setEvent_status(events.getEvent_status());
            events1.setVenue(events.getVenue());
            events1.setTicket_price(events.getTicket_price());
            return eventsRepository.save(events);
        }
        return null;
    }
    public String delete(Integer id)
    {
        if(eventsRepository.existsById(id))
        {
            eventsRepository.deleteById(id);
            return "data deleted";
        }
        return "id doesnot existt";
    }
}
