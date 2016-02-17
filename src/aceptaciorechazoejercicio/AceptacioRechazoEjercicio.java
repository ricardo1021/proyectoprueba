/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaciorechazoejercicio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 *
 * @author RICARDO
 */
public class AceptacioRechazoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("0.000");
        int n = 0;
        int aux = 0;
        float x = 0;
        float u1 = 0;
        float u2 = 0;
        float c = 0;
        float Y = 0;
        float fx = 0;
        String a = "";

        System.out.println("Ingrese la cantidad de números-> ");
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(entrada.readLine());

        } catch (IOException e) {
        }
        System.out.println("u1\tx1\tu2\ty1\tf(x1)\tA/R");

        while (aux < n) {
            u1 = (float) Math.random();
            x = (float) (((-1)+(Math.sqrt((1+8*u1))))/2);
//            c = (12 * x) * (1 - x) / (2 * x + 1);
            c=5;
            u2 = (float) Math.random();
            Y = (c * (x+(1/2)))*u2;
            fx = (6 * x) - (6 * x * x);
            if (Y < fx) {
                a = "ACEPTA";
                aux++;
            } else {
                a = "RECHAZA";
                aux++;
            }
            System.out.println(formato.format(u1) + "\t" + formato.format(x) + 
                    "\t" + formato.format(u2) + "\t" + formato.format(Y) + 
                    "\t" + formato.format(fx) + "\t" + a);
        }
    }

}
