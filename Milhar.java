public class Milhar extends Centena{
    private String[] milharExtensao = {"","um mil", "dois mil", "tres mil", "quatro mil", "cinco mil", "seis mil", "sete mil", "oito mil", "nove mil"};

    public String mostraMilhar(String milhar, String centena, String dezena, String unidade) {
        if(Integer.parseInt(milhar) == 0 && Integer.parseInt(centena) != 0) {
            return mostrarCentena(centena, dezena, unidade);
        } else if (Integer.parseInt(milhar) != 0 && Integer.parseInt(centena) == 0 && Integer.parseInt(dezena) == 0 && Integer.parseInt(unidade) == 0){
            return milharExtensao[Integer.parseInt(milhar)];
        } else if (Integer.parseInt(milhar) != 0 && Integer.parseInt(centena) != 0 && Integer.parseInt(dezena) == 0 && Integer.parseInt(unidade) == 0){
            return milharExtensao[Integer.parseInt(milhar)] + " e " + centenasExtenso[Integer.parseInt(centena)];
        } else if (Integer.parseInt(milhar) != 0 && Integer.parseInt(centena) != 0 && Integer.parseInt(dezena) != 0 && Integer.parseInt(unidade) != 0){
            return milharExtensao[Integer.parseInt(milhar)] + " " + centenasExtenso[Integer.parseInt(centena)] + " e " + retornaDezenaUnidade(dezena, unidade);
        } else if (Integer.parseInt(milhar) != 0 && Integer.parseInt(centena) != 0 && Integer.parseInt(dezena) != 0 && Integer.parseInt(unidade) == 0) {
            return milharExtensao[Integer.parseInt(milhar)] + " " + centenasExtenso[Integer.parseInt(centena)] + " e " + retornaDezenaUnidade(dezena, unidade);
        }else if (Integer.parseInt(milhar) != 0 && Integer.parseInt(centena) == 0 && Integer.parseInt(dezena) != 0 && Integer.parseInt(unidade) == 0) {
            return milharExtensao[Integer.parseInt(milhar)] + " e " + retornaDezenaUnidade(dezena, unidade);
        } else if (Integer.parseInt(milhar) != 0 && Integer.parseInt(centena) != 0 && Integer.parseInt(dezena) == 0 && Integer.parseInt(unidade) != 0) {
            return milharExtensao[Integer.parseInt(milhar)] + " e " + centenasExtenso[Integer.parseInt(centena)] + " e " + unidadeExtenso[Integer.parseInt(unidade)];
        } else if (Integer.parseInt(milhar) != 0 && Integer.parseInt(centena) == 0 && Integer.parseInt(dezena) != 0 && Integer.parseInt(unidade) != 0) {
            return milharExtensao[Integer.parseInt(milhar)] + " e " + retornaDezenaUnidade(dezena, unidade);
        } else if (Integer.parseInt(milhar) != 0 && Integer.parseInt(centena) == 0 && Integer.parseInt(dezena) == 0 && Integer.parseInt(unidade) != 0) {
            return milharExtensao[Integer.parseInt(milhar)] + " e " + unidadeExtenso[Integer.parseInt(unidade)];
        }

        return "";
    }
}
