package com.company;

public class Main {

    public static void main(String[] args){
        int[] list = new int[20];
        int i;

        System.out.println("\nlista:");
        for(i=0; i < list.length; i++){
            list[i] = i * 10;
            System.out.println(list[i]);
        }

        System.out.println("\nlista invertidade:");

        for(i= list.length -1; i>=0; i--){
            System.out.println(list[i]);
        }

        System.out.println("\nnumero de ocorrencias");
        System.out.println(nOcorrencias(list, 20));
        System.out.println("\nelementos repetidos");
        System.out.println(hasRepeat(list));
        System.out.println("\nnumeros repetidos");
        System.out.println(nroRepeat(list));
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

    //        b. Método que retorna true se l tem elementos repetidos
    public static boolean hasRepeat(int[] l){
        boolean nRepetead = false;
        for(int i=0; i < l.length; i++ ){
            for(int j=0; j < i; j++){
                if (l[i] == l[j]){
                    nRepetead = true;
                }
            }
        }
        return nRepetead;
    }
    //        c. Método que retorna o número de elementos repetidos em l
    public static int nroRepeat(int[] l){
        int nRepetead = 0;
        for(int i=0; i < l.length; i++){
            for (int j=0; j < l.length; j++){
                if (l[i] == l[j]){
                    nRepetead++;
                }
            }
        }
        return nRepetead;
    }

    //TODO: verificar se o exercicio acima, b e c, estão corretos.


//    //        d. Método que retorna uma lista de elementos repetidos de l
//    public static int[] listRepeat(int[] l){
//    //TODO: escrever aqui
//    }
//    //        e. Método que retorna a união de l1 e l2
//    public static int[] union(int[] l1, int[] l2){
//    //TODO: escrever aqui
//    }
//    //        f. Método que retorna a intersecção de l1 e l2
//    public static int[] intersect(int[] l1, int[] l2){
//    //TODO: escrever aqui
//    }
//    //        g. Método que retorna a diferença entre l1 e l2
//    public static int[] difference(int[] l1, int[] l2){
//    //TODO: escrever aqui
//    }
}