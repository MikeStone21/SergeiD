public class Person {

    String name;
    int age;
    char gender;

    public Person(String name) {
        this.name = name;
    }

    Person(String name, int age, char gender) {

        //this.name = name;
        this(name);
        this.age = age;
        this.gender = gender;
    }

    void printPerson() {
        System.out.print("name: " + name);
        System.out.print(" age: " + age);
        System.out.print(", gender: " + gender);

    }


}
