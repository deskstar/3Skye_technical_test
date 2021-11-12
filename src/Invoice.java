import java.util.Date;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Invoice {

    String invoiceNumber = "";
    String retailer = "";
    Date invoiceDate = new Date();
    Date dateFrom = new Date();
    Date dateTill = new Date();
    Date dateDue = new Date();
    String readType = "";
    boolean gstIncl;
    int invoiceTotal;
    String energyUnit = "";
    String notes = "";
    //ClassificationsPromptPaymentDiscount classificationsPromptPaymentDiscount;
    //ClassificationsConsumption classificationsConsumption;

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getRetailer() {
        return retailer;
    }

    public void setRetailer(String retailer) {
        this.retailer = retailer;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTill() {
        return dateTill;
    }

    public void setDateTill(Date dateTill) {
        this.dateTill = dateTill;
    }

    public Date getDateDue() {
        return dateDue;
    }

    public void setDateDue(Date dateDue) {
        this.dateDue = dateDue;
    }

    public String getReadType() {
        return readType;
    }

    public void setReadType(String readType) {
        this.readType = readType;
    }

    public boolean isGstIncl() {
        return gstIncl;
    }

    public void setGstIncl(boolean gstIncl) {
        this.gstIncl = gstIncl;
    }

    public int getInvoiceTotal() {
        return invoiceTotal;
    }

    public void setInvoiceTotal(int invoiceTotal) {
        this.invoiceTotal = invoiceTotal;
    }

    public String getEnergyUnit() {
        return energyUnit;
    }

    public void setEnergyUnit(String energyUnit) {
        this.energyUnit = energyUnit;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

//    public ClassificationsPromptPaymentDiscount getClassificationsPromptPaymentDiscount() {
//        return classificationsPromptPaymentDiscount;
//    }
//
//    public void setClassificationsPromptPaymentDiscount(ClassificationsPromptPaymentDiscount classificationsPromptPaymentDiscount) {
//        this.classificationsPromptPaymentDiscount = classificationsPromptPaymentDiscount;
//    }
//
//    public ClassificationsConsumption getClassificationsConsumption() {
//        return classificationsConsumption;
//    }
//
//    public void setClassificationsConsumption(ClassificationsConsumption classificationsConsumption) {
//        this.classificationsConsumption = classificationsConsumption;
//    }
}
