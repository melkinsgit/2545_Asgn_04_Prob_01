package com.margaret;
import java.util.*;

/**
 * Created by sn0173nd on 9/30/2015.
 */
public class lakeRuns {

    private String lakeName;
    private ArrayList<Double> runTimes;

    // constructors
    public lakeRuns (){ lakeName = ""; runTimes = new ArrayList();}
    public lakeRuns (String lake){ lakeName = lake; runTimes = new ArrayList();}
    public lakeRuns (String lake, double time) { lakeName = lake; runTimes = new ArrayList(); runTimes.add(time);}

    // method - get the ArrayList
    public ArrayList<Double> getRunTimes (){
        return runTimes;
    }

    // method - set name - just added this for practice
    public void setLakeName (String name){
        lakeName = name;
    }

    // method - add a time
    public void addTime (Double timeToAdd){
        runTimes.add (timeToAdd);
    }

    // method - gets the average time; wrote this one by mistake!
    public double averageRun (ArrayList<Double> runSet){
        Double totalRunTimes = 0.00;
        for (Double time : runTimes){
            totalRunTimes += time;
        }
        int timesCount = runTimes.size();
        return totalRunTimes/timesCount;
    }

    // method - fastest run
    public double fastestRun (ArrayList<Double> runSet){
        Double fastest = runTimes.get(0);
        for (Double time : runTimes){
            if (time < fastest){
                fastest = time;
            }
        }
        return fastest;
    }

    // method - output
    public void printAvgRuns() {
        System.out.format("The average run for Lake " + lakeName + " is %.2f\n", averageRun(getRunTimes()));
    }

    public void printFastestRuns() {
        System.out.format("The average run for Lake " + lakeName + " is %.2f\n", fastestRun(getRunTimes()));
    }
}
