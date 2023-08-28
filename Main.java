import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Milhar milhar = new Milhar();
        Centena centena = new Centena();
        Unidade unidade = new Unidade();
        Dezena dezena = new Dezena();
        Caracter caracter = new Caracter();
        Scanner scanner = new Scanner(System.in);
        String resp = "";
        for(int i = 0; i <= 9999; i++){
            resp = scanner.nextLine();
            caracter.ManupulaCaracter(resp);
            if(Integer.parseInt(caracter.numeroDigitado[0]) != 0) {
                caracter.retornaValorextensoMaiusculo(milhar.mostraMilhar(caracter.numeroDigitado[0], caracter.numeroDigitado[1], caracter.numeroDigitado[2], caracter.numeroDigitado[3]));
            } else if (Integer.parseInt(caracter.numeroDigitado[1]) != 0) {
                caracter.retornaValorextensoMaiusculo(centena.mostrarCentena(caracter.numeroDigitado[1], caracter.numeroDigitado[2], caracter.numeroDigitado[3]));
            } else if(Integer.parseInt(caracter.numeroDigitado[2]) != 0) {
                caracter.retornaValorextensoMaiusculo(dezena.retornaDezenaUnidade(caracter.numeroDigitado[2], caracter.numeroDigitado[3]));
            } else if (Integer.parseInt(caracter.numeroDigitado[3]) != 0) {
                caracter.retornaValorextensoMaiusculo(unidade.mostrarUnidade(caracter.numeroDigitado[3]));
            } else if(Integer.parseInt(caracter.numeroDigitado[0]) == 0) {
                caracter.retornaValorextensoMaiusculo(unidade.mostrarUnidade(caracter.numeroDigitado[0]));
            }
        }
    }
}