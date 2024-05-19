public class SchoolStaff {

    private SchoolSystem schoolSystem;

    public SchoolStaff(SchoolSystem schoolSystem) {
        this.schoolSystem = schoolSystem;
    }

    public void notifyMisconduct(String studentName, String offenseDescription) {
        schoolSystem.receiveMisconductNotification(studentName, offenseDescription);
    }
}


