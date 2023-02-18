public class PersonBuilder {
    public String name;
    public String surname;
    public int age;
    public String sity;

    public PersonBuilder() {
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }
    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 120) throw new IllegalArgumentException("Не верно указан возраст");
        else this.age = age;
        return this;
    }
    public PersonBuilder setAddress(String sity) {
        this.sity = sity;
        return this;
    }

    public Person build() {
        Person person = new Person(name, surname, age, sity);
        if (name == null || name.equals("") || surname == null || surname.equals("")) throw new
                IllegalStateException("не достаточно данных");
        else return person;
    }
}
