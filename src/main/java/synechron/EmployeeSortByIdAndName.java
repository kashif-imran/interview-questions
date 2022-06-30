package synechron;

import java.util.Arrays;
import java.util.List;

public class EmployeeSortByIdAndName {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee(1, "Babur"),
                new Employee(1, "Asif"),
                new Employee(3, "Careem"));
        list.sort((e1, e2) -> {
            if(e1.getId() == e2.getId()) {
                return e1.getName().compareTo(e2.getName());
            } else {
                return e1.getId() - e2.getId();
            }
        });
        list.forEach(System.out::println);
    }

    static class Employee {
        int id;
        String name;

        Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
