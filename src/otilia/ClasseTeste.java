package otilia;

public class ClasseTeste {
    private int n1;
    private double n2;
    private String t1;

    //CONSTRUTORES
    public ClasseTeste() {}
    
    public ClasseTeste(int n1, double n2, String t1) {
        this.n1 = n1;
        this.n2 = n2;
        this.t1 = t1;
    }

    //SETTERS AND GETTERS
    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public String getT1() {
        return t1;
    }


    public void setT1(String t1) {
        this.t1 = t1;
    }

    //METODOS
    @Override
    public String toString() {
        return n1 + "," + n2 + "," + t1;
    }
}



