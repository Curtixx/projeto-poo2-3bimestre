public class Unidade {
    public String[] unidadeExtenso = {"", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove"};
    public String mostrarUnidade(String numero) {
        return unidadeExtenso[Integer.parseInt(numero)];
    }

}
