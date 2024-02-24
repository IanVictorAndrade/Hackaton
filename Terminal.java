import javax.swing.*;
import java.util.ArrayList;

public class Terminal {
    public static void main(String[] args) {
        Disciplina disciplinas = new Disciplina();
        Professor professor = new Professor();
        Administrador adm = new Administrador();
        ArrayList<Professor> professores = adm.getProfessoresCadastrados(); // Aqui você precisa ter acesso aos professores cadastrados

        boolean loop = true;

        while (loop) {
            String[] opcoes = {"Professor", "Administrador", "Sair"};
            int opcao = JOptionPane.showOptionDialog(
                    null,
                    "Qual login deseja usar?",
                    "Menu de login",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);

            switch (opcao) {
                case 0: // Professor
                    String loginProfessor = JOptionPane.showInputDialog("Digite o login:");
                    String senhaProfessor = JOptionPane.showInputDialog("Digite a senha:");

                    Professor professorLogado = Professor.login(professores, loginProfessor, senhaProfessor);
                    if (professorLogado != null) {
                        JOptionPane.showMessageDialog(null, "Login como professor bem-sucedido!");
                        professorLogado.menuProfessor();
                    } else {
                        JOptionPane.showMessageDialog(null, "Login ou senha incorretos para professor.");
                    }
                    //professor.loginComoProfessor(professores);
                    break;
                case 1: // Administrador
                    disciplinas.cadastrarDisciplina();
                    disciplinas.listarDisciplinas();
                    adm.login();
                    adm.menuAdministrador();
                    break;
                case 2: // Sair
                    JOptionPane.showMessageDialog(null, "Programa encerrado.");
                    loop = false;
                    break;
            }
        }
    }
}
