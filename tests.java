import clases.Racional;

public class tests {
    public static void main(String[] args) {
        Racional R1 = new Racional();
        Racional R2 = new Racional();
        Racional R3 = new Racional();
        Racional R4 = new Racional();
        Racional R5 = new Racional();
        Racional R6 = new Racional();
        Racional R7 = new Racional();
        Racional R8 = new Racional();
        Racional R9 = new Racional();
        Racional R10 = new Racional();

        R1.setDenominador(1);
        R1.setNumerador(1);

        R2.setNumerador(2);
        R2.setDenominador(3);

        R3.setNumerador(8);
        R3.setDenominador(12);

        R4.setNumerador(12);
        R4.setDenominador(5);

        R5.setNumerador(16);
        R5.setDenominador(8);

        R6.clonar(R3);

        R7 = R2.sumaRacional(R3);

        R8 = R4.restaRacional(R5);

        R9 = R2.multiplicacionRacional(R3);

        R10 = R3.divisionRacional(R6);

        System.out.println(R5.equals(R2));
        System.out.println(R3.equals(R2));

    }
}