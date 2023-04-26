/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogo;

/**
 *
 * @author mgerm
 */
public class Guerreiro {
    protected String nome;
    protected String arma;
    protected int energia = 20;
    protected boolean armadura;

    public Guerreiro(String nome, String arma, int energia, boolean armadura) {
        this.nome = nome;
        this.arma = arma;
        this.energia = energia;
        this.armadura = armadura;
    }

    public Guerreiro(){
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public boolean isArmadura(){
        return armadura;
    } 
    public void setArmadura(boolean armadura){
        this.armadura = armadura;
    }
    
    public boolean ataca(Guerreiro guerreiro){
        if(this.arma != null && !guerreiro.isArmadura()){
            guerreiro.setEnergia(guerreiro.getEnergia() - 5);            
                return true;
        }else{
                return false;
        }
        
    }
    public boolean ataque(Guerreiro guerreiro){
        if(this.arma != && !guerreiro.isArmadura()){
            guerreiro.setEnergia(guerreiro.getEnergia() - 1);
            return true;
        }else{
            return false;
        }
    }
    public boolean atacar(Guerreiro guerreiro){
        if(this.arma != null && !guerreiro.isArmadura()){
            guerreiro.setEnergia(guerreiro.getEnergia() - 10);            
                return true;
        }else{
                return false;
        }
    }
}
