import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Disciplina {

    private int Id;
    private String nomeDisciplina;
    private int cargaHoraria;
    private String nivel;
    private String periodo;
    private String categoria;
    private String professorResponsavel;


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

    public String getNivel() { return nivel; }

    public void setNivel(String nivel) { this.nivel = nivel; }

    public String getPeriodo() { return periodo; }

    public void setPeriodo(String periodo) { this.periodo = periodo; }

    public String getCategoria() { return categoria; }

    public void setCategoria(String categoria) { this.categoria = categoria; }

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

    //Métodos




    public static String exibirChoque() {
        return null;
    }

    public static String[] getNomesDisciplinas(ArrayList<Disciplina> disciplinas) {
        String[] nomes = new String[disciplinas.size()];
        for (int i = 0; i < disciplinas.size(); i++) {
            nomes[i] = disciplinas.get(i).getNomeDisciplina();
        }
        return nomes;
    }

}
