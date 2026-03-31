package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        carro01.nome = "Sandero";
        carro01.modelo = "1.6";
        carro01.ano = 2018;
        Carro carro02 = new Carro();
        carro02.nome = "Jetta";
        carro02.modelo = "2.0";
        carro02.ano = 2020;
        System.out.println("Carro 1\n" + " Nome: " + carro01.nome + " | Modelo: " + carro01.modelo + " | Ano: " +carro01.ano);
        System.out.println("Carro 2\n" + " Nome: " + carro02.nome + " | Modelo: " + carro02.modelo + " | Ano: " +carro02.ano);


    }
}
