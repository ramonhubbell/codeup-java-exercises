public class NewPerson {

    public static void main (String [] args) {



        Person ramon = new Person ("Ramon");
        System.out.println( "ramon.getName() = " + ramon.getName());

        ramon.sayHello();

        Person sam = new Person ("Sam");
        sam.setName("sam");

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());



    }

}
