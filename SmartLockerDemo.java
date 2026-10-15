public class SmartLockerDemo {
    public static void main(String[] args) {
        Locker[] lockers = {
            new Locker("A1"),
            new Locker("B2"),
            new Locker("C3")
        };

        for (Locker locker : lockers) {
            locker.assign();
            System.out.println(locker.describe());  // runtime dispatch picks the right describe()
        }
    }
}