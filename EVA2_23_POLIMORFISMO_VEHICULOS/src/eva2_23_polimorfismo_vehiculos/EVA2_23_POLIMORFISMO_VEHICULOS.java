/*

 */
package eva2_23_polimorfismo_vehiculos;


public class EVA2_23_POLIMORFISMO_VEHICULOS {


    public static void main(String[] args) {
     
    Automovil auto = new Automovil("Sentra",2004,0,"Nissan");    
      // auto.acelerar(50);
      // auto.tablero();
   
   Bicicleta bici = new Bicicleta("Montaña","2 ruedas",0,"Bici");
     // bici.acelerar(50);
     // bici.tablero();
     
    cambiarVel(auto,50); 
    cambiarVel(bici,50); 
     
    }
    
  public static void cambiarVel(DataVehiculo Veh, int Vel){
     Veh.acelerar(Vel);
     Veh.tablero();
   }
    
}



interface DataVehiculo{
 void acelerar(int cambio);
 void tablero();
}


class Vehiculo{
 protected int velocidad;
 private String marca;

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
//------------------------------------------------------------------------------
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
//------------------------------------------------------------------------------
    public Vehiculo(int velocidad, String marca) {
        this.velocidad = velocidad;
        this.marca = marca;
    }
//------------------------------------------------------------------------------
    public Vehiculo(){
    this.velocidad = 0;
    this.marca = "---";    
    }
 
}    


class Automovil extends Vehiculo implements DataVehiculo{
 private String modelo;
 private int ao;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
//------------------------------------------------------------------------------
    public int getAo() {
        return ao;
    }

    public void setAo(int ao) {
        this.ao = ao;
    }
//------------------------------------------------------------------------------

    public Automovil(String modelo, int ao, int velocidad, String marca) {
        super(velocidad, marca);
        this.modelo = modelo;
        this.ao = ao;
    }
//------------------------------------------------------------------------------
    public Automovil() {
    super();
      this.modelo = "---";
      this.ao = 0;
    }
//------------------------------------------------------------------------------
    
 @Override
    public void acelerar(int cambio){
      int cambioVel=velocidad+cambio;
        if(cambioVel>=0){
        velocidad=cambioVel;      
        }    
    }
//------------------------------------------------------------------------------
    
 @Override 
   public void tablero(){
     System.out.println("Velocidad del automóvil: " +velocidad);   
   }
    
    
}



class Bicicleta extends Vehiculo implements DataVehiculo{
private String tipo; 
private String ruedas;    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
//------------------------------------------------------------------------------
    public String getRuedas() {
        return ruedas;
    }

    public void setRuedas(String ruedas) {
        this.ruedas = ruedas;
    }
//------------------------------------------------------------------------------

    public Bicicleta(String tipo, String ruedas, int velocidad, String marca) {
        super(velocidad, marca);
        this.tipo = tipo;
        this.ruedas = ruedas;
    }
//------------------------------------------------------------------------------
    
    public Bicicleta() {
     super();
      this.tipo = "---";
      this.ruedas = "---";
    }
//------------------------------------------------------------------------------
    
    @Override
    public void acelerar(int cambio) {
        int cambioVel=velocidad+cambio;
        if(cambioVel>=0){
            velocidad=cambioVel;
            
        }
    }    
//------------------------------------------------------------------------------
    
    @Override
    public void tablero() {
        System.out.println("Velocidad de la bicicleta: "+velocidad);
    }
        
    
    
}





