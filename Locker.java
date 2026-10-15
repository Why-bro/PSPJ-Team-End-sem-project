public class Locker {
    protected String lockerId;
    protected boolean occupied;

    public Locker(String lockerId) {
        this.lockerId = lockerId;
        this.occupied = false;
    }

    public void assign() {
        occupied = true;
        System.out.println("Locker " + lockerId + " assigned.");
    }

    public String describe() {
        return "Locker " + lockerId + " (standard)";
    }
}