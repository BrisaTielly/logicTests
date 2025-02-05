package B_hackerrank;

import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int tam = arr.size();
        int diagonalPrincipal = 0;
        int diagonalInversa = 0;
        int aux = tam - 1;
        for(int i = 0; i<tam; i++){
            for(int j = 0; j<tam; j++){
                if(i == j) diagonalPrincipal += arr.get(i).get(j);
                if(i+j == aux) diagonalInversa += arr.get(i).get(j);
            }
        }
        System.out.println(diagonalPrincipal + " " + diagonalInversa);
        int diagonalDifference = diagonalPrincipal - diagonalInversa;
        return (diagonalDifference < 0) ? Math.abs(diagonalDifference) : diagonalDifference;

    }
}
