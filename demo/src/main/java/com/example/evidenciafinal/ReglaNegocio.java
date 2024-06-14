package com.example.evidenciafinal;

import java.util.Date;

class ReglaNegocio extends Habilitante {
    public ReglaNegocio(Date fechaInicio, Date fechaFin, double monto) {
        super(fechaInicio, fechaFin, monto);
    }

    @Override
    public double calcularValor() {

        return (fechaFin.getTime() - fechaInicio.getTime()) * monto * 0.05;
    }
}
