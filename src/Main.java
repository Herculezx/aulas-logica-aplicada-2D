public class Main {
    public static void main(String[] args) {
        //aula inicial de orientação à objetos
        Pessoa adao = new Pessoa();
        // Declaração
        Pessoa qualquer;
        // Instanciação
        qualquer = new Pessoa();
        // Definir forma de objeto
        qualquer.nome = "Rita";
        qualquer.sobrenome = "Lee";
        // Definir comportamento
        qualquer.falar();
        System.out.println(qualquer.falar("alto"));

    }
}