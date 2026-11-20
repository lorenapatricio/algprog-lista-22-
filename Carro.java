public class Carro extends Veiculo {

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar() {
        int segundos = 10; // valor do X
        System.out.println(modelo + " " + marca + " está acelerando de 0 a 100 km/h em " + segundos + " segundos.");
    }
}