package com.example.evidenciafinal;

import java.util.Date;

abstract class Habilitante {
    protected Date fechaInicio;
    protected Date fechaFin;
    protected double monto;

    public Habilitante(Date fechaInicio, Date fechaFin, double monto) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.monto = monto;
    }

    public abstract double calcularValor();
}
