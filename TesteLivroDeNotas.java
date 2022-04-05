import javax.swing.JOptionPane;

public class TesteLivroDeNotas {
    public static void main(String[] args) {
        String nomeDaUC = JOptionPane.showInputDialog("Professor, qual o nome da UC?");
        
        LivroDeNotas livroDeNotas;
        livroDeNotas = new LivroDeNotas();
        livroDeNotas.nomeDaUC = nomeDaUC;
        livroDeNotas.exibirMensagem();

        LivroDeNotas livro2 = new LivroDeNotas();
        //syntax sugar
        //livro2.nomeDaUC = new String("Matemática");
        livro2.nomeDaUC = "Matemática";
        livro2.exibirMensagem();
    }
}
