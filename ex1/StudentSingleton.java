package ex1;

public class StudentSingleton {
    private static StudentSingleton instance;
    private String nume, prenume;
    private int nrmatricol;
    private int an;
    private StudentSingleton()
    {
        nume = null;
        prenume = null;
        nrmatricol =-1;
        an = -1;
    }
    public static StudentSingleton getInstance() {
        if( null == instance) {
            instance = new StudentSingleton();
        }
        return instance;
    }
    public void setNume(String nume)
    {
        this.nume = nume;
    }
    public void setPrenume(String prenume)
    {
        this.prenume = prenume;
    }
    public void setNrmatricol(int nrmatricol)
    {
        this.nrmatricol = nrmatricol;
    }
    public void setAnStudiu(int an)
    {
        this.an = an;
    }
    public String getNume()
    {
        return nume;
    }
    public String getPrenume()
    {
        return prenume;
    }
    public int getNrmatricol()
    {
        return nrmatricol;
    }
    public int getAnStudiu()
    {
        return an;
    }

}

