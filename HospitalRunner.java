 class HospitalRunner {
    public static void main(String[] args){
        Hospital.getHospitalFunction();
        Hospital.getHospitalName("Manipal");
        int price=Hospital.getTreatmentPrice(5000);
        System.out.println("tratement price:"+price);
        int noOfDoctor=Hospital.getNoOfDoctors();
        System.out.println("no of doctors available:"+noOfDoctor);
    }
    
}
