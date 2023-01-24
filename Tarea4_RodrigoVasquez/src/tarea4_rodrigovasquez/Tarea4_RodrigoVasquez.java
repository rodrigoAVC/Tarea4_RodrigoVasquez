package tarea4_rodrigovasquez;

import java.util.ArrayList;

public class Tarea4_RodrigoVasquez {

    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList();
        ArrayList<Integer> lista2 = new ArrayList();
        ArrayList<Integer> lista3 = new ArrayList();
        lista1.add(3);
        lista2.add(11);
        lista1.add(5);
        lista2.add(7);
        lista1.add(9);
        lista2.add(17);
        lista1.add(2);
        lista2.add(3);
        lista1.add(11);
        lista2.add(5);
        lista1.add(17);
        lista2.add(9);
        int mayor = 0;
        for (Integer num1 : lista1) {
            for (Integer num2 : lista2) {
                if (num1 == num2) {
                    if (num1 > num2) {
                        mayor = num1;
                        if (lista3.contains(num1)) {
                        } else {
                            lista3.add(0, num1);
                        }
                    } else {
                        mayor = num2;
                        if (lista3.contains(num2)) {
                        } else {
                            lista3.add(0, num2);
                        }
                    }
                }
            }
        }
        for (Integer integer : lista3) {
            System.out.println(integer);
        }
    }

}
