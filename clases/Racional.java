package clases;

public class Racional {
    private int numerador = 1;
    private int denominador = 1;
    private int r1 = 1;
    private int r2 = 1;
    private int result = 1;

    //Constructores
    public Racional(){

    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public int getR1() {
        return r1;
    }

    public void setR1(int r1) {
        this.r1 = r1;
    }

    public int getR2() {
        return r2;
    }

    public void setR2(int r2) {
        this.r2 = r2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void setDenominador(int denominador) {
        if(denominador >= 1) this.denominador = denominador;
    }

    public String ToString() {
        String str =String.format("{numerador/denomindaor %d/%d }", this.numerador, this.denominador);
        return str;
    }

    public Racional sumaRacional(Racional r) {
        Racional r1 = new Racional();
        r1.numerador=(r1.numerador+r.numerador);
        r1.denominador=(r1.denominador*r.denominador);

        return r1;
    }
    public Racional restaRacional(Racional r) {
        Racional r1 = new Racional();
        r1.numerador=(r1.numerador-r.numerador);
        r1.denominador=(r1.denominador-r.denominador);
        return r1;
    }
    public Racional multiplicacionRacional(Racional r) {
        Racional r1 = new Racional();
        r1.numerador=(r1.numerador*r.numerador);
        r1.denominador=(r1.denominador*r.denominador);
        return r1;
    }
    public Racional divisionRacional(Racional r) {
        Racional r1 = new Racional();
        r1.numerador=(r1.numerador/r.numerador);
        r1.denominador=(r1.denominador/r.denominador);
        return r1;
    }

    public Racional reducirRacional(Racional r) {
        Racional r1 = new Racional();
        if (r.numerador > r.denominador) {
                r1.result = r.numerador / r.denominador;
                r1.numerador = r.numerador - r.denominador;
            }
        else {
            System.out.println("Operación no posible");
        }
            return r1;
        }


    public boolean Equals(Object r) {
        if(!(r instanceof Racional)) {
            return false;
        }
        if(this.getNumerador() == ((Racional) r).getNumerador() && this.getDenominador() == ((Racional) r).getDenominador()) {
            return true;
        }
        else
            return false;
        }

    public Racional clonar(Racional r3) {
        Racional r = new Racional();
        r.setDenominador(this.denominador);
        r.setNumerador(this.numerador);
        return r;
    }
}


