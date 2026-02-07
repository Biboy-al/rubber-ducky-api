package com.api.services;

import com.api.models.Transcript;
import org.springframework.core.io.Resource;

import javax.sound.sampled.AudioFileFormat;

public interface TransribeService {

    public Transcript transript(Resource format);
}
