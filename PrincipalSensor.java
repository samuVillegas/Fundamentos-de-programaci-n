import java.util.Scanner;
public class PrincipalSensor {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        SensorLuz sl1 = new SensorLuz(18,40);
        String palabra;
        
        do{
            System.out.println("Ingresa la palabra");
           palabra = entrada.next();
           
           switch(palabra){
               case "duplicar": 
               System.out.println("La intensidad actual es: " + sl1.getIntensidad());
               sl1.duplicarIntensidad();
               System.out.println("La intensidad actualizada es: " + sl1.getIntensidad());
               break;
               case "asignarint":
               sl1.setIntensidad(entrada.nextInt());
               break;
               
    
           }

        }while(!palabra.equals("salir"));

    }

}
