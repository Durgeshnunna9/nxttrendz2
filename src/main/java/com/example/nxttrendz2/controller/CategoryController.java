package com.example.nxttrendz2.controller;

import com.example.nxttrendz2.model.Category;
import com.example.nxttrendz2.service.CategoryJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CategoryController {
    @Autowired
    private CategoryJpaService categoryJpaService;

    @GetMapping("/categories")
    public ArrayList<Category> getCategories() {
        return categoryJpaService.getCategories();
    }

    @GetMapping("/categories/{categoryId}")
    public Category getCategoryById(@PathVariable("categoryId") int id) {
        return categoryJpaService.getCategoryById(id);
    }

    @PostMapping("/categories")
    public Category addCategory(@RequestBody Category category) {
        return categoryJpaService.addCategory(category);
    }

    @PutMapping("/categories/{categoryId}")
    public Category updateCategory(@PathVariable("categoryId") int id, @RequestBody Category category) {
        return categoryJpaService.updateCategory(id, category);
    }

    @DeleteMapping("/categories/{categoryId}")
    public void deleteCategory(@PathVariable int id) {
        categoryJpaService.deleteCategory(id);
    }
}