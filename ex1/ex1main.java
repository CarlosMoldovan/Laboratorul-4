package ex1;
import java.util.*;

public class ex1main {
    public static void main(String args[])
    {
       /*Scanner sc = new Scanner(System.in);
       ArrayList<Persoana> arrayList = new ArrayList<Persoana>();
       int n;
       String prenume,luna,ziua,adresa;
       int an,cnp;
       System.out.println("Introdu un numar:");
       n = sc.nextInt();
       sc.nextLine(); 
      for(int i=1;i<=n;i++)
          {
          System.out.println("Persoana nr "  +i+  ":");
          System.out.println("Introdu un nume:");
          String nume = sc.nextLine();
          System.out.println("nume este:"+nume);
          System.out.println("Introdu un prenume:");
          prenume = sc.nextLine();
          System.out.println("Introdu anul de nastere:");
          an = sc.nextInt();
          sc.nextLine(); 
          System.out.println("Introdu luna de nastere:");
          luna = sc.nextLine();
          System.out.println("Introdu ziua de nastere:");
          ziua = sc.nextLine();
          System.out.println("Introdu cnp-ul:");
          cnp = sc.nextInt();
          sc.nextLine(); 
          System.out.println("Introdu adresa:");
          adresa = sc.nextLine();
          arrayList.add(new Persoana(nume, prenume, cnp, an, luna, ziua, adresa));
          }
       int medie=0;
       for(Persoana persoana: arrayList){
        System.out.println(persoana.toString());
        medie=medie+(2023-persoana.birthyear);
       }
       System.out.println("varsta medie: " + medie/n);
       System.out.println("Introdu un nou numar:");
       n = sc.nextInt();
       sc.nextLine();
       int[] v = new int[100];
       Random random = new Random();
       for(int i=1;i<=n;i++)
       {
          v[i]= random.nextInt(20);
       }
       System.out.println("Vectorul este: ");
       for(int i=1;i<=n;i++)
       {
         System.out.println(v[i] + " ");
       }
       String[] sir = new String[50];
       System.out.println("Introdu un nou numar:");
       n = sc.nextInt();
       sc.nextLine();
       String s;
       for(int i=1;i<=n;i++)
       {
          System.out.println("Introdu un sir:");
          s = sc.nextLine();
          sir[i] = s;
       }
       System.out.println("Vectorul de siruri de caractere este: ");
       for(int i=1;i<=n;i++)
       {
         System.out.println(sir[i]);
       }
      sc.close();*/
      //ex2
      /*Student student1 = new Student("Ion","Micula",1024,1);
      Student student2 = new Student("Moldovan","Radu", 1023, 1);
      Student student3 = new Student("Pop","Luca", 1025, 3);
      System.out.println(Student.getNumarInstante());*/
      //ex3
      /*logging mesaj1 = logging.getInstance();
      mesaj1.setMesaj("Faanakd");*/
      //ex4/EXERCITUL 2/ultimul......implementam clasa student conform Singlenton
      StudentSingleton student1 = StudentSingleton.getInstance();
      student1.setNume("Radu");
      student1.setPrenume("Grigore");
      student1.setAnStudiu(2);
      student1.setNrmatricol(2345);
      System.out.println("Studentul " + student1.getNume() +" "+ student1.getPrenume() + " cu numarul matricol " + student1.getNrmatricol() +" se afla în anul " + student1.getAnStudiu() + " de studiu!");

    }
}
