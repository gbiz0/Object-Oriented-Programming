package exemploherança;


public class Aluno extends Pessoa{
    
    private int ra;
    
    public void matricular(){
        System.out.println("Matricula feita com sucesso!");
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
    
}
