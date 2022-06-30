package interview_programs;

class EmployeeDetails {

    public void getDetails(String name) {
        name = "abc";
    }
}

public class Employee {

    public void getEmployee() {
        String fullName = "def";

        EmployeeDetails ed = new EmployeeDetails();

        ed.getDetails(fullName);

        System.out.println(fullName); //o/p ABC

    }
}
