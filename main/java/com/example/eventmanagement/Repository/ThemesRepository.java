package com.example.eventmanagement.Repository;

import com.example.eventmanagement.Entity.Themes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThemesRepository extends JpaRepository<Themes,Integer> {

}
