package existingRefactorings.removeMiddleMan;

record Manager(String name) {}
record Department(String name, Manager manager) {}

public class Person {
    private final String name;
    private final Department department;

    public Person(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public Manager getManager() {
        return department.manager();
    }
}

class External {
    public static void main(String[] args) {
        Person person = new Person("Bob", new Department("IT", new Manager("Alice")));
        Manager manager = person.getManager();
    }
}
