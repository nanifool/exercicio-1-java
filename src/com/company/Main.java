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

//2 ) Construa os seguintes métodos sobre arranjos
//        a. Método que retorna quantas ocorrências de um elemento estão na lista
public static int nOcorrencias(int[] l, Integer el) {

}
//        b. Método que retorna true se l tem elementos repetidos
public static boolean hasRepeat(int[] l){

}
//        c. Método que retorna o número de elementos repetidos em l
public static int nroRepeat(int[] l){

}
//        d. Método que retorna uma lista de elementos repetidos de l
public static int[] listRepeat(int[] l){

}
//        e. Método que retorna a união de l1 e l2
public static int[] union(int[] l1, int[] l2){

}
//        f. Método que retorna a intersecção de l1 e l2
public static int[] intersect(int[] l1, int[] l2){

}
//        g. Método que retorna a diferença entre l1 e l2
public static int[] difference(int[] l1, int[] l2){

}
