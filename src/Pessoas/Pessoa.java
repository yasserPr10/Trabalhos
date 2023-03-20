/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoas;

/**
 *
 * @author HP CQ58
 */
public class Pessoa {
  
    private String nome;
    private String idade;
    private String sexo;
    private String pai;
    private String mae;
    private String paiI;
    private String maeI;
 

   

    public Pessoa(String nome, String idade, String sexo, String pai, String mae,String maeI,String paiI) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.pai = pai;
        this.mae = mae;
        this.paiI=paiI;
        this.maeI=maeI;
    }
    
     public Pessoa(){
        
    }
    
    

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
        
    }
        public void setSexo(String sexo){
            this.sexo=sexo;
        }
        public String getSexo(){
        return this.sexo;}

   

    public String getPaiI() {
        return paiI;
    }

    public void setPaiI(String paiI) {
        this.paiI = paiI;
    }

    public String getMaeI() {
        return maeI;
    }

    public void setMaeI(String maeI) {
        this.maeI = maeI;
    }
        
        
}
    
    
    

