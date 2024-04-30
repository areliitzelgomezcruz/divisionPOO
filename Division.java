class Division{
    double n1, n2, res;

    public double dividir(){

        res = n1 / n2;
        return res;
    }

    public void mostrarResultado(){

        System.out.println("El resultado de la division es: " + res);
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    @Override
    public String toString() {
        return "Division [n1=" + n1 + ", n2=" + n2 + ", res=" + res + "]";
    }

    
}