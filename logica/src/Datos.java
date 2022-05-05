import java.util.*;
//Elabore un programa que lea 10 datos numéricos en un arreglo e imprima los datos positivos y cuántos son.
public class Datos {
    public static void main(String[] args) {
        int i, positivos;
        positivos=0;
        int[]num=new int[10];

        for (i=0; i<=9; i++){
            System.out.println("Ingrese un numero");
            num[i]=Integer.parseInt(new Scanner(System.in).nextLine());

            if (i>0){
                positivos++;
            }
        }
        System.out.println("Los numeros positivos son: "+positivos);
    }
}
