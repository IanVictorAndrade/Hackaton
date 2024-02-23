import javax.swing.JOptionPane;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class TerminalTesteProfessor {
    public static void main(String[] args) {
    ArrayList<Professor> professores = new ArrayList<>();
        Professor prof1 = new Professor("Alguém", 2023, null, 0, "2024", "2024", null, null, null, null);
        professores.add(prof1);

        String[] opcoesLogin = {"Logar como professor", "Logar como admnistrador"};

        int escolha = JOptionPane.showOptionDialog(null, "Como deseja realizar o login?", "Login", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoesLogin, opcoesLogin[0]);

        switch (escolha) {
            case 0:
                
                break;
            case 1:
                //loginComoAdministrador();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Nenhuma opção selecionada.");
                break;
        }
    }
}