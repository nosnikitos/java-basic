public class Person {

    String firstName;
    String lastName;
    int age;

    public void introduce() {
        System.out.println("Привет, меня зовут " + firstName + " " + lastName + ". Мне " + age + " лет .");
    }

    public static void main(String[] args) {
        Person person = new Person();

        person.firstName = "Никита";
        person.lastName = "Ноздрин";
        person.age = 27;

        person.introduce();
    }
}
