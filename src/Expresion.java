
import java.util.regex.Pattern;

/**
 *
 * @author jduranca
 */
public class Expresion {

    public static void main(String[] args) {

        Expresion ex = new Expresion();

        ex.numeros();

        ex.caracteres();

        ex.curp();

        ex.validaciones();

    }

    public void numeros() {

        String NUMEROS = "[0-9]+$";
        Pattern pattern = Pattern.compile(NUMEROS);
        String numero = "995";
        System.out.println("NUMEROS: 995 " + pattern.matcher(numero).matches());

        String NUMEROS_DECIMALES = "[0-9]+[.]?[0-9]+$";
        pattern = Pattern.compile(NUMEROS_DECIMALES);
        System.out.println("NUMEROS_DECIMALES: 995.4 " + pattern.matcher("995.4").matches());

        String MONEDA = "[$]([0]|[1-9]([0-9]{2})?|[1-9]([0-9]{2})?[,][0-9]{3}|[1-9]([0-9]{2})?[,][0-9]{3}[,][0-9]{3})([.][0-9]+)?$";
        pattern = Pattern.compile(MONEDA);

        System.out.println("MONEDA: $995 " + pattern.matcher("$995").matches());
        System.out.println("MONEDA: $0.50 " + pattern.matcher("$0.50").matches());
        System.out.println("MONEDA: $995.4 " + pattern.matcher("$995.4").matches());
        System.out.println("MONEDA: $100,012.00 " + pattern.matcher("$100,012.00").matches());
        System.out.println("MONEDA: $00,132 " + pattern.matcher("$00,132").matches());
        System.out.println("MONEDA: $001.60 " + pattern.matcher("$001.60").matches());
    }

    public void caracteres() {
        String expresion = "(([A-Z]+|[a-z]+))+$";
        Pattern pattern = Pattern.compile(expresion);
        System.out.println("cadena AaZz " + pattern.matcher("AaZz").matches());
        String expresion2 = "(([A-Z]+|[a-z]+|[áéóú]+)|[ñÑ]+)+$";
        pattern = Pattern.compile(expresion2);
        System.out.println("cadena introducción " + pattern.matcher("introducción").matches());
        System.out.println("cadena nuñes " + pattern.matcher("nuñes").matches());
        System.out.println("cadena cad1 " + pattern.matcher("cad1").matches());
        System.out.println("cadena cad# " + pattern.matcher("cad#").matches());
    }

    public void curp() {
        String REGULAR_EXPRESSION_VALIDATE_CURP = "[A-Z]{1}[AEIOUX]{1}[A-Z]{2}"
                + "[0-9]{2}(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])" + "[HM]{1}" + "(AS|BC|BS|CC|CS|CH|CL|CM|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS|NE)" + "[B-DF-HJ-NP-TV-Z]{3}" + "[0-9A-Z]{1}[0-9]{1}$";

        Pattern pattern = Pattern.compile(REGULAR_EXPRESSION_VALIDATE_CURP);

        String curp = "CECA650813HSLHRL09";
        System.out.println(pattern.matcher(curp).matches());

    }

    public void validaciones() {

        String CARACTERES_SEGUIDOS = ".*1(?!2).*$";
        Pattern pattern = Pattern.compile(CARACTERES_SEGUIDOS);
        System.out.println("cadena dd12fg " + pattern.matcher("dd12fg").matches());
        System.out.println("cadena dd13fg " + pattern.matcher("dd13fg").matches());

        String CANTIDAD_CARACTERES = "[A-Z]{5,10}$";
        pattern = Pattern.compile(CANTIDAD_CARACTERES);
        System.out.println("cadena AAFZZZZ " + pattern.matcher("AAFZZZZ").matches());
    }
}
