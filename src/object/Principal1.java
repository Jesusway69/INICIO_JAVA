package object;

public class Principal1 {

    public static void main(String[] args) {

        int a1 = 0;
        int[] vector1 = {1, 3, 4, 5};
        for (int x1 : vector1) {
            System.out.println(x1);
            a1 = a1 + x1;
        }
        System.out.println("Suma: " + a1);

        Alumno a;
        int b;
        double c;
        String d;
        char e;
        boolean f;

        Object[] vector2 = {1, 1.4, "Luis", 'A', true, new Alumno(1, "Miguel")};
        for (Object objeto : vector2) {

            if (objeto instanceof Integer) {
                b = (int) objeto;
                System.out.println("Integer  : " + b);
            }
            if (objeto instanceof Double) {
                c = (double) objeto;
                System.out.println("Double   : " + c);
            }
            if (objeto instanceof String) {
                d = (String) objeto;
                System.out.println("String   : " + d);
            }
            if (objeto instanceof Character) {
                e = (char) objeto;
                System.out.println("Character: " + e);
            }
            if (objeto instanceof Boolean) {
                f = (boolean) objeto;
                System.out.println("Boolean  : " + f);
            }
            if (objeto instanceof Alumno) {
                a = (Alumno) objeto;
                System.out.println("Alumno   : " + a);
            }

        }

    }

}
