package com.example.eventmanagement.Service;

import com.example.eventmanagement.Entity.Category;
import com.example.eventmanagement.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    public Category insert(Category category)
    {
        return categoryRepository.save(category);
    }
    public List<Category> insertmany(List<Category> category)
    {
        return categoryRepository.saveAll(category);
    }
    public List<Category> fetch()
    {
        return categoryRepository.findAll();
    }
    public Category fetchbyid(Integer id)
    {
        return categoryRepository.findById(id).orElse(null);
    }
    public Category update(Integer id,Category category)
    {
        Category category1=categoryRepository.findById(id).orElse(null);
        if(category1!=null)
        {
            category1.setCategory_name(category.getCategory_name());
            return categoryRepository.save(category);
        }
        return null;
    }
    public String delete(Integer id)
    {
        if(categoryRepository.existsById(id))
        {
            categoryRepository.deleteById(id);
            return "data deleted";
        }
        return "id doesnot existt";
    }
}
