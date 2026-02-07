package main.java.com.api.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import main.java.com.api.models.Feedback;

public interface FeedbackRepo extends CrudRepository<Feedback, Long> {

    List<Feedback> getAllFeedbackByUser();

    
}
