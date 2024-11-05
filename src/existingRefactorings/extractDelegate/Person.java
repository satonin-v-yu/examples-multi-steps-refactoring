package existingRefactorings.extractDelegate;

//class PhoneNumber {
//  int areaCode;
//  int number;
// }
public class Person {
    private final String name;

    private final int homeAreaCode;
    private final int homeNumber;

    private final int officeAreaCode;
    private final int officeNumber;

    public Person(String name, int homeAreaCode, int homeNumber, int officeAreaCode, int officeNumber) {
        this.name = name;
        this.homeAreaCode = homeAreaCode;
        this.homeNumber = homeNumber;
        this.officeAreaCode = officeAreaCode;
        this.officeNumber = officeNumber;
    }

    public String getName() {
        return name;
    }

    public int getHomeAreaCode() {
        return homeAreaCode;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public int getOfficeAreaCode() {
        return officeAreaCode;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public static void main(String[] args) {
        Person person = new Person("Bob", 812, 1234567, 812, 1234567);
    }
}
