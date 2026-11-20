package com.example.eventmanagement.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private Integer user_id;
    private String userName;
    private String email_id;
    private String password;
    private Long phone_number;
    private String role;
}
