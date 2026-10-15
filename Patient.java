public class Patient {
 protected String name;
    protected int severity;   // 1 = critical, 5 = non-urgent

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    public String describe() {
        return name + " (severity " + severity + ")";
    }

}
