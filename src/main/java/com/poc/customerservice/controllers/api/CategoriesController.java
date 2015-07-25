package com.poc.customerservice.controllers.api;

/**
 * Created by antonioreuter on 7/25/15.
 */

import com.poc.customerservice.models.Category;
import com.poc.customerservice.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customerservice/api/categories")
@ExposesResourceFor(Category.class)
public class CategoriesController {

    @Autowired
    private CategoryRepository repository;

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> category(@PathVariable(value = "id") Long id) {
        Category category = repository.findOne(id);
        if (category != null) {
            return new ResponseEntity<Category>(category, HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("Category not found", HttpStatus.NOT_FOUND);
        }
    }


    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Category> categories() {
        return repository.findAll();
    }



}
