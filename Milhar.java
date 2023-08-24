public class Milhar extends Dezena{
    private String[] centenasExtenso = {"","um mil", "dois mil", "tres mil", "quatro mil", "cinco mil", "seis mil", "sete mil", "oito mil", "nove mil"};

    public String mostraMilhar(String numero) {
        return centenasExtenso[Integer.parseInt(numero)];
    }
}
