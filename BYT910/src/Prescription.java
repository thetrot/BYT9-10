import java.util.List;

public class Prescription {
    private List<Medicine> medicine;

    public Prescription(List<Medicine> medicine) {
        this.medicine = medicine;
    }

    public List<Medicine> getMedicine() {
        return medicine;
    }

    public void setMedicine(List<Medicine> medicine) {
        this.medicine = medicine;
    }

    public void addMedicine(Medicine medicine){
        this.medicine.add(medicine);
    }

    public void removeMedicine(int n){
        this.medicine.remove(n);
    }
}
