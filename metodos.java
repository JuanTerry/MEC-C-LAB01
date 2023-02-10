/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author juanj
 */
public class metodos {
    private String cadena;
    private double resultado;
    private boolean suma;
    private boolean resta;
    private boolean mult;
    private boolean div;
    private boolean raiz;
    private boolean pow;
    private boolean sen;
    private boolean cos;
    private boolean tan; 
public metodos(){
    cadena="";
    suma=false;
    resta=false;
    mult=false;
    div=false;
    raiz=false;
    pow=false;
    sen=false;
    cos=false;
    tan=false;
   }
   public String conect(String cadena){
       this.cadena=this.cadena+cadena;
       return this.cadena;
   }
   public void borrar(String cadena){
       this.cadena="";
   }
   public void suma(String cadena){
        this.resultado=Double.parseDouble(cadena);
        suma=true;
        this.cadena="";
   }
    public void resta(String cadena){
        this.resultado=Double.parseDouble(cadena);
        resta=true;
        this.cadena="";
   }
    public void multiplicacion(String cadena){
        this.resultado=Double.parseDouble(cadena);
        mult=true;
        this.cadena="";
   }
    public void division(String cadena){
        this.resultado=Double.parseDouble(cadena);
        div=true;
        this.cadena="";
   }  
    public void raiz(String cadena){
        this.resultado=Double.parseDouble(cadena);
        raiz=true;
        this.cadena="";
   }   
    public void pow(String cadena){
        this.resultado=Double.parseDouble(cadena);
        pow=true;
        this.cadena="";
   }
    public void sen(String cadena){
       this.resultado=Double.parseDouble(cadena);
       sen=true;
       this.cadena="";
   }
    public void cos(String cadena){
       this.resultado=Double.parseDouble(cadena);
       cos=true;
       this.cadena="";
   }
    public void tan(String cadena){
       this.resultado=Double.parseDouble(cadena);
       tan=true;
       this.cadena="";
   }
    public double result(String numero){
       if(suma==true){        
            resultado=resultado+Double.parseDouble(numero);
       }
       else if(resta==true){    
            resultado=resultado-Double.parseDouble(numero);
       }
        else if(mult==true){            
            resultado=resultado*Double.parseDouble(numero);
       }
        else if(div==true){             
            resultado=resultado/Double.parseDouble(numero);
       }
        else if(raiz==true){                 
            resultado=Math.sqrt(Double.parseDouble(numero)); 
       }
        else if(pow==true){             
            resultado=Math.pow(resultado, Double.parseDouble(numero));
       }
        else if(sen==true){      
            double seno=Math.toRadians(resultado);
            resultado=Math.sin(seno);
        }
        else if(cos==true){         
            double coseno=Math.toRadians(resultado);
            resultado=Math.cos(coseno);
        }
        else if(tan==true){
            double tangente=Math.toRadians(resultado);
            resultado=Math.tan(tangente);
        }
        suma=false;
        resta=false;
        mult=false;
        div=false;
        raiz=false;
        pow=false; 
        sen=false;
        cos=false;
        tan=false;
        return resultado;
    }
}
