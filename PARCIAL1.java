/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Usuario Dell
 */
public class PARCIAL1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Scanner sc = new Scanner(System.in);
        DecimalFormat p = new DecimalFormat("00.00");
        int ca1, ca2, ca3,ca4, no1, no2, no3, no4, aux1, aux2,prom;
        System.out.print("Ingrese el carne del primer estudiante: ");
        ca1 = sc.nextInt();
        System.out.print("Ingrese la 1er nota: ");
        no1 = sc.nextInt();
        System.out.print("\nIngrese el carne del segundo estudiante: ");
        ca2 = sc.nextInt();
        System.out.print("Ingrese la 2da nota: ");
        no2 = sc.nextInt();
        System.out.print("\nIngrese el carne del tercer estuadiante: ");
        ca3 = sc.nextInt();
        System.out.print("Ingrese la 3er nota: ");
        no3 = sc.nextInt();
        System.out.print("\nIngrese el carne del cuarto estudiante: ");
        ca4 = sc.nextInt();
        System.out.print("Ingrese la 4ta nota: ");
        no4 = sc.nextInt();
        
        prom =(no1+no2+no3+no4)/4;
        
        if(no1<no2)
        {aux1=no1;
            no1=no2;
            no2=aux1;
        aux2=ca1;
            ca1=ca2;
            ca2=aux2;
        }
        if(no1<no3)
        {aux1=no1;
            no1=no3;
            no3=aux1;
        aux2=ca1;
            ca1=ca3;
            ca3=aux2;
        }
        if(no1<no4)
        {aux1=no1;
            no1=no4;
            no4=aux1;
        aux2=ca1;
            ca1=ca4;
            ca4=aux2;}
        //
        if(no2<no3)
        {aux1=no2;
            no2=no3;
            no3=aux1;
        aux2=ca2;
            ca2=ca3;
            ca3=aux2;}
        if(no2<no4)
        {aux1=no2;
            no2=no4;
            no4=aux1;
        aux2=ca2;
            ca2=ca4;
            ca4=aux2;}
        //
        if(no3<no4)
        {aux1=no3;
            no3=no4;
            no4=aux1;
        aux2=ca3;
            ca3=ca4;
            ca4=aux2;}
        
        System.out.println("\n\n");
        System.out.println("Las notas ordenadas son: \t\t El carnet es: \n" +no1+"\t\t\t\t\t"+ca1+
                "\n"+no2+"\t\t\t\t\t"+ca2+"\n"+no3+"\t\t\t\t\t"+ca3+
                "\n"+no4+"\t\t\t\t\t"+ca4);
        
        System.out.println("El promedio es: "+prom);
    }
    
}

        
        
        
        
    
