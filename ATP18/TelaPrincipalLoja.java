
public class TelaPrincipalLoja{
public static void main(String[] args) {
    Produto p = new Produto();

    p.setCodigo(1330);
    int c = p.getCodigo();
    System.out.println("Código: "+c);

    p.setNome("Liquidificador");
    String l = p.getNome();
    System.out.println("Nome: "+l);
    
    p.setdescricao("Cor preta, com 5 velocidades");
    String d = p.getDescicao();
    System.out.println("Descricão: "+d);

    p.setValor(120.90);
    double v = p.getValor();
    System.out.println("Valor: "+v);
}










}