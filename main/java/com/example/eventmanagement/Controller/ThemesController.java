package com.example.eventmanagement.Controller;

import com.example.eventmanagement.Entity.Themes;
import com.example.eventmanagement.Service.ThemesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/themes")
public class ThemesController {
    @Autowired
    ThemesService themesService;
    @PostMapping("/insert")
    public Themes insert(@RequestBody Themes themes)
    {
        return themesService.insert(themes);
    }
    @PostMapping("/insertmany")
    public List<Themes> insertmany(@RequestBody List<Themes> themes)
    {
        return themesService.insertmany(themes);
    }
    @GetMapping("/fetch")
    public List<Themes> fetch()
    {
        return themesService.fetch();
    }
    @GetMapping("/fetchbyid/{id}")
    public Themes fetchbyid(@PathVariable Integer id)
    {
        return themesService.fetchbyid(id);
    }
    @PutMapping("/update/{id}")
    public Themes update(@PathVariable Integer id,@RequestBody Themes themes)
    {
        return themesService.update(id,themes);
    }
    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable Integer id)
    {
        return themesService.delete(id);
    }
}
