public class CadastroPessoas {
    public static void main(String[] args) {
        PessoaFisica[] p = new PessoaFisica[5];

        PessoaFisica p1 = new PessoaFisica();
        p1.setCodigo(123);
        p1.setNome("Melissa");
        p1.setSobrenome("Matos");
        p1.setIdade(23);
        p1.setRg("09998393999209");
        p1.setCpf("009039309303039");

        PessoaFisica p2 = new PessoaFisica();
        p2.setCodigo(124);
        p2.setNome("Laercio");
        p2.setSobrenome("Rios");
        p2.setIdade(23);
        p2.setRg("09998393999209");
        p2.setCpf("009039309303039");

        PessoaFisica p3 = new PessoaFisica();
        p3.setCodigo(125);
        p3.setNome("Harry");
        p3.setSobrenome("Potter");
        p3.setIdade(15);
        p3.setRg("09998393999209");
        p3.setCpf("009039309303039");

        PessoaFisica p4 = new PessoaFisica();
        p4.setCodigo(126);
        p4.setNome("Deanerys");
        p4.setSobrenome("Targeryan");
        p4.setIdade(22);
        p4.setRg("09998393999209");
        p4.setCpf("009039309303039");

        PessoaFisica p5 = new PessoaFisica();
        p5.setCodigo(123);
        p5.setNome("Bilbo");
        p5.setSobrenome("Bolseiro");
        p5.setIdade(160);
        p5.setRg("09998393999209");
        p5.setCpf("009039309303039");

        p[0] = p1;
        p[1] = p2;
        p[2] = p3;
        p[3] = p4;
        p[4] = p5;
        
        for(PessoaFisica pf : p){
            System.out.println("-------------------------------------------------");
           System.out.printf("\n Código: %d \n Nome: %s \n Sobrenome: %s \n Idade: %d \n RG: %s \n CPF: %s \n ",pf.getCodigo(), pf.getNome(),pf.getSobrenome(), pf.getIdade(),pf.getRg(),pf.getCpf());
        }

    }

    
}
