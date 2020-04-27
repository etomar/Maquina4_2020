/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina4_2020;
/** 
 * @authora Patricia Mocholí Martinez
 */
public class DispensadorDeBotes {
 
    private int botes; 

    public DispensadorDeBotes(int b){
        iniciarDispensadorDeBotes(b);

    }    

    public void iniciarDispensadorDeBotes (int i){
        botes = i;
    }

    public boolean pulsarBoton (){
        boolean resultadoBotes = false;
        if(botes>0){
            resultadoBotes= true;
            botes--;
        }
        else
            resultadoBotes= false;
        return resultadoBotes;
    }
  
    public int botesDisponibles (){
        return botes;
    }
}
