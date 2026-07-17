public class Persona {
    private String cognome;
    private int id;
    private String indirizzo;
    public static int conteggio=0;

   public Persona (String bianchi)
    {this.cognome="";
        this.id=conteggio;
        this.indirizzo="";
    }
    public Persona (String cognome, String indirizzo)
    {this.cognome=cognome;
    this.indirizzo=indirizzo;
    this.id=conteggio;
    conteggio++;
    }

    public String getCognome ()
    {return this.cognome;}
    public String getIndirizzo ()
    {return this.indirizzo;}

    public int getId ()
    {return this.id;}
    public void setIndirizzo (String indirizzo)
    {this.indirizzo=indirizzo;}

}
