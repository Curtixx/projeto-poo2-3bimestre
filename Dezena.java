public class Dezena extends Unidade {
    private String[] dezenasEunidadesExtenso = {"", "onze", "doze", "treze", "quatorze", "quinze", "dezeseis", "dezesete", "dezoito", "dezenove"};
    public String[] dezenasExtenso = {"", "dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
    public String retornaDezenaUnidade(String dezena, String unidade){
        if(Integer.parseInt(unidade) == 0) {
            return dezenasExtenso[Integer.parseInt(dezena)];

        } else if (Integer.parseInt(dezena) == 1 && Integer.parseInt(unidade) != 0) {

            return dezenasEunidadesExtenso[Integer.parseInt(unidade)];
        } else {
            return dezenasExtenso[Integer.parseInt(dezena)] + " e " + unidadeExtenso[Integer.parseInt(unidade)];
        }
    }
}
