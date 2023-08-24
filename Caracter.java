import java.util.Objects;

public class Caracter {
    public String[] numeroDigitado = {"0", "0", "0", "0"};
    public String[] ManupulaCaracter(String numero) {
        switch (numero.length()) {
            case 1: //1
                numeroDigitado[3] = numero.substring(0,1);
                break;
            case 2: //12
                numeroDigitado[2] = numero.substring(0,1);
                numeroDigitado[3] = numero.substring(1,2);
                break;
            case 3: //123
                numeroDigitado[1] = numero.substring(0,1);
                numeroDigitado[2] = numero.substring(1,2);
                numeroDigitado[3] = numero.substring(2,3);
                break;
            case 4://1234
                numeroDigitado[0] = numero.substring(0,1);
                numeroDigitado[1] = numero.substring(1,2);
                numeroDigitado[2] = numero.substring(2,3);
                numeroDigitado[3] = numero.substring(3,4);
                break;

        }
        return numeroDigitado;

    }
}
