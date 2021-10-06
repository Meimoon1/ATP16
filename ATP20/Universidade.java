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

        //Impressão dos objetos
        System.out.println("*-----------Funcionários---------------*");
        System.out.printf(" Nome: %s \n Sobrenome: %s \n Matrícula: %s \n Salário: %f \n Departamento: %s \n", f.getNome(), f.getSobrenome(), f.getMatricula(),f.getSalario(), f.getDepartamento());
        System.out.println("\n*----------Coordenadores--------------*");
        System.out.printf(" Nome: %s \n Sobrenome: %s \n Matrícula: %s \n Curso Coordenado: %s \n Bonus: %f \n", c.getNome(), c.getSobrenome(), c.getMatricula(), c.getCurso_coordenado(), c.getBonus());
        System.out.println("*----------------Alunos-----------------*");
        System.out.printf(" Nome: %s \n Sobrenome: %s \n Matricula: %s \n Curso: %s \n Turma: %s \n", a.getNome(), a.getSobrenome(), a.getMatricula(),a.getCurso(), a.getTurma());
    }
}
