package registros.examen2parte2;

public class FuncionDeX {

    public int fX(int x) {
        if (x > 11) {
            return x;
        } else {
            return fX(fX(x + 2) + fX(x + 2));

        }
    }
}
