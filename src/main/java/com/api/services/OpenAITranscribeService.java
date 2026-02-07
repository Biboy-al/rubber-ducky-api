package com.api.services;

import com.api.models.Transcript;
import com.api.repos.TranscriptRepo;
import org.springframework.ai.audio.transcription.AudioTranscriptionPrompt;
import org.springframework.ai.audio.transcription.AudioTranscriptionResponse;
import org.springframework.ai.openai.OpenAiAudioTranscriptionModel;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
public class OpenAITranscribeService implements TransribeService {

    final private OpenAiAudioTranscriptionModel openAiTranscriptionModel;
    final private TranscriptRepo transcriptRepo;

    public OpenAITranscribeService(OpenAiAudioTranscriptionModel openAiTranscriptionModel, TranscriptRepo transcriptRepo) {
        this.openAiTranscriptionModel = openAiTranscriptionModel;
        this.transcriptRepo = transcriptRepo;
    }

    @Override
    public Transcript transript(Resource audio) {
        AudioTranscriptionPrompt transcriptRequest = new AudioTranscriptionPrompt(audio, null);
        AudioTranscriptionResponse response = openAiTranscriptionModel.call(transcriptRequest);
       String text = response.getResult().getOutput();

       Transcript Transcript = new Transcript(0L, text, "eng", 100L);

       return transcriptRepo.save(Transcript);
    }
}
