//
// Project: SchoolEnrollment
// Author: [Natalia Rodriguez]
//

import java.io.FileNotFoundException;

public class SchoolEnrollment {

    public static void main(String[] args) throws FileNotFoundException {
        /* --- do not modify below --- */
        WorldData wd = new WorldData();
        wd.loadData();
        System.out.println("-----------------------------------");
        System.out.println(wd.lookup("AFG").toString());
        System.out.println(wd.lookup("BRA").toString());
        System.out.println(wd.lookup("CHN").toString());
        System.out.println(wd.lookup("FRA").toString());
        System.out.println(wd.lookup("GBR").toString());
        System.out.println(wd.lookup("IND").toString());
        System.out.println(wd.lookup("ISR").toString());
        System.out.println(wd.lookup("MEX").toString());
        System.out.println(wd.lookup("SGP").toString());
        System.out.println(wd.lookup("USA").toString());
        System.out.println("-----------------------------------");
        /* --- do not modify above --- */

        // make three interesting method calls to test your program

        // printing world data
        System.out.println(wd);

        // printing count of countries
        System.out.println("Count of countries = " + wd.count);

        // Setting new data for a country and printing it
        wd.lookup("IND").setData(new double[2]);
        System.out.println("NEW DATA FOR INDIA " + wd.lookup("IND"));
    }
}

/*

[paste output of running your code here]

*/