package core;

import core.view.Features;

import java.util.ArrayList;
import java.util.List;

public class PlayBook {

    public static void main(String[] args) {

        Student aStudent = new Student("Muller","Merkel");



        Student bStudent = new Student();
        bStudent.setFname("Genevieve");
        bStudent.setLname("Bröhmm");

//students listing
        List<Student> s1= new ArrayList<Student>();
        s1.add(aStudent);
//proffesors set up
        Professor Brutus= new Professor("Moise","Brutus",12);
//cour set up
        cours Linux=new cours("Linux",Brutus);
        List<cours> coursList= new ArrayList<cours>();
//classes section
        Classes classA = new Classes(12,"Etoile",aStudent,3);
        classA.setStudents(s1);
        classA.setCours(coursList);
        classA.getCours().add(Linux);
        classA.getStudents().add(bStudent);

//materiel section
        Materiels matA= new Materiels("Laptop","scolaire",Brutus);

//display stuffs
        Features.display(classA.getPresident().toString());
        Features.display(bStudent.toString());
        Features.display(classA.toString());
        Features.display(Linux.toString());
        Features.display(matA.toString());


    }
}
