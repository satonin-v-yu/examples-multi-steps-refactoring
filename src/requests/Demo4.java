package requests;

//extract method to get Person#getFullName()
public class Demo4 {
    private record Person(String firstName, String lastName) { }

    public static void main(String[] args) {
        Person person = new Person("Bob", "Smith");
        System.out.println(person.firstName() + " " + person.lastName());
    }
}
