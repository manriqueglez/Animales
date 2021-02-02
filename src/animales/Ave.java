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
public class Ave extends Animal {
    //declaración de atributos, (como no tenemos lo dejamos vacio)
    
    //declaracion de constructores
    public Ave (Sexo s)
    {
        super (s);
    }
   
    //declaracion de métodos
    
    @Override
    public void duerme(){
        System.out.println("El ave está durmiendo");
    }
    
    public void lavate()
    {
        System.out.println("Estoy aseandome");
    }
    
    public void vuela()
    {
        System.out.println("Estoy volando");
    }
}
