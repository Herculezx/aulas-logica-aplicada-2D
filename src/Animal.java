public class Animal {
    // Atributos
    String nome;
    String raça;
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

}
