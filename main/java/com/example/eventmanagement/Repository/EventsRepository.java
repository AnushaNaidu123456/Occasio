package com.example.eventmanagement.Repository;

import com.example.eventmanagement.Entity.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventsRepository extends JpaRepository<Events,Integer> {
}
