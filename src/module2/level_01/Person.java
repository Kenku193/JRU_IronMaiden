package module2.level_01;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        System.out.println("Сейчас будет установлено новое значение переменной firstName");
        System.out.println("Старое значение: " + this.firstName);
        this.firstName = firstName;
        System.out.println("Новое значение: " + firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String prepareInfromation(){
        return "Client information: " + this.firstName + " " + this.lastName;
    }

}

class Cilent extends Person {
    private int uuid;

    public Cilent(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public String prepareInfromation() {
        return "Client information: " + super.getFirstName() + " " + super.getLastName() + " " + this.uuid;
    }
}

class Employee extends Person{

    public Employee(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public String prepareInfromation() {
        return null;
    }
}
