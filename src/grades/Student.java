package grades;

import java.util.ArrayList;

public class Student {

//    It should have private properties for the student's name, and grades.
    private String name;
    private ArrayList<Integer> grades;

//    The grades property should be an ArrayList of integers.
//    The student class should have a constructor that sets name property,
//    and initializes the grades property as an empty ArrayList.
    public Student ( String studentName) {
        this.name = studentName;
        this.grades = new ArrayList<>();
    }

        // returns the student's name
         public String getName() {
            return this.name;
        }
//      adds the given grade to the grades property
        public void addGrade(int grade) {
             this.grades.add(grade) ;
        }
//      returns the average of the students grades
        public double getGradeAverage() {
            double sum = 0;
            for(Integer grade : this.grades)
                sum += grade;
            return (sum / this.grades.size());
        }

//        Test your Student class by adding a main method and creating Student objects.
//        Verify that you can add grades to each object, and that your getGradeAverage
//        method correctly returns the average of the student's grades.

    public static void main ( String [] args){

//        Student student = new Student("Ramon");

//        student.add(new grades());
//        System.out.println("student = " + student.name);
//        student.addGrade(80);
//        student.addGrade(75);
//        student.addGrade(95);
//        System.out.println(student.getGradeAverage());


    }

}
