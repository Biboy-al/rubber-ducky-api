package com.api;

import com.api.ApiApplication;
import com.api.models.Feedback;
import com.api.models.Transcript;
import com.api.repos.FeedbackRepo;
import com.api.repos.TranscriptRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Arrays;

@Configuration
public class DataLoad {
    
    private static final Logger logger = LoggerFactory.getLogger(DataLoad.class);

    @Bean
	public CommandLineRunner demo(TranscriptRepo TransRepo, FeedbackRepo FeedbackRepo) {
		return (arg) -> {

            Transcript transcriptTest = new Transcript(0L,"hii", "eng", 100);

            List<String> strengths = new ArrayList<String>(List.of("hii", "eng", "hii"));
            List<String> improvements = new ArrayList<>(List.of("hii", "eng", "hii"));

            Feedback feedback = new Feedback(1000L, strengths, improvements);
            transcriptTest.setFeedback(feedback);

			TransRepo.save(transcriptTest);
            FeedbackRepo.save(feedback);


			logger.info("Customers found with findAll():");
            logger.info("-------------------------------");
            TransRepo.findAll().forEach(transcript -> {
                logger.info(transcript.toString());
                logger.info("-------------------------------");
                logger.info(transcript.getFeedback().toString());
            });
            logger.info("");
		};
	}

}
