import java.util.*;

public class TriageDemo {
    public static void main(String[] args) throws Exception {
        PatientStringUtils.inspectSymptomNote("  Patient reports chest pain  ");
        PatientStringUtils.compareIds("P1", "P1");
        System.out.println(PatientStringUtils.buildAlertMessage("Meena", "chest pain"));

        String[] tokens = PatientStringUtils.parseIntakeForm("P1,Meena,1,chest pain");
        System.out.println("Parsed name: " + tokens[1] + ", severity: " + tokens[2]);

        List<Patient> patients = new ArrayList<>(List.of(
                new Patient("P1", "Meena", 1),
                new Patient("P2", "Ravi", 4),
                new Patient("P3", "Arjun", 2)
        ));
        PatientSorter.sortBySeverityAscending(patients);
        patients.forEach(System.out::println);

        String[] ids = {"P1", "P2", "P3"};
        System.out.println("Found P2 at index: " + PatientSorter.findPatientId(ids, "P2"));

        PatientFileManager.saveTriageLog(patients);
        PatientFileManager.readTriageLogBuffered();
    }
}