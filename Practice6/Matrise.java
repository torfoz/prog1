import java.util.Arrays;

public class Matrise {
    private final int[][] matrise1 = new int[2][2];
    private final int[][] matrise2 = new int[2][2];

    public final int[][] getMatrise1() {
        matrise1[0][0] = 1;
        matrise1[0][1] = 2;
        matrise1[1][0] = 3;
        matrise1[1][1] = 4;
        return matrise1;
    }

    public final int[][] getMatrise2() {
        matrise2[0][0] = 1;
        matrise2[0][1] = 1;
        matrise2[1][0] = 1;
        matrise2[1][1] = 1;
        return matrise2;
    }

    public int[][] addere() {
        int[][] sumMatrise = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sumMatrise[i][j] = matrise1[i][j] + matrise2[i][j];
            }
        }
        return sumMatrise;
    }

    public int[][] subtrahere() {
        int[][] sumMatrise = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sumMatrise[i][j] = matrise1[i][j] - matrise2[i][j];
            }
        }
        return sumMatrise;
    }

    public int[][] multiplisere() {
        int[][] sumMatrise = new int[2][2];
        int a = matrise1[0][0];
        int b = matrise1[0][1];
        int c = matrise1[1][0];
        int d = matrise1[1][1];
        int e = matrise2[0][0];
        int f = matrise2[0][1];
        int g = matrise2[1][0];
        int h = matrise2[1][1];
        sumMatrise[0][0] = a*e + b*g;
        sumMatrise[0][1] = a*f + b*h;
        sumMatrise[1][0] = c*e + d*g;
        sumMatrise[1][1] = c*f + d*h;

        return sumMatrise;
        }

    public int[][] transpose() {
        int c = matrise1[0][1];
        int b = matrise1[1][0];
        matrise1[1][0] = c;
        matrise1[0][1] = b;
        return matrise1;
    }

    public static void main(String[] args) {
        Matrise m = new Matrise();
        System.out.println(Arrays.deepToString(m.getMatrise1()));
        System.out.println(Arrays.deepToString(m.getMatrise2()));
        System.out.println(Arrays.deepToString(m.addere()));
        System.out.println(Arrays.deepToString(m.subtrahere()));
        System.out.println(Arrays.deepToString(m.multiplisere()));
        System.out.println(Arrays.deepToString(m.transpose()));
    }
}


