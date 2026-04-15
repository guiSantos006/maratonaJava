package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Charles");
        funcionario.setIdade(29);
        funcionario.setSalarios(new double[]{1200,2000,5000});
        funcionario.imprimeFuncionario();
    }
}
