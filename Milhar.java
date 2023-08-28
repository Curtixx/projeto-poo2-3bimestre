public class Milhar extends Centena{
    private String milhar = "mil";
    public String mostraMilhar(String milhar, String centena, String dezena, String unidade) {
        if(Integer.parseInt(milhar) == 0 && Integer.parseInt(centena) != 0) {
            return mostrarCentena(centena, dezena, unidade);
        } else if (Integer.parseInt(milhar) != 0 && Integer.parseInt(centena) == 0 && Integer.parseInt(dezena) == 0 && Integer.parseInt(unidade) == 0){
            return mostrarUnidade(milhar) + " " + this.milhar;
        } else if (Integer.parseInt(milhar) != 0 && Integer.parseInt(centena) != 0 && Integer.parseInt(dezena) == 0 && Integer.parseInt(unidade) == 0){
            return mostrarUnidade(milhar) + " " + this.milhar + " e " + centenasExtenso[Integer.parseInt(centena)];
        } else if (Integer.parseInt(milhar) != 0 && Integer.parseInt(centena) != 0 && Integer.parseInt(dezena) != 0 && Integer.parseInt(unidade) != 0){
            return mostrarUnidade(milhar) + " " + this.milhar + " " + centenasExtenso[Integer.parseInt(centena)] + " e " + retornaDezenaUnidade(dezena, unidade);
        } else if (Integer.parseInt(milhar) != 0 && Integer.parseInt(centena) != 0 && Integer.parseInt(dezena) != 0 && Integer.parseInt(unidade) == 0) {
            return mostrarUnidade(milhar) + " " + this.milhar + " " + centenasExtenso[Integer.parseInt(centena)] + " e " + retornaDezenaUnidade(dezena, unidade);
        }else if (Integer.parseInt(milhar) != 0 && Integer.parseInt(centena) == 0 && Integer.parseInt(dezena) != 0 && Integer.parseInt(unidade) == 0) {
            return mostrarUnidade(milhar) + " " + this.milhar + " e " + retornaDezenaUnidade(dezena, unidade);
        } else if (Integer.parseInt(milhar) != 0 && Integer.parseInt(centena) != 0 && Integer.parseInt(dezena) == 0 && Integer.parseInt(unidade) != 0) {
            return mostrarUnidade(milhar) + " " + this.milhar + " e " + centenasExtenso[Integer.parseInt(centena)] + " e " + unidadeExtenso[Integer.parseInt(unidade)];
        } else if (Integer.parseInt(milhar) != 0 && Integer.parseInt(centena) == 0 && Integer.parseInt(dezena) != 0 && Integer.parseInt(unidade) != 0) {
            return mostrarUnidade(milhar) + " " + this.milhar + " e " + retornaDezenaUnidade(dezena, unidade);
        } else if (Integer.parseInt(milhar) != 0 && Integer.parseInt(centena) == 0 && Integer.parseInt(dezena) == 0 && Integer.parseInt(unidade) != 0) {
            return mostrarUnidade(milhar) + " " + this.milhar + " e " + unidadeExtenso[Integer.parseInt(unidade)];
        }

        return "";
    }
}
