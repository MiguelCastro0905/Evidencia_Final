package com.example.evidenciafinal;

import java.util.Date;

class Campana extends Habilitante {
    public Campana(Date fechaInicio, Date fechaFin, double monto) {
        super(fechaInicio, fechaFin, monto);
    }

    @Override
    public double calcularValor() {

        return (fechaFin.getTime() - fechaInicio.getTime());
    }
}