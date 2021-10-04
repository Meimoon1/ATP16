public class TelaPrincipalLoja{
public static void main(String[] args) {
    Produto p = new Produto();

    p.setCodigo(1330);
    int c = p.getCodigo();
    System.out.println(c);

    p.setNome("Liquidificador");
    String l = p.getNome();
    System.out.println(l);
    
    p.setdescricao("Cor preta, com 5 velocidades");
    String d = p.getDescicao();

    p.setValor(120.90);
    String v = p.getValor();
    System.out.println(v);

    


}










}