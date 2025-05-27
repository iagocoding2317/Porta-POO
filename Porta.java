public class Porta {
    private String cor;
    private int altura;
    private int largura; 
    private boolean estaAberta;
    
    public Porta(String cor, int altura, int largura, boolean estaAberta) {
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
        this.estaAberta = estaAberta;
    }

   public String getCor(){
     return cor;
   }

   public int getAltura(){
     return altura;
   }

   public int getLargura(){
     return largura;
   }

   public boolean getEstaAberta(){
    return estaAberta;
   }

   public void setCor(String cor){
    this.cor = cor;
   }

   public void setAltura(int altura){
    this.altura = altura;
   }
   
   public void setLargura(int largura){
    this.largura = largura;
   }

   public void setestaAberta(boolean estaAberta){
    this.estaAberta = estaAberta;
   }

   public String toString() {
    return String.format("A cor é %s, a altura é %d, a largura é %d, a porta está aberta?: %s",  cor, altura, largura, estaAberta);
}

}
