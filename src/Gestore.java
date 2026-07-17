public class Gestore implements Comparable<Gestore> {
    //Per evitare che si verifichino problemi di ridondanza si considera il numero dei computer come il conteggio degli id di ciascun computer.
    private int id;
    private static int conteggio = 0;

    private Persona utilizzatore;
    private Produttore marca;
    protected int valore;
    private static int numeroUtilizzatori = 0;

    public Gestore() {
    }

    public Gestore(Produttore marca, int valore, Persona utilizzatore) {
        this.id = conteggio;
        conteggio++;
        this.marca = marca;
        this.utilizzatore = utilizzatore;
        this.valore = valore;
    }


    public int getId() {
        return this.id;
    }

    public Persona getUtilizzatore() {
        return this.utilizzatore;
    }

    public Produttore getMarca() {
        return this.marca;
    }

    public int getValore() {
        return this.valore;
    }

    public int getNumeroUtilizzatori() {
        return this.numeroUtilizzatori;
    }

    public void setUtilizzatore(Persona utilizzatore) {
        this.utilizzatore = utilizzatore;
        numeroUtilizzatori++;
    }

    public void setValore(int valore) {
        this.valore = valore;
    }

    public void setMarca(Produttore marca) {
        this.marca = marca;
    }

    public void aumentaValore(int x) {
        this.valore = valore + x;
    }

    public void diminuisciValore(int x) {
        this.valore = valore - x;
    }


    public void nuovoUtilizzatore(Persona utilizzatore) {
        this.utilizzatore = utilizzatore;
        aumentaNUtilizzatori();
    }

    public static int quantiComputer() {
        return conteggio;
    }

    private void aumentaNUtilizzatori() {
        this.numeroUtilizzatori++;
    }


    @Override
    public int compareTo(Gestore g) {
        if (this.valore > g.getValore()) {
            return 1;
        } else if (this.valore == g.getValore()) {
            return 0;
        } else {
            return -1;
        }

    }
}