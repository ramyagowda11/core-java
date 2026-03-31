public class ThermoMeterRunner {
    public static void main(String[] args) {
        ThermoMeter thermoMeter1 = new ThermoMeter();
        thermoMeter1.type = "Digital";
        thermoMeter1.range = 100.0f;
        thermoMeter1.accuracy = 0.1f;
        thermoMeter1.sensitivity = 0.05f;
        thermoMeter1.responseTime = 2.5f;
        thermoMeter1.material = "Plastic";
       thermoMeter1.scale = "Celsius";
        thermoMeter1.digitalDisplay = true;
        thermoMeter1.getThermoMeterDetails();
        ThermoMeter thermoMeter2 = new ThermoMeter("Digital",100.0f,0.1f,0.05f,2.5f,"Plastic","Celsius");
    }
    
}
