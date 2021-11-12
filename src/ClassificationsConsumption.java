import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class ClassificationsConsumption {

    String id ="";

    String DayType = "";

    String dayType = "";
    String TimePeriod = "";
    String Description = "";
    double units;
    double rate;
    double total;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDayType() {
        return DayType;
    }

    public void setDayType(String dayType) {
        DayType = dayType;
    }

    public String getTimePeriod() {
        return TimePeriod;
    }

    public void setTimePeriod(String timePeriod) {
        TimePeriod = timePeriod;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getUnits() {
        return units;
    }

    public void setUnits(double units) {
        this.units = units;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
