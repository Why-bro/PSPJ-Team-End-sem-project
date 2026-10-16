public class PatientStringUtils {

    public static void inspectSymptomNote(String raw) {
        String trimmed = raw.trim();
        System.out.println("Note length: " + trimmed.length());
        System.out.println("First char: " + trimmed.charAt(0));
        System.out.println("Uppercase: " + trimmed.toUpperCase());
        System.out.println("Mentions 'chest': " + trimmed.toLowerCase().contains("chest"));
        System.out.println("Starts with 'Patient': " + trimmed.startsWith("Patient"));
    }

    public static void compareIds(String id1, String id2) {
        System.out.println("== check: " + (id1 == id2));
        System.out.println(".equals check: " + id1.equals(id2));
        System.out.println("equalsIgnoreCase: " + id1.equalsIgnoreCase(id2));
        System.out.println("compareTo: " + id1.compareTo(id2));
    }

    public static String buildAlertMessage(String name, String condition) {
        StringBuilder sb = new StringBuilder("ALERT: ");
        sb.append(name).append(" - ").append(condition);
        sb.insert(0, "[TRIAGE] ");
        return sb.toString();
    }

    public static String[] parseIntakeForm(String csvLine) {
        return csvLine.split(",");   // e.g. "P1,Meena,1,chest pain"
    }
}