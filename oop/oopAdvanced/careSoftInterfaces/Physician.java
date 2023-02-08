import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantAdmin {
       
    private ArrayList<String> patientNotes;
	
    // TO DO: Constructor that takes an ID

    public Physician(int id) {
        super(id);
    }

    // TO DO: Implement HIPAACompliantUser!
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

    @Override
    public ArrayList<String> reportSecurityIncidents() {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean assignPin(int i) {
        return false;
    }

    public boolean accessAuthorized(int i) {
        return false;
    }
	
    // TO DO: Setters & Getters


    public ArrayList<String> getPatientNotes() {
        return this.patientNotes;
    }

    public void setPatientNotes(ArrayList<String> patientNotes) {
        this.patientNotes = patientNotes;
    }


}
