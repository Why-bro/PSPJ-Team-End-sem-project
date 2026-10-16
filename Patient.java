public class Patient {
    String patientId;
    String name;
    int severity;

    public Patient(String patientId, String name, int severity) {
        this.patientId = patientId;
        this.name = name;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return patientId + "," + name + "," + severity;
    }
}

