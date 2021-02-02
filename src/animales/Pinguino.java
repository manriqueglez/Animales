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
public class Pinguino extends Ave{
    
    public Pinguino()
    {
        super(Sexo.MACHO);
    }
    
    public Pinguino(Sexo sexo)
    {
        super (sexo);
    }
    
    @Override
    public void vuela()
    {
        System.out.println("No puedo volar");
    }
}
