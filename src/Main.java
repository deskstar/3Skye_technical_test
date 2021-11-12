import java.io.File;
import java.util.Date;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Main {

    public static void main(String[] args) {


        Invoice invoice = new Invoice();

    invoice.setInvoiceNumber("str1234");</InvoiceNumber>
    invoice.setRetailer("Spark Energy");</Retailer>
    invoice.setInvoiceDate(new Date(2012-12-13));</InvoiceDate>
    invoice.setDateFrom(new Date(2012-12-13));</DateFrom>
    invoice.setDateTill(new Date(2012-12-13));</DateTill>
    invoice.setDateDue>2012-12-13</DateDue>
    <ReadType>Estimated Reading</ReadType>
    <GstIncl>true</GstIncl>
    <InvoiceTotal>123.45</InvoiceTotal>
    <EnergyUnit>km</EnergyUnit>
    <iClassificationsConsumption id="str1234">
      <DayType>Non-Business Day</DayType>
      <TimePeriod>00:00-04:00</TimePeriod>
      <Description>str1234</Description>
      <Units>123.45</Units>
      <Rate>123.45</Rate>
      <Total>123.45</Total>
    </iClassificationsConsumption>
    <iClassificationsPromptPaymentDiscount id="str1234">
      <PercentageDiscount>123.45</PercentageDiscount>
      <Expires>2012-12-13</Expires>
      <Value>123.45</Value>
    </iClassificationsPromptPaymentDiscount>
    <Notes>str1234</Notes>


        try {

            File file = new File("C:\\file.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Invoice.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(customer, file);
            jaxbMarshaller.marshal(customer, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
