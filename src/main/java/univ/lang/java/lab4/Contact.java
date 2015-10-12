package univ.lang.java.lab4;

public class Contact {

    private final String name;
    private final String lastName;
    private final long age;
    private final City city;

    public Contact(final String name, final String lastName, final long age, final City city) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }

    public final String getName() {
        return this.name;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final long getAge() {
        return this.age;
    }

    public final City getCity() {
        return this.city;
    }
}
