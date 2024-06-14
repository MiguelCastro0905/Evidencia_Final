package com.example.evidenciafinal;

import java.util.*;

class Decreto extends Habilitante {
    public Decreto(Date fechaInicio, Date fechaFin, double monto) {
        super(fechaInicio, fechaFin, monto);
    }

    @Override
    public double calcularValor() {
        return 1000;
    }
}
