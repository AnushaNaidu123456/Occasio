package com.example.eventmanagement.Service;

import com.example.eventmanagement.Entity.Themes;
import com.example.eventmanagement.Repository.ThemesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThemesService {
    @Autowired
    ThemesRepository themesRepository;
    public Themes insert(Themes themes)
    {
        return themesRepository.save(themes);
    }
    public List<Themes> insertmany(List<Themes> themes)
    {
        return themesRepository.saveAll(themes);
    }
    public List<Themes> fetch()
    {
        return themesRepository.findAll();
    }
    public Themes fetchbyid(Integer id)
    {
        return themesRepository.findById(id).orElse(null);
    }
    public Themes update(Integer id,Themes themes)
    {
        Themes themes1=themesRepository.findById(id).orElse(null);
        if(themes1!=null)
        {
            themes1.setTheme_name(themes.getTheme_name());
            themes1.setTheme_description(themes.getTheme_description());
            themes1.setTheme_image(themes.getTheme_image());
            themes1.setTheme_color(themes.getTheme_color());
            themes1.setTheme_status(themes.getTheme_status());
            return themesRepository.save(themes);
        }
        return null;
    }
    public String delete(Integer id)
    {
        if(themesRepository.existsById(id))
        {
            themesRepository.deleteById(id);
            return "data deleted";
        }
        return "id doesnot existt";
    }
}
