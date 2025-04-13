/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto1;

/**
 *
 * @author HP
 */
public class Proyecto1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Participaciones
        System.out.println("Ingrese las participaciones que tiene de 1-4");
        int parti=4;
        double participacion=0;
        if (parti==1) {
             participacion=0.25;
        }
        else{
            if (parti==2){
                participacion=0.5;
            }
            else{
                if (parti==3){
                    participacion=0.75;
                }
                else{
                    participacion=1;
                }
            }
        }
        System.out.println("Su participacion es "+participacion);
        //Investigacion formativa
        System.out.println("Ingrese su nota de inveestigacion formativa de 1-10");
        double info=10;
        double invesfor=info*0.1;
        System.out.println("Sus puntos en investigacion formativa es de: "+invesfor);
        //Proyecto o planes en el aula
        System.out.println("Ingrese su nota de proyecto o planes en el aula de 1-10");
        double nproyec =10;
        double notaproyec=nproyec*0.1;
        System.out.println("Sus puntos en nota de proyecto o planes en el aula es de: "+notaproyec);
        //Foro
        System.out.println("Ingrese su nota del foro de 1-10");
        double paneldiscusion =10;
        double foro=paneldiscusion*0.05;
        System.out.println("Sus puntos en nota del foro es de: "+foro);
        //Talleres en equipo
        System.out.println("Ingrese su nota de Talleres en equipo de 1-10");
        double taequipo =10;
        double talleresequipo=taequipo*0.15;
        System.out.println("Sus puntos en nota de proyecto o planes en el aula es de: "+talleresequipo);
        //Practicas de laboratorio
        System.out.println("Ingrese su nota de Practicas de laboratorio de 1-10");
        double praclabora =10;
        double practicalabor=praclabora*0.2;
        System.out.println("Sus puntos en nota de Practicas de laboratorio es de: "+practicalabor);
        //Lecciones
        System.out.println("Ingrese su nota de la leccion de 1-10");
        double leccion =10;
        double leccion1=leccion*0.1;
        System.out.println("Sus puntos en nota de lecciones es de: "+leccion1);
        //Examen
        System.out.println("Ingrese su nota del examen de 1-10");
        double examen =10;
        double examen1=examen*0.2;
        System.out.println("Sus puntos en su examen es de: "+examen1);
        double primerparcial=participacion+invesfor+notaproyec+foro+talleresequipo+practicalabor+leccion1+examen1;
        System.out.println("Su nota del primer parcial es de: "+primerparcial);


        //float Total=participacion;
        
        /*
        ACTIVIDADES A EVALUAR MEDIO CICLO FIN DE CICLO RECUPERACIÓN
Exámenes 10
Participación en clase 1.0 1.0
5. Bibliografía básica y complementaria
6. Perfil del profesor que imparte la asignatura
Investigación Formativa
(documental y de campo) 1.0 1.0
Proyecto o planes en el aula 1.0 1.0
Panel de discusión, entre Otros 0.5 0.5
Talleres en equipo 1.5 1.5
Práctica de laboratorio/campo 2.0 2.0
Preparación para lecciones orales o
escritas 1.0 1.0
Preparación de exámenes
(evaluación de medio ciclo y fin de
        */
    }
}
