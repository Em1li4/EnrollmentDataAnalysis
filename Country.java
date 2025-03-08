import java.io.PrintStream;

// com.foothill.Country class.
public class Country {
    String code;
    String name;

    Country(){}

    Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "code='" + this.code +"', name='" + this.name + "'"; // TODO
    }
}