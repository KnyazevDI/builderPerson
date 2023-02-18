import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected  OptionalInt age;
    protected  String sity;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = OptionalInt.of(age);
    }

    public Person(String name, String surname, int age, String sity) {
        this.name = name;
        this.surname = surname;
        this.age = OptionalInt.of(age);
        this.sity = sity;
    }

    public boolean hasAge() {
        if (!age.isPresent()) return false;
        else return true;
    }

    public boolean hasAddress() {
        if (sity != null) return true;
        else return false;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public OptionalInt getAge() {
        return age;
    }
    public String getAddress() {
        return sity;
    }

    public void setAddress(String sity) {
        this.sity = sity;
    }
    public void happyBirthday() {
        if (age != null) this.age = OptionalInt.of(1 + age.getAsInt());
    }

    @Override
    public String toString() {
        return (name + " " + surname + ": "+
                        "\n возраст - " + age.getAsInt() +
                        "\n город - " + sity);
    }


    public PersonBuilder newChildBuilder() {
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.surname = getSurname();

        personBuilder.sity = getAddress();
        return personBuilder;
    }
}
