package POO;

public class CarroEsportivo extends carro {
    private int velocidademaxima;

    public int getVelocidademaxima() {
        return velocidademaxima;
    }

    public void setVelocidademaxima(int velocidademaxima) {
        this.velocidademaxima = velocidademaxima;
    }
    
    public CarroEsportivo(){
    
 }
    public void acelerar(){
        System.out.println("Acelerando o carro esportivo!");
    }
    
    @Override
    public String toString(){
        return "Informações do Carro Esportivo:\n" +
                "Marca :"+getMarca() + " Modelo :" + getModelo() + " Ano: " + getAno() + " Velocidade Máxima :"+velocidademaxima+" Km/h";
        
    }
}