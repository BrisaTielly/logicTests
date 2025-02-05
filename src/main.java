

public class main{
    public static void main(String[] args) {
        int x = 10,y = 20,aux;
        System.out.printf("Antes:\n" + "x= " + x + "\ny= "+ y);

        aux = x;
        x = y;
        y = aux;
        Integer j = 18;
        j.floatValue();
        System.out.printf("\nDepois:\n" + "x= " + x + "\ny= "+ y);

    }
}
