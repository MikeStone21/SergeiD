public class Worker {

   Person person;
   //char gender;
   int salary;

   Worker(String name,int age,char gender,int salary) {
//       person = new Person(name,age,gender);
//       this.salary = salary;
       this(new Person(name,age,gender),salary);

   }

   Worker(Person person,int salary){
       this.person = person;
       this.salary = salary;
   }

    boolean isAdult() {
        if (person.age >= 18) {
        return true;
    } else {
            return false;
        }

}
    double getTax() {
    return salary * 0.1;
    }

    void printWorker() {
        person.printPerson();
        System.out.println(", salary: " + salary);
    }
}
