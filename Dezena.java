public class Dezena extends Unidade {
    public String[] dezenasExtenso = {"", "dez", "vinte", "trinta", "quarenta", "cinquenta", "secenta", "setenta", "oitenta", "noventa"};
    public String retornaDezenaUnidade(String dezena, String unidade){

        if(Integer.parseInt(unidade) == 0) {
            return dezenasExtenso[Integer.parseInt(dezena)];
        }
        else {
            return dezenasExtenso[Integer.parseInt(dezena)] + " e " +unidadeExtenso[Integer.parseInt(unidade)];
        }
    }
    public String mostrarDezena(String numero) {
        return dezenasExtenso[Integer.parseInt(numero)];
    }
}
