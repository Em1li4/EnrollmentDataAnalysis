import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class WorldData {
    CountryData[] countryData = new CountryData[264];
    int count = 0;

    WorldData(){}

    public void addCountry(CountryData country){
            this.countryData[count] = country;
            count++;
    }


    public void loadData() throws FileNotFoundException {
        // start at row 0
        int row = 0;
        // open Scanner
        Scanner scnr = new Scanner(new File("C:\\Users\\em1li\\Documents\\Intermediate Java Jingwen\\API_SE.SEC.NENR_DS2_en_csv_v2_1347167.csv"));
        // Skip first 3 lines
        scnr.nextLine();
        scnr.nextLine();
        scnr.nextLine();
        while (scnr.hasNextLine() && row < 264){
            // Read next line
            String line = scnr.nextLine();
            // Split lines
            String[] splittedLine = line.split(",");
            // Read name and code of the country, replacing quotes "" with empty
            String name = splittedLine[0].replaceAll("\"","");
            String code = splittedLine[1].replaceAll("\"","");

            // Enrollment data
            double[] enrollmentData = new double[60];
            for (int i = 0; i < 60 ; i++){
                // Start reading enrollment data, so we use i+2 skipping country and code
                String enrollmentDataStr = splittedLine[i+2];
                // If empty, replace with 0.0
                if (enrollmentDataStr.isEmpty() || enrollmentDataStr.equals("\"\"")) {
                    enrollmentData[i] = 0.0;
                } else {
                    // read enrollment data, parse it to double, and once again replace "" with empty.
                    enrollmentData[i] = Double.parseDouble(enrollmentDataStr.replaceAll("\"",""));
                }
            }

            CountryData countryData = new CountryData(code, name);
            countryData.setData(enrollmentData);
            addCountry(countryData);

            row++;
        }
        scnr.close();
    }

    public CountryData lookup (String code){
        for (int i = 0; i < count; i++){
            if (countryData[i].getCode().equals(code)){
                return countryData[i];
            }
        }
        return null;
    }

    @Override
    public String toString(){
        String worldDataStr = "";
       for (int i=0; i < countryData.length ; i++){
           worldDataStr = worldDataStr.concat(countryData[i].toString());
           worldDataStr = worldDataStr.concat(",\n");
       }
       return "WorldData{ countries =[" + worldDataStr +"]}";

    }
}
