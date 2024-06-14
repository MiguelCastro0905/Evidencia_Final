package com.example.evidenciafinal;

import java.time.LocalDate;
import java.util.*;

public class Prueba {
    public static void main(String[] args) {

        Titular titular = new Titular("Juan", 5254254);

        Decreto decreto = new Decreto(new Date(), new Date(), 500);
        ReglaNegocio regla = new ReglaNegocio(new Date(), new Date(), 1000);
        Campana campana1 = new Campana(new Date(), new Date(), 1000);
        Campana campana2 = new Campana(new Date(), new Date(), 1000);

        CuotaManejo<Decreto> cuota1 = new CuotaManejo<Decreto>(decreto, LocalDate.of(2024, 01, 15),
                LocalDate.of(2024, 04, 23), 5000);
        CuotaManejo<ReglaNegocio> cuota2 = new CuotaManejo<ReglaNegocio>(regla, LocalDate.of(2024, 01, 15),
                LocalDate.of(2024, 04, 23), 5000);
        CuotaManejo<Campana> cuota3 = new CuotaManejo<Campana>(campana1, LocalDate.of(2024, 01, 15),
                LocalDate.of(2024, 04, 23), 5000);
        CuotaManejo<Campana> cuota4 = new CuotaManejo<Campana>(campana2, LocalDate.of(2024, 01, 15),
                LocalDate.of(2024, 04, 23), 5000);

        CuentaBancaria cuenta = new CuentaBancaria("daniel", 2454545, 454, 500000,
                "COP");
        cuenta.agregarCuota(cuota1);
        cuenta.agregarCuota(cuota2);
        cuenta.agregarCuota(cuota3);
        cuenta.agregarCuota(cuota4);

        List<CuentaBancaria> listaBancaria = new ArrayList<>();
        listaBancaria.add(cuenta);

        System.out.println("Titular: " + titular.getNombre());
        System.out.println("Cuotas de bancaria: " + listaBancaria);

        List<CuotaManejo<? extends Habilitante>> cuotasCuenta = cuenta.getCuotas();
        for (CuotaManejo<? extends Habilitante> cuota : cuotasCuenta) {
            Habilitante habilitante = cuota.getHabilitante();
            System.out.println(
                    "Tipo de habilitante: " + habilitante.getClass().getSimpleName() + "|| fecha fin: "
                            + decreto.fechaFin
                            + "|| fecha inicio: " + decreto.fechaInicio + "|| Monto: " + decreto.monto);
        }

    }
}