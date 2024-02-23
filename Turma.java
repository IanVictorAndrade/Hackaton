import javax.swing.JOptionPane;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Turma {
    private String IdTurma;
    private String modalidade;
    private String curso;
    private String periodoAno;
    private String turno;
    private String disciplinasTurma;

    //Construtor

    public Turma(String idTurma, String modalidade, String curso, String periodoAno, String turno,
            String disciplinasTurma) {
        IdTurma = idTurma;
        this.modalidade = modalidade;
        this.curso = curso;
        this.periodoAno = periodoAno;
        this.turno = turno;
        this.disciplinasTurma = disciplinasTurma;
    }

    // Getters e Setters

    public String getIdTurma() {
        return IdTurma;
    }

    public void setIdTurma(String idTurma) {
        IdTurma = idTurma;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getPeriodoAno() {
        return periodoAno;
    }

    public void setPeriodoAno(String periodoAno) {
        this.periodoAno = periodoAno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getDisciplinasTurma() {
        return disciplinasTurma;
    }

    public void setDisciplinasTurma(String disciplinasTurma) {
        this.disciplinasTurma = disciplinasTurma;
    }

    //Metodos


    public static String listarTurmas() {
        return null;
    }

}