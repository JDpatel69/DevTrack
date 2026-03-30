package com.jenish.devtrack;

import java.time.LocalDate;

public class DailyEntry {

    private LocalDate date;             // system
    private int sliderValue;            // user (0 - 100)
    private Mode mode;                // system derived
    private int score;                // user (1 - 5)
    private String note;              // optional user text

    public DailyEntry(int sliderValue,int score,String note){
        this.date= LocalDate.now();
        this.sliderValue= sliderValue;
        this.score = score;
        this.note = note ;
        this.mode = calculateMode(sliderValue);
    }
   private Mode calculateMode(int sliderValue){
        if(sliderValue <= 35){
            return Mode.ROBO;
        }else if(sliderValue<=65){
            return Mode.HYBRID;
        }else{
            return Mode.WARRIOR;
        }
    }

    public LocalDate getDate(){
        return date;
    } 
    public int getSlidervalue(){
        return sliderValue;
    }

    public Mode getMode(){
        return mode;
    }

    public int getScore(){
        return score;
    }

    public String getNote(){
        return note;
    }
}
