package com.api.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.api.models.Feedback;

public interface FeedbackRepo extends CrudRepository<Feedback, Long> {
    
}
