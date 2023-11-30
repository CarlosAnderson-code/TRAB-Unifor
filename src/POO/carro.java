public class carro {
    
    String marca;
    String modelo;
    int ano;
    private double quilometratem;
    Motor motor;
    
    public carro() {
       
    }
    public carro(String marca, String modelo, int ano, Motor motor){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
    }
    
    public void ligarCarro(){
        motor.ligar();
    }
    public double getQuilometratem() {
        return quilometratem;
    }
    public void setQuilometratem(int quilometratem) {
        this.quilometratem = quilometratem;
    }
    public void rodar(double quilometrospercorridos){
        if(quilometrospercorridos >= 0){
            quilometratem = quilometratem+quilometrospercorridos;
        }else{
        
        }
    } 
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void setCarroInfo(String marca,String modelo,int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public void exibirCarroInfo(){
        System.out.println("Marca: "+marca+"\n"
                +"Modelo: "+modelo+"\n"
                +"Ano: "+ano);
    }
}
