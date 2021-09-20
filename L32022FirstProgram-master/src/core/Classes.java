package core;

import java.util.ArrayList;
import java.util.List;

public class Classes {
    public Classes(){}
    private int classId;
    private String NomP;
    private Student President;
    private int levelActuel;
    private List<Student> students= new ArrayList<Student>();
    private List<Professor> professors= new ArrayList<Professor>();
    private List<cours> cours= new ArrayList<cours>();

    public List<core.cours> getCours() {
        return cours;
    }

    public void setCours(List<core.cours> cours) {
        this.cours = cours;
    }

    public Classes(int classId, String nomP, Student president, int levelActuel) {
        this.classId = classId;
        NomP = nomP;
        President = president;
        this.levelActuel = levelActuel;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getNomP() {
        return NomP;
    }

    public void setNomP(String nomP) {
        NomP = nomP;
    }

    public Student getPresident() {
        return President;
    }

    public void setPresident(Student president) {
        President = president;
    }

    public int getLevelActuel() {
        return levelActuel;
    }

    public void setLevelActuel(int levelActuel) {
        this.levelActuel = levelActuel;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }
    public int getEffectifs(){
        int k=0;
        for (Student x:students
             ) {
            k++;
        }
        return k;
    }
    @Override
    public String toString() {
        return "Class{" +
                "'Nom de la Promotion'='" + NomP + '\'' +
                ", 'Nom du President'='" + President.getFname()+" "+President.getLname() + '\'' +
                ", 'Id de la class'='" + classId + '\'' +
                ", 'Level actuel'='" + levelActuel + '\'' +
                ", 'Effectif'" + getEffectifs() + '\'' +
                '}';
    }


}
