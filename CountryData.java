import java.util.Arrays;

public class CountryData extends Country {
    double[] data;

    CountryData(){}

    //Constructor
    CountryData(String code, String name){
        super(code, name);
    }

    public double[] getData() {
     return this.data;
    }

    public void setData(double[] data){
        this.data = data;
    }

    @Override
    public String toString(){
        String dataStr = "";
        for(int i=0; i < this.data.length; i++){
            double value = this.data[i];
            if(value==0) {
                dataStr = dataStr.concat("-");
            } else {
                dataStr = dataStr.concat(String.valueOf(value));
            }
            if (i != this.data.length-1) {
                dataStr = dataStr.concat(",");
            }
        }
        return "CountryData{code='" + this.code +  "'name='" + this.name + "', data=[" + dataStr +"]}";
    }

}
