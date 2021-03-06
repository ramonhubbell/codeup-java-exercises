package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    static Input input = new Input();

    public static void main(String[] args) {

//        Inside the main method, create a HashMap named students.
//        It should have keys that are strings that represent github
//        usernames, and values that are Student objects. Create at
//        least 4 student objects with at least 3 grades each, and
//        add them to the map.

        HashMap<String, Student> students = new HashMap<>();
        Student student1 = new Student("Steve");
        student1.addGrade(80);
        student1.addGrade(75);
        student1.addGrade(95);

        Student student2 = new Student("Joe");
        student2.addGrade(99);
        student2.addGrade(89);
        student2.addGrade(92);

        Student student3 = new Student("Melinda");
        student3.addGrade(86);
        student3.addGrade(85);
        student3.addGrade(93);

        Student student4 = new Student("Jessica");
        student4.addGrade(75);
        student4.addGrade(85);
        student4.addGrade(83);

        students.put("username1", student1);
        students.put("username2", student2);
        students.put("username3", student3);
        students.put("username4", student4);

        displayWelcome(students);


    }

    public static void displayWelcome(HashMap<String, Student> students) {
        System.out.println("Welcome!\n\nHere are the GitHub usernames of our students:\n");
        int i = 1;


        do {
            for (String username : students.keySet()) {
                System.out.printf("| %s | ", username);
                i++;
            }
            System.out.println("\n\nWhat student would you like to see more information on?");
            String typedKey = input.getString();
            if (students.containsKey(typedKey)) {
                System.out.println("Name: " + students.get(typedKey).getName() + " - " + "GitHub Username: " + typedKey);
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + "\"" + typedKey + "\"" + ".");
            }
            System.out.println("Would you like to see another student?");
        } while (input.yesNo());
        System.out.println("Goodbye, and have a wonderful day!");
    }

}
