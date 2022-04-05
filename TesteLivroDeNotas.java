import javax.swing.JOptionPane;

public class TesteLivroDeNotas {
    public static void main(String[] args) {
        String nomeDaUC = JOptionPane.showInputDialog("Professor, qual o nome da UC?");
        //variável de referência
        LivroDeNotas livroDeNotas;
        //operador de construção de objetos: new
        livroDeNotas = new LivroDeNotas();
        //operador de acesso a membro: .
        //é a chamada do método
        //chamar (call) um método significa colocá-lo em execução
        livroDeNotas.exibirMensagem(nomeDaUC);
    }
}
