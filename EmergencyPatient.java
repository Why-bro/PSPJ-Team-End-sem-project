public class EmergencyPatient extends Patient {
    private String condition;

    public EmergencyPatient(String name, int severity, String condition) {
        super(name, severity);
        this.condition = condition;
    }

    @Override
    public String describe() {
        return "EMERGENCY: " + name + " - " + condition + " (severity " + severity + ")";
    }

}
