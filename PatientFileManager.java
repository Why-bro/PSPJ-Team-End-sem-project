import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.List;

public class PatientFileManager {

    public static void saveTriageLog(List<Patient> patients) throws IOException {
        Path path = Path.of("data", "patients.txt");
        Files.createDirectories(path.getParent());

        StringBuilder content = new StringBuilder();
        for (Patient p : patients) {
            content.append(p.toString()).append(System.lineSeparator());
        }
        Files.writeString(path, content.toString(), StandardCharsets.UTF_8);
    }

    public static void appendPatientEntry(Patient p) throws IOException {
        Path path = Path.of("data", "patients.txt");
        Files.writeString(path, p + System.lineSeparator(), StandardCharsets.UTF_8,
                StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }

    public static void readTriageLogBuffered() throws IOException {
        Path path = Path.of("data", "patients.txt");
        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Logged: " + line);
            }
        }
    }
}
