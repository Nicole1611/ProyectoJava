/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;


/**
 *
 * @author HP
 */
import java.util.Scanner;
public class pj {


    public static void main(String[] args) {
        Scanner notas =new Scanner (System.in);
        double info1[] = new double [10];
        double paneldiscusion1[] = new double [10];
        double praclabora1 [] = new double [10];
        double taequipo1 [] = new double [10];
        double nproyec1 [] = new double [10];
        double leccion [] = new double[10];
        double examen [] = new double[10];
        System.out.println("Ingrese sus notas del primer parcial");
        //Participaciones
        System.out.println("Ingrese las participaciones que tiene de 1-4");
        int parti1=notas.nextInt();
        double participacion1=0;
        if (parti1==1) {
             participacion1=0.25;
        }
        else{
            if (parti1==2){
                participacion1=0.5;
            }
            else{
                if (parti1==3){
                    participacion1=0.75;
                }
                else{
                    participacion1=1;
                }
            }
        }
        System.out.println("Su participacion es "+participacion1);
        
        //Investigacion formativa
        System.out.println("Ingrese su nota de investigacion formativa de 1-10");
        for (int i = 0; i < 1; i++) {
            do {                
                info1 [i]=notas.nextDouble();
            } while ((info1[i]<0)||(info1[i]>10));  
        }
        double invesfor1=info1[0]*0.1;
        System.out.println("Sus puntos en investigacion formativa es de: "+invesfor1);
        
        //Proyecto o planes en el aula
        System.out.println("Ingresa cuantas notas de proyecto o planes en el aula");
        int npa=notas.nextInt();
        System.out.println("Ingresa sus nota de de proyecto o planes en el aula de 1-10");
        for (int i = 0; i < npa; i++) {
            do {                
                nproyec1 [i]=notas.nextDouble();
            } while ((nproyec1[i]<0)||(nproyec1[i]>10));  
        }
        double sumanproyeca1 =0;
        for (int i = 0; i < npa; i++) {
            sumanproyeca1 = sumanproyeca1 + nproyec1[i];
        }
        double promedionproyec1=sumanproyeca1/npa;
        double notaproyec1=promedionproyec1*0.1;
        System.out.println("Sus puntos en nota de proyecto o planes en el aula es de: "+notaproyec1);
        
        //Foro
        System.out.println("Ingrese su nota del foro de 1-10");
        for (int i = 0; i < 1; i++) {
            do {                
                paneldiscusion1 [i]=notas.nextDouble();
            } while ((paneldiscusion1[i]<0)||(paneldiscusion1[i]>10));  
        }
        double foro1=paneldiscusion1[0]*0.05;
        System.out.println("Sus puntos en nota del foro es de: "+foro1);
        
        //Talleres en equipo
        System.out.println("Ingresa cuantas  de Talleres en equipo");
        int nte1=notas.nextInt();
        System.out.println("Ingresa sus nota de Talleres en equipo de 1-10");
        for (int i = 0; i < nte1; i++) {
            do {                
                taequipo1 [i]=notas.nextDouble();
            } while ((taequipo1[i]<0)||(taequipo1[i]>10));  
        }
        double sumataequipo1 =0;
        for (int i = 0; i < nte1; i++) {
            sumataequipo1 = sumataequipo1 + taequipo1[i];
        }
        double promediotaequipo1 = sumataequipo1 /nte1;
        double talleresequipo1 = promediotaequipo1*0.15;
        System.out.println("Sus puntos en nota de proyecto o planes en el aula es de: "+talleresequipo1);
       
        //Practicas de laboratorio
        System.out.println("Ingresa cuantas  notas de Practicas de laboratorio");
        int npl=notas.nextInt();
        System.out.println("Ingresa las notas de los estudiamtes");
        for (int i = 0; i < npl; i++) {
            do {                
                praclabora1 [i]=notas.nextDouble();
            } while ((praclabora1[i]<0)||(praclabora1[i]>10));  
        }
        double sumapraclabora1 =0;
        for (int i = 0; i < npl; i++) {
            sumapraclabora1 = sumapraclabora1 + praclabora1[i];
        }
        double promediopractlabor1=sumapraclabora1/npl;
        double practicalabor1=promediopractlabor1*0.2;
        System.out.println("Sus puntos en nota de Practicas de laboratorio es de: "+practicalabor1);
      
        //Lecciones
        System.out.println("Ingrese su nota de la leccion de 1-10");
        for (int i = 0; i < 1; i++) {
            do {                
                leccion [i]=notas.nextDouble();
            } while ((leccion[i]<0)||(leccion[i]>10));  
        }
        double leccion1=leccion [0]*0.1;
        System.out.println("Sus puntos en nota de lecciones es de: "+leccion1);
      
        //Examen
        System.out.println("Ingrese su nota del examen de 1-10");
        for (int i = 0; i < 1; i++) {
            do {                
                examen [i]=notas.nextDouble();
            } while ((examen[i]<0)||(examen[i]>10));  
        }
        double examen1=examen[0]*0.2;
        System.out.println("Sus puntos en su examen es de: "+examen1);
        double primerparcial=participacion1+invesfor1+notaproyec1+foro1+talleresequipo1+practicalabor1+leccion1+examen1;
        System.out.println("Su nota del primer parcial es de: "+primerparcial);

    }
}


