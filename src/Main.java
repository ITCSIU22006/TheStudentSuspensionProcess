public class Main {

    public static void main(String[] args) {
        // Create an instance of the SchoolDatabase (assuming a simple example)
        SchoolDatabase schoolDatabase = new SchoolDatabase();

        // Create an instance of the School System with the database
        SchoolSystem schoolSystem = new SchoolSystem(schoolDatabase);

        // Create an instance of the School Staff with the School System
        SchoolStaff schoolStaff = new SchoolStaff(schoolSystem);

        // Simulate notifying a misconduct
        String studentName = "John Doe";
        String offenseDescription = "Disruptive behavior";
        schoolStaff.notifyMisconduct(studentName, offenseDescription);
    }
}
