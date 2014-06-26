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

            ArrayList<String> fizzBuzzList = new ArrayList<String>();

            if (startNumber != null && endNumber != null && startNumber < endNumber && startNumber >= 0) {
                for (int i = startNumber; i <= endNumber; i++) {
                    if (i == 0) {
                        fizzBuzzList.add("0");
                    } else if (i % 15 == 0) {
                        fizzBuzzList.add("FizzBuzz");
                    } else if (i % 3 == 0) {
                        fizzBuzzList.add("Fizz");
                    } else if (i % 5 == 0) {
                        fizzBuzzList.add("Buzz");
                    } else {
                        fizzBuzzList.add(Integer.toString(i));
                    }
                }
            } else {
                startNumber = 0;
                endNumber = 100;

                return fizzBuzzes();
            }

            return fizzBuzzList.toArray(new String[fizzBuzzList.size()]);
        }

}
