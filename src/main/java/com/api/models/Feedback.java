package com.api.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Feedback{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private float clarity;
    @ElementCollection
    private List<String> strengths;
    @ElementCollection
    private List<String> improvements;

    public Feedback( float clarity, List<String> strengths, List<String>  improvements){

        this.clarity = clarity;
        this.strengths = strengths;
        this.improvements =  improvements;
    }

    protected Feedback(){}

    public Long getId(){
        return this.id;
    }

    public List<String> getStrength(){
        return this.strengths;
    }

    public List<String> getImprovements(){
        return this.improvements;
    }

    public float getClarity(){
        return this.clarity;
    }

    public String toString(){
        return this.clarity + "";
    }
}