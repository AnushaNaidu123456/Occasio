package com.example.eventmanagement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Themes {
    @Id
    private Integer theme_id;
    private String theme_name;
    private String theme_description;
    private String theme_image;
    private String theme_color;
    private String theme_status;
}
