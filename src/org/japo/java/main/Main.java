/* 
 * Copyright 2019 Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public final class Main {

    public static void main(String[] args) {

        // Variables
             double gastopers;
             double resto;

        //Constantes
             final double inicial = 2;
             final double peli = 1.30;
             final double palomitas = 0.45;

         System.out.printf("Secuencia de Kung-Fu%n");
         System.out.printf("====================%n");
        
         System.out.printf(Locale.ENGLISH, "Dinero inicial .....: %.2f €%n", inicial);
         System.out.printf("---%n");
        
         System.out.printf(Locale.ENGLISH, "Precio película ....: %.2f €%n", peli);
         System.out.printf(Locale.ENGLISH, "Parte palomitas ....: %.2f €%n", palomitas);
         System.out.printf("---%n");
        
         gastopers = peli + palomitas;
         System.out.printf(Locale.ENGLISH, "Gastos por persona .: %.2f €%n", gastopers);
         System.out.printf("---%n");
        
         resto = inicial - gastopers;
         System.out.printf(Locale.ENGLISH, "Dinero restante ....: %.2f €%n", resto);

    }
}
