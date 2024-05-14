/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdc;

import java.util.Scanner;

/**
 *
 * @author osqui
 */
public class ActividadCiclos {

    String[] listaNOmbres = new String[10];

    public void ciclosMientras() {
        listaNOmbres = new String[11];
        listaNOmbres[0] = "osacr fernando ";
        listaNOmbres[1] = "osacr fernando ";
        listaNOmbres[2] = "osacr fernando ";
        listaNOmbres[3] = "osacr fernando ";
        listaNOmbres[4] = "osacr fernando ";
        listaNOmbres[5] = "osacr fernando ";
        listaNOmbres[6] = "osacr fernando ";
        listaNOmbres[7] = "osacr fernando ";
        listaNOmbres[8] = "osacr fernando ";
        listaNOmbres[9] = "osacr fernando ";
        listaNOmbres[10] = "osacr fernando ";
        int i = 0;
        while (i < listaNOmbres.length) {
            if (listaNOmbres[1].endsWith("s")) {
                System.out.println(" el aprendiz " + i + " es " + listaNOmbres[i]);
            }
            i++;
        }
    }

    void comiezanPorSt() {
        int i = 0;
        do {
            if (listaNOmbres[i].startsWith("St")) {
                System.out.println("el aprendiz" + i + " es " + listaNOmbres[i]);
            }
            i++;
        } while (i < listaNOmbres.length);
    }
}
