import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student{
    protected String firstName;
    protected String lastName;
    int phone;
    Student(String fname,String lname,int p){
        firstName=fname;
        lastName=lname;
        phone=p;

    }
    public void display(){// display the details of the student
        System.out.println("First Name: "+firstName+"\nLast Name: "+lastName+"\nPhone: "+phone);
    }

}

class Grade extends Student{
    private int score;
    char grade;

    public Grade(String a,String b,int a1,int b1){
        super(a,b,a1);
        this.score=b1;

    }


//    public void display(){
//       super.display();
//       // System.out.println("Grade: "+grade);
//    }

    public char calculate(){
     if(score<40){
         grade='D';
     }
        else if(score>=40 && score<60){
         grade='B';
     }
        else if(score>=60 && score<75){
         grade='A';
     }
        else if(score>=75 && score<90){
         grade='E';

     }
        else
        grade='O';

        return grade;
    }

}
