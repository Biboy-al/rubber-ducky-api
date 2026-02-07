package com.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.api.repos.TranscriptRepo;
import com.api.models.Transcript;

@SpringBootApplication
public class ApiApplication {

	private static final Logger logger = LoggerFactory.getLogger(ApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(TranscriptRepo repo){
		return (arg) -> {
			repo.save(new Transcript(0L,"hii", "eng", 100));

			logger.info("Customers found with findAll():");
            logger.info("-------------------------------");
            repo.findAll().forEach(transcript -> {
                logger.info(transcript.toString());
            });
            logger.info("");
		};
	}

}
