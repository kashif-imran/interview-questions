package synechron.immutableclass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//why use immutable -> nobody changes its attributes. By default it is thread safe in multithreaded environment
//cost of immutable object is that if we want to change a field i have to create a new object
//Usage:-
// 1. Key of a hashmap
// 2. Where ever you dont want anyone to change the argument passed to it. Argument to method or returning the object from the method.
// suppose you have a method sendEmail(students) we dont want anyone to change the email or any other property of the student class
// 3. Thread safety

public final class Employee {
    // class is declared final so that no class overrides. The subclass can have same fields as superclass and change the values and later upcast to student
    private final int id;
    private final String name;
    private final LocalDate joinDate;
    private final Date birthDate;
    private final List<Department> departments;
    private final Designation designation;

    public Employee(int id, String name, LocalDate joinDate, Date birthDate, List<Department> departments,Designation designation) {
        this.id = id;
        this.name = name;
        this.joinDate = joinDate;
        this.birthDate = birthDate;
        this.departments = departments;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public Date getBirthDate() {
        return (Date) birthDate.clone();
    }

    public List<Department> getDepartments() {
        return new ArrayList<>(departments);
    }

    public Designation getDesignation() throws CloneNotSupportedException {
        return (Designation) designation.clone();
    }
}
