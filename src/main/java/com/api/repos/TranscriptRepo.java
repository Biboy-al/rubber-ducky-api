package com.api.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.api.models.Transcript;

public interface TranscriptRepo extends CrudRepository<Transcript, Long> {
    
    Transcript findById(long id);
}
