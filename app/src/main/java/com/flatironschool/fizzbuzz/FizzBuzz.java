package com.flatironschool.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by altyus on 6/26/14.
 */
public class FizzBuzz {

    private Integer startNumber;
    private Integer endNumber;

    public FizzBuzz(Integer start, Integer end){
       this.startNumber = start;
        this.endNumber = end;
    }

    public Integer getStartNumber() {
        return startNumber;
    }

    public void setStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
    }

    public Integer getEndNumber() {
        return endNumber;
    }

    public void setEndNumber(Integer endNumber) {
        this.endNumber = endNumber;
    }

    public String[] fizzBuzzes() {
        return null;
    }

}
