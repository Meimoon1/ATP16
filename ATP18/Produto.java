package ATP18;

public class Produto {
    private int codigo;
    private String nome;
    private String descricao;
    private double valor;

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return this.codigo;
    }


    public void setNome(String nome){
        this.nome = nome;
    }   
    public String getNome(){
        return this.nome;
    }

    public void setdescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescicao(){
        return this.descricao;
    }



}
