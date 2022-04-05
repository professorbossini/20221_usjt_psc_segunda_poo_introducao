//alta coesão
//você deseja que as suas classes sejam altamente coesas
//uma classe altamente coesa é aquela que tem somente um propósito, somente uma finalidade, somente uma razão de ser, ela resolve somente um problema
//alta coesão promove a reusabilidade e a manutenabilidade do seu código
public class LivroDeNotas{
    //método (comportamento)
    //() é a lista de parâmetros desse método

    //definição do método: aqui nós dissemos que ele existe
    public void exibirMensagem(String uc){
        System.out.println("Bem vindo ao livro de notas da UC " + uc);
    }
}