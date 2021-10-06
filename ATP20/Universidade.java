public class Universidade {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        Coordenador c = new Coordenador();
        Aluno a = new Aluno();

        //criando objeto funcionario
        f.setNome("Maurício");
        f.setSobrenome("Martins");
        f.setMatricula("65777380");
        f.setSalario(1100.56);
        f.setDepartamento("Corpo doscente");

        //Criando objeto Coordenador
        c.setNome("Luiz");
        c.setSobrenome("Souza");
        c.setMatricula("998727290");
        c.setCurso_coordenado("História da Arte");
        c.setBonus(379.00);

        //Criando objeto aluno
        a.setNome("Luna");
        a.setSobrenome("Montenegro");
        a.setMatricula("88700929");
        a.setCurso("Física");
        a.setTurma("B");
        

    }
}
