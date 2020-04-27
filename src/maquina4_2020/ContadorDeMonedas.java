/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina4_2020;

/**
 *
 * @author Sara
 */
public class ContadorDeMonedas{

private float cantidad;
private float disponible;

public void iniciarContadorDeMonedas(float i){
    disponible = i;
}

public float saldo(){
    return cantidad;
}

public void insertarMoneda(float m){
    cantidad=m;
}
public float darCambioDe(float c){
    float cantVieja=cantidad;
    if (cantVieja -c>=0){
    cantidad+=c;   
    disponible-=c;
    }
    return cantVieja-c;
}
}
