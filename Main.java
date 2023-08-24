import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Milhar milhar = new Milhar();
        Centena centena = new Centena();
        Unidade unidade = new Unidade();
        Dezena dezena = new Dezena();
        Caracter caracter = new Caracter();
        Scanner scanner = new Scanner(System.in);

        String resp = scanner.nextLine();
        caracter.ManupulaCaracter(resp);

        if(Integer.parseInt(caracter.numeroDigitado[0]) == 0 && Integer.parseInt(caracter.numeroDigitado[1]) == 0) {
            if(Integer.parseInt(caracter.numeroDigitado[2]) != 0 && Integer.parseInt(caracter.numeroDigitado[3]) != 0) {
                System.out.println(dezena.retornaDezenaUnidade(caracter.numeroDigitado[2], caracter.numeroDigitado[3]));
            }else {
                System.out.println(dezena.mostrarDezena(caracter.numeroDigitado[2]));
            }
        } else {
            System.out.println(centena.mostrarCentena(caracter.numeroDigitado[1], caracter.numeroDigitado[2], caracter.numeroDigitado[3]));
        }

        System.out.println(unidade.mostrarUnidade(caracter.numeroDigitado[3]));

        System.out.println(milhar.mostraMilhar(caracter.numeroDigitado[0]));


    }
}