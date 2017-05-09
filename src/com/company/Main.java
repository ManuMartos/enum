package com.company;

public class Main {

    public enum Semaforo{
        ROJO,
        AMARILLO,
        VERDE
    }

    /**
     * enum se utiliza para que solo tenga esos valores y no se puedan modificar.
     */
    public enum Refresco{
        COCACOLA,
        FANTA,
        SPRITE
    }

    public static void main(String[] args) {

        Semaforo colorSemaforo = Semaforo.VERDE;

        //if (colorSemaforo == Semaforo.VERDE){
        //    System.out.println("Pasa");
        //}else if (colorSemaforo == Semaforo.AMARILLO){
        //    System.out.println("Cuidado");
        //}else if (colorSemaforo == Semaforo.ROJO){
        //    System.out.println("No Pases");
        //}

        switch (colorSemaforo){
            case VERDE:
                System.out.println("Pasa");
                break;
            case AMARILLO:
                System.out.println("Cuidado");
                break;
            case ROJO:
                System.out.println("No pases");
        }

        System.out.println("===============");

        for (Semaforo color: Semaforo.values()) {
            System.out.println( color +"[" + color.ordinal() + "]" );
        }

        System.out.println("===============");

        /**
         * .values lo transforma a un array.
         */
        for (Refresco bebida: Refresco.values()) {
            System.out.println( bebida );
        }

        System.out.println("===============");

        PuntoCardinal direccion = PuntoCardinal.OESTE;

        System.out.println( direccion.getLetraPuntoCardinalEs());
        System.out.println( direccion.getLetraPuntoCardinalEn());

        System.out.println("===============");

        if (direccion.equals(PuntoCardinal.OESTE)){
            System.out.println("Lo que sea");
        }

        System.out.println("===============");

        if (direccion == PuntoCardinal.OESTE){
            System.out.println("sdfghjkl");
        }
    }
}
