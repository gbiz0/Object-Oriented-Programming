package exemploherança;


public class Professor extends Pessoa{
    private float salario;
    
    public void aumentarSalario(float valor){
        this.salario = this.salario + valor;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
