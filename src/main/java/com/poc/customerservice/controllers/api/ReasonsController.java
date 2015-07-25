package com.poc.customerservice.controllers.api;

import com.poc.customerservice.models.Reason;
import com.poc.customerservice.repositories.ReasonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by antonioreuter on 7/25/15.
 */

@RestController
@RequestMapping("/customerservice/api/reasons")
@ExposesResourceFor(Reason.class)
public class ReasonsController {

    @Autowired
    private ReasonRepository repository;


    @RequestMapping(method= RequestMethod.GET)
    @ResponseBody
    public List<Reason> reasons(@RequestParam(value="category", required=false) Long categoryId) {
        List<Reason> reasons = null;

        if (categoryId != null) {
            reasons = repository.findByCategoryId(categoryId);
        } else {
            reasons = repository.findAll();
        }

        return reasons;
    }

    @RequestMapping(method = RequestMethod.GET, value="/{id}")
    @ResponseBody
    public ResponseEntity<?> reason(@PathVariable(value = "id") Long id) {
        Reason reason = repository.findOne(id);

        if (reason != null) {
            return new ResponseEntity<Reason>(reason, HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("Reason not found.",HttpStatus.NOT_FOUND);
        }
    }

}
