import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {

//... imports class definition...
    
    // Inside class:
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents = new ArrayList<>();
    
    // TO DO: Implement a constructor that takes an ID and a role


    public AdminUser(int id, String role) {
        super(id);
        this.role = role;

    }


    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    @Override
    public ArrayList<String> reportSecurityIncidents() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public boolean assignPin(int pin) {
        int numDigits = String.valueOf(pin).length();
        return(numDigits >= 6);
    }
    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        if(confirmedAuthID.equals(this.id)){
            this.authIncident();
        }
        return(confirmedAuthID == this.id);
    }
    
    // TO DO: Setters & Getters


    public Integer getEmployeeID() {
        return this.employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ArrayList<String> getSecurityIncidents() {
        return this.securityIncidents;
    }

    public void setSecurityIncidents(ArrayList<String> securityIncidents) {
        this.securityIncidents = securityIncidents;
    }



    
}
