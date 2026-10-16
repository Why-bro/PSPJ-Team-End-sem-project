import java.util.*;

public class PatientSorter {

    public static void sortBySeverityAscending(List<Patient> patients) {
        patients.sort((a, b) -> Integer.compare(a.severity, b.severity));  // most critical first
    }

    public static int findPatientId(String[] sortedIds, String target) {
        return Arrays.binarySearch(sortedIds, target);
    }
}