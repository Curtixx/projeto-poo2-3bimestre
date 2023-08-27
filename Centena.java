public class Centena extends Dezena{
    public String[] centenasExtenso = {"", "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"};

    public String mostrarCentena(String centena, String dezena, String unidade) {

        if(Integer.parseInt(centena) != 0 && Integer.parseInt(dezena) == 0 && Integer.parseInt(unidade) == 0) {

            if(Integer.parseInt(centena) == 1) centenasExtenso[Integer.parseInt(centena)] = "cem";

            return centenasExtenso[Integer.parseInt(centena)];

        } else if(Integer.parseInt(centena) != 0 && Integer.parseInt(dezena) != 0 && Integer.parseInt(unidade) == 0) {

            return  centenasExtenso[Integer.parseInt(centena)] + " e " + dezenasExtenso[Integer.parseInt(dezena)];

        } else if (Integer.parseInt(centena) != 0 && Integer.parseInt(dezena) != 0 && Integer.parseInt(unidade) != 0){
            return centenasExtenso[Integer.parseInt(centena)] + " e " + retornaDezenaUnidade(dezena, unidade);

        } else if (Integer.parseInt(centena) != 0 && Integer.parseInt(dezena) == 0 && Integer.parseInt(unidade) != 0) {
            return centenasExtenso[Integer.parseInt(centena)] + " e " + unidadeExtenso[Integer.parseInt(unidade)];
        }

        return centena;
    }
}
