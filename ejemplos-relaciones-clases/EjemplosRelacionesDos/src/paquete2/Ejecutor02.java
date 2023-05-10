/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Ejecutor02 {
    
    public static void main(String[] args) {
        // 1. Crear una persona de Barrio el Valle de la ciudad de Loja
        // 2. Crear una persona del Barrio Central de la ciudad de Cuenca
        // 3. Crear una persona del Barrio Centenario de la ciuda de Guayaquil
        Ciudad ciudad1 = new Ciudad("Loja");
        Ciudad ciudad2 = new Ciudad("Cuenca");
        Ciudad ciudad3 = new Ciudad("Guayaquil");
        
        Barrio barrio1 = new Barrio("el Valle", ciudad1);
        Barrio barrio2 = new Barrio("Central", ciudad2);
        Barrio barrio3 = new Barrio("Centenario", ciudad3);
        
        Persona persona1 = new Persona("René Elizalde", "1100909909", barrio1);
        Persona persona2 = new Persona("Roberto Bustamante", "115484689", barrio2);
        Persona persona3 = new Persona("Luis Mora", "1144554469", barrio3);
        
        System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona %s es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona1.obtenerNombre(),
                persona1.obtenerBarrio().obtenerNombre(),
                persona1.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
        persona1.establecerBarrio(barrio2);
        
        System.out.printf("El barrio de la persona %s es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona2.obtenerNombre(),
                persona2.obtenerBarrio().obtenerNombre(),
                persona2.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
        
        barrio2.establecerCiudad(ciudad3);
        System.out.printf("El barrio de la persona es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona2.obtenerNombre(),
                persona3.obtenerBarrio().obtenerNombre(),
                persona3.obtenerBarrio().obtenerCiudad().obtenerNombre());
    }
}
