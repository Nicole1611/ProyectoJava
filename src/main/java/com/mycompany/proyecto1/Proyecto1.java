/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto1;

import java.util.Scanner;
public class Proyecto1 {

    public static void main(String[] args) {
        Scanner notas =new Scanner (System.in);
        double praclabora1 [] = new double [10];
        double taequipo1 [] = new double [10];
        double nproyec1 [] = new double [10];

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
        double info1 = notas.nextDouble();
        double invesfor1=info1*0.1;
        System.out.println("Sus puntos en investigacion formativa es de: "+invesfor1);
        
        //Proyecto o planes en el aula
        System.out.println("Ingresa cuantas notas de proyecto o planes en el aula");
        int npa1=notas.nextInt();
        if (npa1>10){
            System.out.println("Solo se permoten maximo 10 notas");
            npa1=10;
        }
        
        System.out.println("Ingresa sus nota de de proyecto o planes en el aula de 1-10");
        for (int i = 0; i < npa1; i++) {
            do {                
                nproyec1 [i]=notas.nextDouble();
            } while ((nproyec1[i]<0)||(nproyec1[i]>10));  
        }
        double sumanproyeca1 =0;
        for (int i = 0; i < npa1; i++) {
            sumanproyeca1 = sumanproyeca1 + nproyec1[i];
        }
        double promedionproyec1=sumanproyeca1/npa1;
        double notaproyec1=promedionproyec1*0.1;
        System.out.println("Sus puntos en nota de proyecto o planes en el aula es de: "+notaproyec1);
        
        //Foro
        System.out.println("Ingrese su nota del foro de 1-10");
        double paneldiscusion1;
        do{
        paneldiscusion1 = notas.nextDouble();
        }while ((paneldiscusion1<0)||(paneldiscusion1>10));
        double foro1=paneldiscusion1*0.05;
        System.out.println("Sus puntos en nota del foro es de: "+ foro1);
        
        //Talleres en equipo
        System.out.println("Ingresa cuantas  de Talleres en equipo");
        int nte1=notas.nextInt();
        if (nte1>10){
            System.out.println("Solo se permoten maximo 10 notas");
            nte1=10;
        }
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
        System.out.println("Sus puntos en nota de Talleres en equipo es de: "+talleresequipo1);
       
        //Practicas de laboratorio
        System.out.println("Ingresa cuantas  notas de Practicas de laboratorio");
        int npl=notas.nextInt();
        if (npl>10){
            System.out.println("Solo se permoten maximo 10 notas");
            npl=10;
        }
        System.out.println("Ingresa las notas de de Practicas de laboratorio");
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
        double leccion;
        do{
        leccion = notas.nextDouble();
        }while ((leccion<0)||(leccion>10));
        double leccion1=leccion * 0.1;
        System.out.println("Sus puntos en nota de lecciones es de: "+leccion1);
      
        //Examen
        System.out.println("Ingrese su nota del examen de 1-10");
        double examen;
        do{
        examen = notas.nextDouble();
        }while ((examen<0)||(examen>10));
        double examen1=examen * 0.2;
        System.out.println("Sus puntos en su examen es de: "+examen1);
        //Nota de primer parcial
        double primerparcial=participacion1+invesfor1+notaproyec1+foro1+talleresequipo1+practicalabor1+leccion1+examen1;
        System.out.println("Su nota del primer parcial es de: "+primerparcial);

        //SEGUNDO PARCIAL
        System.out.println(" ");
        System.out.println("Ingrese sus notas del segundo parcial");
        double praclabora2 [] = new double [10];
        double taequipo2 [] = new double [10];
        double nproyec2 [] = new double [10];
        //Participaciones
        System.out.println("Ingrese las participaciones que tiene de 1-4");
        int parti2=notas.nextInt();
        double participacion2=0;
        if (parti2==1) {
             participacion2=0.25;
        }
        else{
            if (parti2==2){
                participacion2=0.5;
            }
            else{
                if (parti2==3){
                    participacion2=0.75;
                }
                else{
                    participacion2=1;
                }
            }
        }
        System.out.println("Su participacion es "+participacion2);
        
        //Investigacion formativa
        System.out.println("Ingrese su nota de investigacion formativa de 1-10");
        double info2 = notas.nextDouble();
        double invesfor2 = info2*0.1;
        System.out.println("Sus puntos en investigacion formativa es de: "+invesfor2);
        
        //Proyecto o planes en el aula
        System.out.println("Ingresa cuantas notas de proyecto o planes en el aula");
        int npa2 = notas.nextInt();
        if (npa2 > 10){
            System.out.println("Solo se permoten maximo 10 notas");
            npa2 = 10;
        }
        
        System.out.println("Ingresa sus nota de de proyecto o planes en el aula de 1-10");
        for (int i = 0; i < npa2; i++) {
            do {                
                nproyec2 [i]=notas.nextDouble();
            } while ((nproyec2[i]<0)||(nproyec2[i]>10));  
        }
        double sumanproyeca2 = 0;
        for (int i = 0; i < npa2; i++) {
            sumanproyeca2 = sumanproyeca2 + nproyec2[i];
        }
        double promedionproyec2 = sumanproyeca2 / npa2;
        double notaproyec2 = promedionproyec2 * 0.1;
        System.out.println("Sus puntos en nota de proyecto o planes en el aula es de: "+notaproyec2);
        
        //Foro
        System.out.println("Ingrese su nota del foro de 1-10");
        double paneldiscusion2;
        do{
        paneldiscusion2 = notas.nextDouble();
        }while ((paneldiscusion2 < 0)||(paneldiscusion2 > 10));
        double foro2 = paneldiscusion2*0.05;
        System.out.println("Sus puntos en nota del foro es de: "+ foro2);
        
        //Talleres en equipo
        System.out.println("Ingresa cuantas  de Talleres en equipo");
        int nte2 = notas.nextInt();
        if (nte2 > 10){
            System.out.println("Solo se permoten maximo 10 notas");
            nte2 = 10;
        }
        System.out.println("Ingresa sus nota de Talleres en equipo de 1-10");
        for (int i = 0; i < nte2; i++) {
            do {                
                taequipo2 [i]= notas.nextDouble();
            } while ((taequipo2[i] < 0)||(taequipo2[i] > 10));  
        }
        double sumataequipo2 = 0;
        for (int i = 0; i < nte2; i++) {
            sumataequipo2 = sumataequipo2 + taequipo2[i];
        }
        double promediotaequipo2 = sumataequipo2 / nte2;
        double talleresequipo2 = promediotaequipo2 * 0.15;
        System.out.println("Sus puntos en nota de Talleres en equipo es de: "+talleresequipo2);
       
        //Practicas de laboratorio
        System.out.println("Ingresa cuantas  notas de Practicas de laboratorio");
        int np2=notas.nextInt();
        if (np2>10){
            System.out.println("Solo se permoten maximo 10 notas");
            np2=10;
        }
        System.out.println("Ingresa las notas de de Practicas de laboratorio");
        for (int i = 0; i < np2; i++) {
            do {                
                praclabora2 [i]=notas.nextDouble();
            } while ((praclabora2[i]<0)||(praclabora2[i]>10));  
        }
        double sumapraclabora2 =0;
        for (int i = 0; i < np2; i++) {
            sumapraclabora2 = sumapraclabora2 + praclabora2[i];
        }
        double promediopractlabor2 = sumapraclabora2 / np2;
        double practicalabor2 = promediopractlabor2 * 0.2;
        System.out.println("Sus puntos en nota de Practicas de laboratorio es de: "+practicalabor2);
      
        //Lecciones
        System.out.println("Ingrese su nota de la leccion de 1-10");
        double leccionsp;
        do{
        leccionsp = notas.nextDouble();
        }while ((leccionsp < 0)||(leccionsp > 10));
        double leccion2 = leccionsp * 0.1;
        System.out.println("Sus puntos en nota de lecciones es de: "+leccion2);
      
        //Examen
        System.out.println("Ingrese su nota del examen de 1-10");
        double examensp;
        do{
        examensp = notas.nextDouble();
        }while ((examensp < 0)||(examensp > 10));
        double examen2=examensp * 0.2;
        System.out.println("Sus puntos en su examen es de: "+examen2);
        //Nota de primer parcial
        double segundoparcial=participacion2+invesfor2+notaproyec2+foro2+talleresequipo2+practicalabor2+leccion2+examen2;
        System.out.println("Su nota del primer parcial es de: "+ segundoparcial);
        
        //Pasas o no?
        double notat=primerparcial + segundoparcial;
        double notatotal = notat /2;
        System.out.println("Tu nota total es de: "+notat);
        if (notatotal >= 7){
            System.out.println("Pasaste felicidades");   
        }
        else{
            if((notatotal < 4)&&(notatotal > 0)){
                System.out.println("Perdiste la materia");
            }
            else{
                if ((notatotal >= 4)&&(notatotal < 7))
            System.out.println("Tendras que dar el examen de recuperacion");
            System.out.println("Cual es la nota que obtuviste del examen de recuperacion");
            double examenrecuperacion;
            do{
            examenrecuperacion = notas.nextDouble();
            }while ((examenrecuperacion < 0)||(examenrecuperacion > 10));
            double sumanotafinal =examenrecuperacion+notatotal;
            double notafinal = sumanotafinal /2;
            if (notafinal >= 7){
                System.out.println("Felicidades pasaste la materia");
                System.out.println("Con una nota de: "+sumanotafinal);
            }
                else{
                    System.out.println("Perdiste la materia");
                    System.out.println("Con una nota de: "+sumanotafinal);
                } 
            }    
        }
    }
}
