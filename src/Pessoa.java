public class Pessoa {
    // Atributos String nome;
    String nome;
    String sobrenome;
    // Métodos comportamentos
    public void andar(){
        System.out.println("andou");
    }
    // métodos
    public void falar(){
        System.out.println("falei");
    }
    // Sobrecarga do método falar()
    public String falarr(String volume){
        return "falei" + volume;
    }
    // Construtor
    Pessoa(){

    }
    Pessoa(String _nome){
        this.nome = _nome;
    }

}
