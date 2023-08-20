package day25Lambda;

import java.util.ArrayList;
import java.util.List;

public class C02Lambda {


    public static void main(String[] args) {


        Course c1 = new Course("Java", 124, "Summer", 97.2);

        Course c2 = new Course("SQL", 125,"Winter", 98.4);

        Course c3 = new Course("API", 138,"Spring",93.8);

        Course c4 = new Course("Selenium",111,"Winter",95.1);


        List<Course> courses = new ArrayList<>();
        courses.add(c1);    // data type is courses here. 
        courses.add(c2);
        courses.add(c3);
        courses.add(c4);
        System.out.println(courses);

    }
}
