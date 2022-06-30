package synechron;

public class ImmutableClassExample {

    final class DumbImmutableEmployee {
        private final int id;
        private final String name;
        private final Department department;

        public DumbImmutableEmployee(int id, String name, Department department) {
            this.id = id;
            this.name = name;
            this.department = department;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    class Department {
        private int id;
        private String name;

        public Department(int id, String name) {
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
    }

    public static void main(String[] args) {

    }
}
