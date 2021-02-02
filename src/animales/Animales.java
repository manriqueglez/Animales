/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

/**
 *
 * @author manri
 */
public class Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal gatito= new Animal();
        Gato gardfield=new Gato(Sexo.MACHO);
        Gato gato2=new Gato();
        Gato gato3=new Gato("romano");
        Gato gato4=new Gato(Sexo.MACHO, "egipcio");
        Gato gato5=new Gato(Sexo.MACHO, "Sin pedigrí");
        Pinguino pingu=new Pinguino(Sexo.MACHO);
        Perro perrito=new Perro();
        Ave paloma=new Ave(Sexo.HERMAFORDITA);
        
        System.out.println("datos de perrito");
        System.out.println(perrito);
        
        System.out.println("Pongo al perro a comer");
        perrito.come("carne");
        
        System.out.println("pongo el perrro a ladrar");
        perrito.ladra();
        
        System.out.println("Pongo al perro a pelear con un gato");
        perrito.peleaCon(gardfield);
        
        
        gato3.come("pescado");
        
        System.out.println("Gato 2 pelea con gato 3");
        gato2.peleaCon(gato3);
        
        System.out.println("Gato 4 pelea con gardfiel");
        gato4.peleaCon(gardfield);
        
        System.out.println("Datos de gato 2");
        System.out.println(gato2);
        
        System.out.println("Datos de gato 3");
        System.out.println(gato3);
        
        System.out.println("Gato 5 lo pongo a maullar");
        gato5.maulla();
        
        pingu.vuela();
        
        paloma.vuela();
    }
    
}
