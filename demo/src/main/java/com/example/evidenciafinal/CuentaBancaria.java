package com.example.evidenciafinal;

import java.util.ArrayList;
import java.util.List;

class CuentaBancaria {
    private int numero;
    private double saldo;
    private String divisa;
    private List<CuotaManejo<? extends Habilitante>> cuotas;

    public CuentaBancaria(String nombre, Integer identificacion, int numero, double saldo, String divisa) {

        this.numero = numero;
        this.saldo = saldo;
        this.divisa = divisa;
        // crear la lista de cuots
        this.cuotas = new ArrayList<>();

    }

    @Override
    public String toString() {
        return "CuentaBancaria [numero=" + numero + "]";
    }

    public void agregarCuota(CuotaManejo<? extends Habilitante> cuota) {
        cuotas.add(cuota);
    }

    public List<CuotaManejo<? extends Habilitante>> getCuotas() {
        return cuotas;
    }

}
