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
  
    System.out.println("--- QUESTÃO 03---");
        CarroEsportivo meuCarroEsportivo = new CarroEsportivo();
        meuCarroEsportivo.setCarroInfo("Ferrari", "488 GTB", 2023);
        meuCarroEsportivo.setVelocidademaxima(330);
        meuCarroEsportivo.acelerar();
        System.out.println(meuCarroEsportivo);
        meuCarroEsportivo.setVelocidademaxima(80);
        System.out.println(meuCarroEsportivo);
        
        System.out.println("--- QUESTÃO 04---");
        Motor motorCarro = new Motor("V8", 500);
        
        carro meuCarroComMotor = new carro("Chevrolet", "Camaro", 2023, motorCarro);
        meuCarroComMotor.ligarCarro();
        motorCarro.exibirMotorInfo();

      }
    }
