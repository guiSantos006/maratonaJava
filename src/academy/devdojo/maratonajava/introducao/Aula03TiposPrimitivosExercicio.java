package academy.devdojo.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.

 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args){
        String nome = "Guilherme";
        String endereco = "Rua Itaquera";
        double salario = 19000.0;
        String dataRecebimentoSalario = "20/07/2030";
        String relatorio = "Eu, "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de R$"+salario+", na data "+dataRecebimentoSalario+".";
        System.out.println(relatorio);
    }
}


