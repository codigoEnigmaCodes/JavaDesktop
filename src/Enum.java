/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jduranca
 */
public class Enum {

    public static void main(String[] args) {

        ProcesoDePagoSimple procesoDePagoSimpleEnum;

        procesoDePagoSimpleEnum = ProcesoDePagoSimple.CARRITO;

        switch (procesoDePagoSimpleEnum) {
            case CARRITO -> {
                System.out.println("función de carrito" + procesoDePagoSimpleEnum);

            }

            case DIRECCION -> {
            }
            case METODO_PAGO -> {
            }
            case CONFIRMACION -> {
            }

        }
        
        
        ProcesoDePago procesoDePagoEnum;
        procesoDePagoEnum = ProcesoDePago.CARRITO;

        switch (procesoDePagoEnum) {
            case CARRITO:

                System.out.println(procesoDePagoEnum.value);
                System.out.println(ProcesoDePago.fromValue("Carrito"));
                System.out.println(ProcesoDePago.fromValue("CARRITO"));
                
                ProcesoDePago proceso = ProcesoDePago.fromValue("Metodo de pago");
                System.out.println(proceso);

                break;

            case DIRECCION:
                break;

            case METODO_PAGO:
                break;

            case CONFIRMACION:
                break;

        }

    }

    public enum ProcesoDePagoSimple {
        CARRITO,
        DIRECCION,
        METODO_PAGO,
        CONFIRMACION;

    }

    public static enum ProcesoDePago {
        CARRITO("Carrito"),
        DIRECCION("Dirección"),
        METODO_PAGO("Metodo de pago"),
        CONFIRMACION("Confirmación");

        private String value;

        ProcesoDePago(String value) {
            this.value = value;
        }

        public static ProcesoDePago fromValue(String text) {
            for (ProcesoDePago b : ProcesoDePago.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

    }
}
