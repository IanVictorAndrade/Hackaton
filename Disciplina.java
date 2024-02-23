import javax.swing.JOptionPane;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Disciplina {
    private int Id;
    private String nomeDisciplina;
    private int cargaHorariaS;
    private String professorResponsavel;
    
    //Construtor
    
    public Disciplina(String nomeDisciplina, int cargaHorariaS) {
        this.nomeDisciplina = nomeDisciplina;
        this.cargaHorariaS = cargaHorariaS;
    }

    //Getters e Setters

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
    public int getCargaHorariaS() {
        return cargaHorariaS;
    }
    public void setCargaHorariaS(int cargaHorariaS) {
        this.cargaHorariaS = cargaHorariaS;
    }
    public String getProfessorResponsavel() {
        return professorResponsavel;
    }
    public void setProfessorResponsavel(String professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    //Metodos

    public static String listarDisciplinas() {

    }

    public static String exibirChoque() {

    }

}
