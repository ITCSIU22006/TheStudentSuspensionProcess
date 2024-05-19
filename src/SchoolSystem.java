public class SchoolSystem {

    private SchoolDatabase schoolDatabase;

    public SchoolSystem(SchoolDatabase schoolDatabase) {
        this.schoolDatabase = schoolDatabase;
    }

    public void receiveMisconductNotification(String studentName, String offenseDescription) {
        boolean isSevereOffense = determineOffenseSeverity(offenseDescription);
        if (!isSevereOffense) {
            gatherEvidence(studentName);
        }
        schoolDatabase.updateStudentRecord(studentName, offenseDescription);
    }

    private boolean determineOffenseSeverity(String offenseDescription) {
        // Logic to determine if the offense is severe (implementation not shown in the diagram)
        return offenseDescription.equals("Fighting");
    }

    private void gatherEvidence(String studentName) {
        // Logic to gather evidence for the misconduct (implementation not shown in the diagram)
        System.out.println("Gathering evidence for student: " + studentName);
    }
}
