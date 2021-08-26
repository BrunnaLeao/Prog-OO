/*Brunna Vila Chã - 0050016542*/

import java.util.*;

class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = 10;

        Vector<Integer> v = new Vector<Integer>(a);

        for(int i=0; i<10; i++){
            System.out.printf("Digite um número: ");
                v.add(sc.nextInt());
        }

        Collections.sort(v);

        System.out.println("o Vetor em ordem crescente: " + v);

    }

}