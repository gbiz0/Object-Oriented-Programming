package exemploherança;


public class ExemploHerança {

    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        p1.setNome("Josué");
        p1.setIdade(18);
        p1.setSexo("M");
        System.out.println(p1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Luis Felipe Freitas");
        a1.setIdade(33);
        a1.setSexo("M");
        a1.setRa(111);
        a1.matricular();
        a1.fazerAniversario();
        System.out.println(a1.toString() + a1.getRa());

        Professor pr1 = new Professor();
        pr1.setNome("Guilherme Beltrão");
        pr1.setIdade(27);
        pr1.setSexo("M");
        pr1.setSalario(1000);
        pr1.aumentarSalario(5000);
        System.out.println(pr1.toString() + pr1.getSalario());
        
    }
    
}
