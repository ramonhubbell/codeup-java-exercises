import java.util.Arrays;

public class ArraysExercises {

    public static void main (String [] args) {
        System.out.println("Arrays exercises is ready!");

//        1. Array Basics

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

//        Create an array that holds 3 Person objects.
        String [] Person = {"Ramon", "David", "Jason"};

//        Assign a new instance of the Person class to each element.
//        Person[0] = "Edmond";
//        Person[1] = "Delphine";
//        Person[2] = "Christophe";

////        Iterate through the array and print out the name of each person in the array.
//        for (String person : Person) {
//            System.out.println(person);
//        }

//        Create a static method named addPerson.
//        It should accept an array of Person objects, as well as a single person object
//        to add to the passed array.
//        It should return an array whose length is 1 greater than the passed array, with
//        the passed person object at the end of the array.

        String [] newArray = addPerson(Person, "Sam");
        System.out.print(Arrays.toString(newArray));

//        System.out.println(addPerson( Person, "Buttons" ));
//        addPerson( Person, "Elizabeth");

    }

    public static String [] addPerson( String [] namesArray, String name) {
        String [] newNamesArray = Arrays.copyOf( namesArray, namesArray.length + 1);
//        System.out.println(newNamesArray.length);
        newNamesArray[ newNamesArray.length -1 ] = name;
//        System.out.println(name);
        for (String n : newNamesArray) {
//            return (n);
            System.out.println(n);
        }
        return newNamesArray;
    }


}
