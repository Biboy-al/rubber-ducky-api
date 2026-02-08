package com.api.models;

import jakarta.persistence.*;

import java.util.ArrayList;
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
        // Creates copies of object so they are not imutable later on
        this.strengths = new ArrayList<>(strengths);
        this.improvements =  new ArrayList<>(improvements);
    }

    protected Feedback(){}

    public Long getId(){
        return this.id;
    }

    public List<String> getStrength(){
        return new ArrayList<>(this.strengths);
    }

    public List<String> getImprovements(){
        return new ArrayList<>(this.improvements);
    }

    public float getClarity(){
        return this.clarity;
    }

    public String toString(){
        return this.clarity + "";
    }
}