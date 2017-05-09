package com.company;

/**
 * Created by Manu on 08/05/2017.
 */
public enum PuntoCardinal {

    ESTE('E','E'),
    OESTE('O','W'),
    NORTE('N','N'),
    SUR('S','S');

    private final char letraPuntoCardinalEs;
    private final char letraPuntoCardinalEn;

    //Constructor
    PuntoCardinal(char codigoEs, char codigoEn){

        this.letraPuntoCardinalEs = codigoEs;
        this.letraPuntoCardinalEn = codigoEn;
    }

    //Getter
    public char getLetraPuntoCardinalEs(){

        return this.letraPuntoCardinalEs;
    }

    public char getLetraPuntoCardinalEn(){

        return this.letraPuntoCardinalEn;
    }
}
