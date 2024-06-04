/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jardintecnicas;

/**
 *
 * @author saram
 */
public class JardinTecnicas {
    
    static Lectura lec = new Lectura();
    static int edad;
    static String nombre;
    static float peso;
    static int temperamento;
    static String temperamentoString;
    static int cantNinosC = 0;
    static int cantNinosE = 0;
    static int cantNinosM = 0;
    
    
    public static void main(String[] args) {
         inscripcionJardin();
    }
    
    public static void inscripcionJardin(){
        int seguir = 0;
        int cantNinos = 0;
        cantNinos = lec.leerIntRestricciones("Ingrese la cantidad de niños que deaea inscribir",0,101,"Minimo necesitas 1 niño para inscribir y "
                + "nuestro cupo maximo es de 100");
        int inscritos = 1;
        
        do{
            imprimir("Niñ@" + inscritos);
            do{
            edad = lec.leerIntRestricciones("Por favor ingrese la edad de su niñ@ en meses",0,61,"Solo recibimos niños menores de 60 meses(5 años)");
            nombre = lec.leerString("Ingrese el nombre de niñ@");
            peso = lec.leerFloatRestricciones("Ingrese el peso de un niñ@", 0,10000);
            temperamento = lec.leerIntRestricciones("Por favor ingrese el número correspodiente "
                    + "a la opción que considera que describe mejor el temperameto "
                    + "de su niñ@: 1-Calmado 2-Entusiasta 3-Muy entusiasta",1,4,"Por favor revisa las opciones y elije de nuevo");

            switch(temperamento){
                    case 1: 
                        temperamentoString = "Calmado";
                        break;
                    case 2: 
                        temperamentoString = "Entusiasta";
                        break;
                    case 3: 
                        temperamentoString = "Muy Entusiasta";
                        break;
                        
            }

            imprimir ("Bienvenido, usted está interesado en inscribir a su niñ@ " +
                    nombre +" de " + edad + " meses de edad, que pesa " + peso + 
                    " y es " + temperamentoString);
            seguir = lec.leerIntRestricciones("Si esta información está correcta ingrese 1, si desea cambiarla ingrese 2.", 0,3,
                    "Porfavor revisa las opciones y elije de nuevo ");
            }while (seguir == 2);
            
            imprimir("El costo de la mensualidad es: ");
            switch(temperamento){
                    case 1: 
                        imprimir("300.000 pesos");
                        cantNinosC += 1;
                        break;
                    case 2: 
                        imprimir("200.000 pesos");
                        cantNinosE += 1;
                        break;
                    case 3: 
                        imprimir("100.000 pesos");
                        cantNinosM += 1;
                        break;
                    default:
                        imprimir("Ha habido un error al momento de calcular el costo, por favor intentalo"
                                + " de nuevo y presta atención a las opciones");
                        break;
            }
            
            inscritos += 1;
            
        } while (inscritos <= cantNinos);
        
        double porcentajeIng = calcularRecauyPorcentaje(cantNinosC, cantNinosE,cantNinosM);
        imprimir("Al ingeniero se le darán:" + porcentajeIng + " pesos");
        
    }
    
    public static double calcularRecauyPorcentaje(int calmados,int entusiastas, int muyEntusiastas){
        int recaudado = (calmados*300000) + (entusiastas*200000)+(muyEntusiastas * 100000);
        imprimir("Se recaudó: " + recaudado);
        double porcentaje = recaudado*(0.1);
        return porcentaje;
    }
    
    public static void imprimir(String cadena){
        System.out.println(cadena);
    }

    

}
