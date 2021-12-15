import java.util.Calendar;
import java.util.GregorianCalendar;

public class Medicine {
    private String name;
    private int certificateNumber;
    private int series;
    private Calendar expirationDate = new GregorianCalendar();

    public Medicine(String name, int certificateNumber, int series, Calendar expirationDate) {
        this.name = name;
        this.certificateNumber = certificateNumber;
        this.series = series;
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(int certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public Calendar getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }
}
