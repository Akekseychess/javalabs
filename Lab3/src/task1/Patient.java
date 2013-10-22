package task1;


import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;


public class Patient {
	private int id;
	private String firstName;
	private String lastName;
	private String midName;
	private String adress;
	private String telephoneNumber;
	private int medicineCartId;
	private String desise;
	private static int patienCounter;
	private static List<Patient> allPateints = new ArrayList<>();
	
	
	public Patient(String firstName, String lastName, String midName,
			int medicineCartId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.midName = midName;
		this.medicineCartId = medicineCartId;
	}

	public Patient(String firstName, String lastName, String midName,
			String adress, String telephoneNumber, int medicineCartId,
			String desise) {
		this.id = patienCounter++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.midName = midName;
		this.adress = adress;
		this.telephoneNumber = telephoneNumber;
		this.medicineCartId = medicineCartId;
		this.desise = desise;
		allPateints.add(this);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMidName() {
		return midName;
	}

	public void setMidName(String midName) {
		this.midName = midName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public int getMedicineCartId() {
		return medicineCartId;
	}

	public void setMedicineCartId(int medicineCartId) {
		this.medicineCartId = medicineCartId;
	}

	public String getDesise() {
		return desise;
	}

	public void setDesise(String desise) {
		this.desise = desise;
	}

	public int getId() {
		return id;
	}

	public static int getPatienCounter() {
		return patienCounter;
	}

	public static Patient[] getAllPateints() {
		return allPateints.toArray(new Patient[]{});
	}
	
	public static Patient[] filterPateintsByDesise(String desise){
		List<Patient> result = new LinkedList<Patient>();
		for (Patient p:allPateints)
			if(p.getDesise().equalsIgnoreCase(desise))
				result.add(p);
		return result.toArray(new Patient[]{});
	}
	
	public static Patient[] felterPatientsByMedecineCardId(int startId, int finishId){
		List<Patient> result = new LinkedList<Patient>();
		for (Patient p:allPateints)
			if(p.getMedicineCartId() >= startId && p.getMedicineCartId() <= finishId)
				result.add(p);
		return result.toArray(new Patient[]{});	
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
	            return false;
        if (obj == this)
            return true;
        if (!(obj instanceof Patient))
            return false;
        
        Patient p = (Patient)obj;
        if (p.getFirstName() == getFirstName() &&
        		p.getMidName() == getMidName()&&
        		p.getLastName()==getLastName()&&
        		p.getMedicineCartId() == p.getMedicineCartId())
        	return true;
        return false;
	}

	@Override
	public String toString() {
		return id + " " + firstName + " " + lastName + " " + midName;
	}
}
