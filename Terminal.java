import javax.swing.*;

public class Terminal {
    public static void main(String[] args) {
        while (true) {

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
                    escolhaReciboOpcoes(listaRecibos, sdf);
                    break;
                case 1: // Administrador
                    escolhaEquipamentoOpcoes(listaClientes, listaEquipamentos);
                    break;
                case 2: // Sair
                    JOptionPane.showMessageDialog(null, "Programa encerrado.");
                    break;

            }
        }
    }
}