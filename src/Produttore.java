public class Produttore {
    private String nome;
    private String nazione;
    public Produttore()
    {this.nome ="";
    this.nazione="";}

    public Produttore (String nome, String nazione)
    {this.nome=nome;
    this.nazione=nazione;}

    public String getNome ()
    {return this.nome;}

    public String getNazione ()
    {return this.nazione;}

    public void setNazione (String nazione)
    {this.nazione=nazione;}

}
