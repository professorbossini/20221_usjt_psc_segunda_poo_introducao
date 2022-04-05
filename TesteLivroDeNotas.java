import javax.swing.JOptionPane;

public class TesteLivroDeNotas {
    public static void main(String[] args) {
        String nomeDaUC = JOptionPane.showInputDialog("Professor, qual o nome da UC?");
        LivroDeNotas livroDeNotas;
        livroDeNotas = new LivroDeNotas();
        livroDeNotas.nomeDaUC = nomeDaUC;
        livroDeNotas.exibirMensagem();
    }
}
