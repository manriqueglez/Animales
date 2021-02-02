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
public class Animal {
     
    private Sexo sexo;
    
    public Animal()//constructor sin parámetro
    {
        sexo=Sexo.MACHO;
    }
    
    public Animal(Sexo sexo) //constructor con parámetro
    {
        this.sexo= sexo;
    }
    
    public Sexo getSexo()
    {
        return sexo;
    }
    
    @Override
    public String toString()
    {
        return("Sexo: " + this.sexo + "\n");
    }
    
    public void duerme()
    {
        System.out.println("ZZZZZZZZZZZ");
    }
    
}
