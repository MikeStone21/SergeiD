public class Test2 {
    public static void main(String[] args) {

       Worker worker1 = new Worker("Sergey",30,'M',100000);
//        worker1.person.name = "Sergey";
//        worker1.person.age = 30;
//        worker1.person.gender = 'M';
//        worker1.salary = 100000;
//
//        Worker worker2 = new Worker();
//        worker2.person.name = "Anna";
//        worker2.person.age = 20;
//        worker2.person.gender = 'F';
//        worker2.salary = 200000;
//
//
      worker1.printWorker();
        System.out.println();
//       worker2.printWorker();

//        Person person = new Person("Sergey",30,'M');
//        person1.printPerson();
//        Person person2 = new Person("Anna",30,'F');
//
//        person2.printPerson();

//        Worker worker = new Worker("Sergey",30,'M',100000);
//        worker1.printWorker();
//        System.out.println();

        Person person = new Person("Anna",20,'F');
        Worker worker2 = new Worker(person,200000);
        worker2.printWorker();
    }
}
