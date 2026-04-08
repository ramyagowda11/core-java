class Hospital1 {
      
     //properties

    String hospitalName;
    String location;
    int numberOfDoctors;
    int numberOfPatients;
    String chiefDoctor;
    double consultationFee;
    boolean hasEmergency;
    boolean hasPharmacy;
    int establishedYear;
    String hospitalType;
    static String country = "India";
    static String serviceType = "Healthcare";
	
	//functionsalities

    public String admitPatient(String patientName) {
        System.out.println("Admitting Patient: " + patientName);
        return patientName;
    }

    public int dischargePatient(int patientId) {
        System.out.println("Discharging Patient ID: " + patientId);
        return patientId;
    }

    public String assignDoctor(String doctorName) {
        System.out.println("Assigned Doctor: " + doctorName);
        return doctorName;
    }

    public double collectFee(double amount) {
        System.out.println("Collected Fee: " + amount);
        return amount;
    }

    public boolean openEmergency(boolean status) {
        System.out.println("Emergency Open: " + status);
        return status;
    }

    public boolean provideTreatment(boolean status) {
        System.out.println("Treatment Given: " + status);
        return status;
    }

    public String scheduleAppointment(String date) {
        System.out.println("Appointment Scheduled: " + date);
        return date;
    }

    public int totalPatients(int count) {
        System.out.println("Total Patients: " + count);
        return count;
    }

    public String conductHealthCamp(String campName) {
        System.out.println("Health Camp: " + campName);
        return campName;
    }

    public boolean maintainCleanliness(boolean status) {
        System.out.println("Cleanliness Maintained: " + status);
        return status;
    }
}