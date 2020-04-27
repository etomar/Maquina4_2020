
package maquina4_2020;
class MaquinaDeBebidas
{
    private DispensadorDeBotes cola,limon, naranja, tonica, agua;
    private float precio;

    public void iniciarMaquinaDeBebidas (float m, int b, float pvp){
    cola = new DispensadorDeBotes(b);
    limon = new DispensadorDeBotes(b);
    naranja = new DispensadorDeBotes(b);
    tonica = new DispensadorDeBotes(b);
    agua = new DispensadorDeBotes(b);
    precio = pvp;   
    }
    public void darOrden (char o){        
        if(Character.isDigit(o)){
            ordenSeleccion(o);
        }else{
            ordenMonedas(o);
        }
    }

    public void visualizarMaquina (){
        System.out.println(
                    "Cola: " + cola.botesDisponibles() + 
                    " Naranja: " + naranja.botesDisponibles() +
                    " Limon: " + limon.botesDisponibles() +
                    " Tonica: " + tonica.botesDisponibles() +
                    " Agua: " + agua.botesDisponibles() + 
                    " Precio: " +precio);        
    } 

    private void ordenMonedas (char o){
        
        
        if(o == 'A'){contador.insertarMoneda(0.05);}
        else if(o == 'B'){contador.insertarMoneda(0.10);}
        else if(o == 'C'){contador.insertarMoneda(0.20);}
        else if(o == 'D'){contador.insertarMoneda(0.50);}
        else if(o == 'E'){contador.insertarMoneda(1);}
        else if(o == 'R'){contador.insertarMoneda(-contador.saldo());}
        
       
        
    }
    private void ordenSeleccion (char o){
        if(o == 1){
            if(cola.pulsarBoton()){
                    if(precio<=contador.Saldo()){
                        cola.iniciarDispensadorDeBotes(cola.botesDisponibles ()-1);
                    }else{
                        System.out.println("No hay saldo");
                    }
                }else{
                    System.out.println("No hay bebidas.");
                }}
        else if(o == 2){
            if(limon.pulsarBoton()){
                    if(precio<=contador.Saldo()){
                        limon.iniciarDispensadorDeBotes(limon.botesDisponibles ()-1);
                    }else{
                        System.out.println("No hay saldo");
                    }
                }else{
                    System.out.println("No hay bebidas.");
                }}
        else if(o == 3){ 
            if(naranja.pulsarBoton()){
                    if(precio<=contador.Saldo()){
                        naranja.iniciarDispensadorDeBotes(naranja.botesDisponibles ()-1);
                    }else{
                        System.out.println("No hay saldo");
                    }
                }else{
                    System.out.println("No hay bebidas.");
                }}
        else if(o == 4){
            if(tonica.pulsarBoton()){
                    if(precio<=contador.Saldo()){
                        tonica.iniciarDispensadorDeBotes(tonica.botesDisponibles ()-1);
                    }else{
                        System.out.println("No hay saldo");
                    }
                }else{
                    System.out.println("No hay bebidas.");
                }}
        else if(o == 5){
            if(agua.pulsarBoton()){
                    if(precio<=contador.Saldo()){
                        agua.iniciarDispensadorDeBotes(agua.botesDisponibles ()-1);
                    }else{
                        System.out.println("No hay saldo");
                    }
                }else{
                    System.out.println("No hay bebidas.");
                }}
        
    }
}