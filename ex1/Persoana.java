package ex1;
class Persoana{
    String nume;
    String prenume;
    private int cnp;
    int birthyear;
    String birthmonth;
    String birthday;
    private String adresa;
    public Persoana(String nume,String prenume,int cnp,int birthyear,String birthmonth,String birthday,String adresa)
    {
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
        this.birthyear = birthyear;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.adresa = adresa;
    }
    public void setCnp(int cnppers)
    {
        cnp = cnppers;
    }
    public int getCnp()
    {
        return cnp;
    }
    public void setAdresa(String adresaPers)
    {
        adresa = adresaPers;
    }
    public String getAdresa()
    {
        return adresa;
    }
@Override
public String toString(){
    return "Persona se numeste" + nume + prenume + " este nascuta pe " + birthyear + " " + birthmonth + " " + birthday +" are cnp-ul " + cnp + " iar adresa este " + adresa;
}
}