public class ComputerTavolo extends Gestore {
    private String tipo;
    private int valoreMonitor;

    public ComputerTavolo (Persona utilizzatore, Produttore marca, int valore, String tipo, int valoreMonitor)
    {super (marca, valore, utilizzatore);
    this.tipo=tipo;
    this.valoreMonitor=this.valoreMonitor;
    }
    public String getTipo ()
    {return tipo; }

    public int getValoreMonitor ()
    {return valoreMonitor; }

    public void setTipo(String tipo) {
        this.tipo = tipo; }
    public void setValoreMonitor(int valoreMonitor) {
        this.valoreMonitor = valoreMonitor; }

    //metodo per cambiare il valore, in questo caso si sottrae il valore precedente per poter ottenere quello nuovo.
    public int cambiaValore (int nuovoValore)
    {super.valore=(super.getValore()-this.valoreMonitor + nuovoValore);
    return this.valoreMonitor= nuovoValore; }
}
