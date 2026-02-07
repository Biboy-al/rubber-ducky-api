package main.java.com.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Feedback{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private float clarity;
    private String[] strengths;
    private String[] improvements;

    public Feedback( float clarity, String[] strengths, String[] improvments){

        this.clarity = clarity;
        this.strengths = strengths;
        this.improvements = improvments;
    }

    protected Feedback(){}

    public Long getId(){
        return this.id;
    }

    public String[] getStrength(){
        return this.strengths;
    }


    public String[] getImprovments(){
        return this.improvements;
    }
}