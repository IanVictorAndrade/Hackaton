import javax.swing.JOptionPane;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Disciplina {
    private int Id;
    private String nomeDisciplina;
    private int cargaHoraria;
    private String professorResponsavel;

    public ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    //Construtor
//
//    public Disciplina(String nomeDisciplina, int cargaHorariaS) {
//        this.nomeDisciplina = nomeDisciplina;
//        this.cargaHoraria = cargaHorariaS;
//    }

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

    public void cadastrarDisciplina() {
        Disciplina disciplina = new Disciplina();
        disciplina.setNomeDisciplina(JOptionPane.showInputDialog("Digite o nome da disciplina: "));
        disciplina.setCargaHorariaS(Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horária da disciplina: ")));
        disciplinas.add(disciplina);
    }

    public void listarDisciplinas() {
        for (Disciplina disciplina : disciplinas) {
            JOptionPane.showMessageDialog(null, "Nome da disciplina: " + disciplina.getNomeDisciplina() + "\nCarga horária: " + disciplina.getCargaHorariaS());
        }
    }

    public static String exibirChoque() {
        return null;
    }

}
