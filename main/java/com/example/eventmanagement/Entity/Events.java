package com.example.eventmanagement.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Events {
    @Id
    private Integer event_id;
    private String event_name;
    private String event_description;
    private String venue;
    private String event_date;
    private String event_time;
    private Integer total_seats;
    private Double ticket_price;
    private String event_status;
    @ManyToOne
    @JoinColumn(name="category_id")
    Category category;
    @ManyToOne
    @JoinColumn(name="user_id")
    User user;
    @ManyToOne
    @JoinColumn(name = "theme_id")
    Themes themes;
}
