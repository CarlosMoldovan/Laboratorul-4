package ex1;

public class Student {
    String nume, prenume;
    private int nrmatricol;
    int an;
    private static int nrinstantieri = 0;
    public Student(String nume,String prenume,int nrmatricol,int an)
    {
        this.nume = nume;
        this.prenume = prenume;
        this.nrmatricol = nrmatricol;
        this.an = an;
        nrinstantieri++;
    }
    public static int getNumarInstante() {
        return nrinstantieri;
    }
}
