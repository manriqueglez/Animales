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
public class Perro extends Animal{
    //atributos
    private String raza;
    private String nombre;
    //constructores
    public Perro()
    {
        super (Sexo.MACHO);
        nombre="toby";
        raza="bulldog";      
    }
    
    public Perro (String r, String n)
    {
        raza=r;
        nombre=n;
    }
    
    public Perro (Sexo s,String r, String n)
    {
        super (s);
        raza=r;
        nombre=n;
    }
    //metodos
    
    public void ladra()
    {
        System.out.println("Guau Guau Guau");
    }
    
    public void come(String comida)
    {
        if(comida.equals("carne"))
        {
            System.out.println("me gusta mucho, muchas gracias");
        }else
        {
            System.out.println("Lo siento, no me gusta");
        }
    }
    
    @Override
    public String toString()
    {
        return ("Soy el perro llamado " + nombre+ ". Mi raza es " + raza+ ". Mi sexo es " + Sexo.MACHO);
    }
    
    public void peleaCon(Gato contrincante)
    {
        System.out.println("Odio pelear con gatos");
    }
}
