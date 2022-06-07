package deposito;

import deposito.CDeposito;

public class Main {

    public static void main(String[] args) throws Exception {
        depuracion_Pruebas();
        //float cantidad;
        //refactorizacion_Documentacion();
    }

    public static void depuracion_Pruebas() throws Exception {
        // Depuracion. Se detiene siempre
        CDeposito deposito1 = new CDeposito();

        System.out.println("Contenido Inicial: " + deposito1.getLitros() + " L");
        // Depuracion. Provoca parada por usar cantidad menor de 0
        deposito1.llenarPruebas(-100);
        System.out.println("Contenido Inicial: " + deposito1.getLitros() + " L");
        deposito1.llenarPruebas(100);
        System.out.println("Contenido tras llenado: " + deposito1.getLitros() + " L");
        deposito1.llenarPruebas(200);
        System.out.println("Contenido tras llenado: " + deposito1.getLitros() + " L");
        // Depuracion. Provoca parada con codicion de tercer aumento litros
        deposito1.llenarPruebas(300);
        System.out.println("Contenido tras llenado: " + deposito1.getLitros() + " L");
        deposito1.quitarPruebas(50);
        System.out.println("Contenido tras vaciado: " + deposito1.getLitros() + " L");

    }

    public static void refactorizacion_Documentacion(float cantidad) {
        operativa_deposito(cantidad);
    }

    public static void operativa_deposito(float cantidad) {
        CDeposito miDeposito;
        double litrosLitrosActual;

        miDeposito = new CDeposito("Paco Pérez", "1000-2365", 3500, 0);
        litrosLitrosActual = miDeposito.estado();
        System.out.println("El contenido actual de litros es " + litrosLitrosActual);

        try {
            miDeposito.quitar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar líquido");
        }
        try {
            System.out.println("Llenado en depósito");
            miDeposito.llenar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar líquido");
        }

        System.out.println("La cantidad actual de litros es " + miDeposito.estado());
    }
}
