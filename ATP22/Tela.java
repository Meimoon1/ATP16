public class Tela {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.setNomeCompleto("Ana Luiza Martins");
        a.setIdade(28);
        a.setMatricula("189098790");

        Aluno a1 = new Aluno();
        a1.setNomeCompleto("Hannah Lima Rios");
        a1.setIdade(22);
        a1.setMatricula("8879880354");

        System.out.println(a);
        System.out.println("---------------------------");
        System.out.println(a1);
    }
}
