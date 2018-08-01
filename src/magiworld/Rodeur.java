/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magiworld;

/**
 *
 * @author Arno
 */
public class Rodeur extends Personnage 
{

    public Rodeur(int niveau, int vie, int force, int agilite, int intelligence) 
    {
        super(niveau, vie, force, agilite, intelligence);
    }

    @Override
    public void AttaqueBasique() 
    {
        System.out.println("Joueur X utilise Tir à l'Arc et inflige "+ agilite +" dommages");
        System.out.println("Joueur X perd "+ agilite +" points de vie");
    }

    @Override
    public void AttaqueSpeciale() {
        System.out.println("Joueur X utilise Concentration, son agilité augmente de " + niveau/2);
        agilite = agilite + (niveau/2);
        System.out.println("Joueur X a désormais une agilité de "+agilite);
    }
    
}