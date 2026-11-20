package com.example.eventmanagement.Controller;

import com.example.eventmanagement.Entity.Category;
import com.example.eventmanagement.Entity.User;
import com.example.eventmanagement.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @PostMapping("/insert")
    public Category insert(@RequestBody Category category)
    {
        return categoryService.insert(category);
    }
    @PostMapping("/insertmany")
    public List<Category> insertmany(@RequestBody List<Category> category)
    {
        return categoryService.insertmany(category);
    }
    @GetMapping("/fetch")
    public List<Category> fetch()
    {
        return categoryService.fetch();
    }
    @GetMapping("/fetchbyid/{id}")
    public Category fetchbyid(@PathVariable Integer id)
    {
        return categoryService.fetchbyid(id);
    }
    @PutMapping("/update/{id}")
    public Category update(@PathVariable Integer id,@RequestBody Category category)
    {
        return categoryService.update(id,category);
    }
    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable Integer id)
    {
        return categoryService.delete(id);
    }
}
