package main.java.com.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public record Transcript(){

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String text;
    private String lang;
    private float duration;

    protected Transcript(){}

    public Transcript(String text, String lang, float duration){
        
        this.text = text;
        this.lang = lang;
        this.duration = duration;
    }

    public String getText(){
        return this.text;
    }

    public string getLang(){
        return lang;
    }

    public float getDuration(){
        return this.duration;
    } 

};