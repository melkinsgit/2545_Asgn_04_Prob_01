package com.margaret;

public class Main {

    public static void main(String[] args) {

        // create 3 new lakeRuns with one time each
        lakeRuns CalRuns = new lakeRuns ("Calhoun", 45.15);
        lakeRuns HarRuns = new lakeRuns ("Harriet", 49.34);
        lakeRuns ComRuns = new lakeRuns ("Como", 32.11);

        // add run times to lakeRuns
        CalRuns.addTime(43.32);
        HarRuns.addTime(44.43);
        HarRuns.addTime(46.22);
        ComRuns.addTime(28.14);

        // for each object calculate avarage of runs and output results
        CalRuns.printAvgRuns();
        CalRuns.printFastestRuns();

        HarRuns.printAvgRuns();
        HarRuns.printFastestRuns();

        ComRuns.printAvgRuns();
        ComRuns.printFastestRuns();
    }
}
