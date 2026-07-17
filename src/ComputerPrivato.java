public class ComputerPrivato extends Gestore{
    private String tipo;
    public ComputerPrivato(Produttore marca, int valore, Persona utilizzatore) {
        super(marca, valore, utilizzatore);
    }

    @Override
    public void nuovoUtilizzatore(Persona utilizzatore) {
        System.out.println("Errore! Purtroppo non puoi cambiare il numero di utilizzatori");
    }
    @Override
    public void setUtilizzatore(Persona utilizzatore) {
        System.out.println("Errore! Purtroppo non puoi cambiare il numero di utilizzatori");
    }
}
