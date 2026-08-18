public class SeguridadBanco {

    public static void main(String[] args) {

        double monto = 7500000;
        int compras = 8;

        if (monto > 10000000) {

            System.out.println("TRANSACCION BLOQUEADA");

        } else if (monto > 5000000 && compras > 5) {

            System.out.println("TRANSACCION PARA REVISION");

        } else {

            System.out.println("TRANSACCION APROBADA");
        }
    }
}