/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Salvamento;

import Pessoas.Pessoa;
import java.util.ArrayList;

/**
 *
 * @author HP CQ58
 */
public class Salvar {
    
   private ArrayList<Pessoa> pes=new ArrayList<>();
     
    public boolean  salvar (Pessoa p ){
        if(p!=null){
            pes.add(p);
            
            return true;
        }
        else{
            return false;
        }
    }
    
    public ArrayList<Pessoa> dados(){
         return pes;
    }
    
    
    
}
