import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class ClassificationsPromptPaymentDiscount {

    double PercentageDiscount;
    Date Expires;
    int Value;

    public double getPercentageDiscount() {
        return PercentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        PercentageDiscount = percentageDiscount;
    }

    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }



}
