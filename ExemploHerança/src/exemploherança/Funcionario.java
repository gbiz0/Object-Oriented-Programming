package exemploherança;


public class Funcionario extends Pessoa{
    private boolean trabalhando;
    private String funcao;
    
    public void mudarFuncao(){
        System.out.println("Função alterada com sucessio");
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
}
