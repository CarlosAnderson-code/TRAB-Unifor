package POO;

public class main {

  public static void main(String[] args) {
    System.out.println("--- QUESTÃO 01---");
    carro meucarro = new carro();
    meucarro.setCarroInfo("Toyota", "Corolla", 2023);
    meucarro.exibirCarroInfo();

    System.out.println("--- QUESTÃO 02---");
    meucarro.rodar(100);
    meucarro.rodar(-100);
    meucarro.rodar(50);
    meucarro.rodar(73);
    meucarro.rodar(122);
    meucarro.rodar(-3);
    System.out.println("Quilometragem: "+meucarro.getQuilometratem());
  
}
