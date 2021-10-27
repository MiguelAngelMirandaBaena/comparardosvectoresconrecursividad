public class Ejercicios {
    /*
    Metodo recursivo para comparar dos vectores de entreos elemento por elemento
    vector1 = {5, 6, 2}
    vector2 = {2, 9, 2}
    difieren = 3 - 3 + 0 = 0
    */
    private static int compararVectores(int[] vector1, int[] vector2, int indice){
        int sumaDiferencias;

        if (indice == vector1.length - 1){//caso base
            sumaDiferencias = Math.abs(vector1[indice] - vector2[indice]);
        }else {//llamda recursiva
            sumaDiferencias = Math.abs(vector1[indice] - vector2[indice]) + compararVectores(vector1, vector2, indice + 1);
        }

        return sumaDiferencias;
    }
    /*
    Metodo auxiliar que realiza la llamada al metodo recursivo
    */
    public static boolean compararVectores(int[] vector1, int[] vector2){
        return compararVectores(vector1, vector2, 0) == 0;
    }
}
