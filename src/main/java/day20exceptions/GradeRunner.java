package day20exceptions;

import java.util.ArrayList;
import java.util.List;

public class GradeRunner {

    public static void main(String[] args) {





    }


    // Create a method adds the grades into the grade list

    public static List<Integer>addGrades(int grade){

        List<Integer>gradesList = new ArrayList<>();  // I created my own exception for my application at IllegalGradeException Class.

        if(grade>=0 && grade<=100){
            gradesList.add(grade);
        }else{
            throw new C03IllegalGradeException("Grade cannot be less than zero and more than 100");
        }

        return gradesList;

    }


}
