package com.poc.customerservice.repositories;

import com.poc.customerservice.models.Reason;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by antonioreuter on 7/25/15.
 */

@Repository
public interface ReasonRepository extends JpaRepository<Reason, Long> {

    List<Reason> findByCategoryId(Long categoryId);

    List<Reason> findAll();

}
