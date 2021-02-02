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
public class Gato extends Animal{
    
    private String raza; //declaracion de atributos
    
    //declaracion de constructores
    public Gato()
    {
        super (Sexo.HEMBRA);
        raza="siames";
    }
    
    public Gato(Sexo s)
    {
        super (s);
        raza="siames";
    }
    
    public Gato(String r)
    {
        super (Sexo.HEMBRA);
        raza=r;
    }
    
    public Gato(Sexo s, String r)
    {
        super (s);
        raza=r;
    }
    
    public void maulla()
    {
        System.out.println("Miauuuu");
    }
    
    public void ronronea()
    {
        System.out.println("Rrrrrrrrrrr");
    }
    
    public void come(String comida)
    {
        if(comida.equals("pescado"))
        {
            System.out.println("me gusta...mmmmmmmmm.....muchas gracias");
        }else
        {
            System.out.println("Lo siento, no me gusta");
        }
    }
    
    public void peleaCon(Gato contrincante)
    {
        if (this.getSexo()==Sexo.HEMBRA)
        {
            System.out.println("No me gusta pelear");
        }
        else
        {
           if(contrincante.getSexo()== Sexo.HEMBRA) 
           {
               System.out.println("No peleo con gatitas");
           }
           else
           {
               System.out.println("Al ataque....te vas a enterar");
           }
        }
    }
    
    @Override
    public String toString()
    {
        return (super.toString()+ "Raza: "+ raza + "\n-------------------------\n");
    }
}
