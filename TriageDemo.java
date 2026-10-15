public class TriageDemo {
    public static void main(String[] args) {
        String[] descriptions = {
            new Patient("Ravi", 4).describe(),
            new EmergencyPatient("Meena", 1, "chest pain").describe(),
            new Patient("Arjun", 5).describe()
        };

        for (String description : descriptions) {
            System.out.println(description);
        }
    }
}
