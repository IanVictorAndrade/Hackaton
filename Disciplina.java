import javax.swing.JOptionPane;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Disciplina {
    private int Id;
    private String nomeDisciplina;
    private int cargaHoraria;
    private String professorResponsavel;

    ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
    
    //Construtor
    
    public Disciplina(String nomeDisciplina, int cargaHorariaS) {
        this.nomeDisciplina = nomeDisciplina;
        this.cargaHoraria = cargaHorariaS;
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
        return cargaHoraria;
    }
    public void setCargaHorariaS(int cargaHorariaS) {
        this.cargaHoraria = cargaHorariaS;
    }
    public String getProfessorResponsavel() {
        return professorResponsavel;
    }
    public void setProfessorResponsavel(String professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    //Metodos

    public String listarDisciplinas() {
        this.disciplinas.forEach(disciplina -> {
            System.out.println(disciplina.getNomeDisciplina());
        });
        return null;
    }

    public static String exibirChoque() {
        return null;
    }

}
