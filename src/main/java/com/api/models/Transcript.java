package com.api.models;

import jakarta.persistence.*;

@Entity
public class Transcript{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long userId;
    private String text;
    private String lang;
    private float duration;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "feedback_id")
    private Feedback feedback;

    protected Transcript(){}

    public Transcript(Long userId, String text, String lang, float duration){
        
        this.userId = userId;
        this.text = text;
        this.lang = lang;
        this.duration = duration;
    }

    public String getText(){
        return this.text;
    }

    public String getLang(){
        return lang;
    }

    public float getDuration(){
        return this.duration;
    } 

    public Long getUserId(){
        return this.userId;
    }

    public void setFeedback(Feedback feedback){
        this.feedback = feedback;
    }

    public Feedback getFeedback(){
        return this.feedback;
    }

    public String toString() {
        return String.format(
            "Transcript[id=%d, userId=%d, text='%s', lang='%s', duration=%f]",
            id, userId, text, lang, duration
        );
    }

};