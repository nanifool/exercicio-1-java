package com.company;

public class Main {

    public static void main(String[] args) {
        int[] list = new int[20];
        int [] newList = new int[20];
        int i;

        for(i=0; i < list.length; i++) {
            list[i] = i * 10;
            System.out.println(list[i]);
        }

        //TODO: inverter array

        System.out.println("/////////");
        System.out.println(nOcorrencias(list, 20));
    }

    public static int nOcorrencias(int[] l, int el){
        int qtd = 0;
        for (int i = 0; i < l.length; i++){
            if (l[i] == el){
                qtd++;
            }
        }
        return qtd;
    }
}
