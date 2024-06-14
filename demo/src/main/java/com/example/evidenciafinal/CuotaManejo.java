package com.example.evidenciafinal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class CuotaManejo<E extends Habilitante> {
    private E habilitante;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double monto;

    public CuotaManejo(E habilitante, LocalDate fechaInicio, LocalDate fechaFin, double monto) {
        this.habilitante = habilitante;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.monto = monto;
    }

    public void setHabilitante(E habilitante) {
        this.habilitante = habilitante;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public E getHabilitante() {
        return habilitante;
    }

    List<CuotaManejo<? extends Habilitante>> c = new ArrayList<>();
}