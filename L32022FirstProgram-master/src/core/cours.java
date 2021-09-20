package core;

import java.awt.*;

public class cours {
    private String matiere;
    private Professor professor;
    public cours(){}

    public cours(String matiere, Professor professor) {
        this.matiere = matiere;
        this.professor = professor;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    @Override
    public String toString() {
        return "Cours{" +
                "Nom de la matiere='" + matiere + '\'' +
                ", Le proffeseur='" + professor.getLname()+" "+professor.getFname() + '\'' +
                '}';
    }
}
