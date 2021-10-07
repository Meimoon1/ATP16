public class Aluno{
    private String nomeCompleto;
    private int idade;
    private String matricula;

    public void setNomeCompleto(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }
    public String getNomeCompleto(){
        return nomeCompleto;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getMatricula(){
        return matricula;
    }

    @Override
    public String toString(){
        String mensagem = "Nome: "+ this.nomeCompleto + " \nIdade: " + this.idade + " \nMatricula: " + this.matricula;
        return mensagem;
    }
}    