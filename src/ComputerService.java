import java.util.Arrays;

public class ComputerService {
    private Persona utilizzatore;
    private String nome;
    private String indirizzo;
    /* private Gestore[] computer; */
    private int numComputer;

    private Produttore marca;
    Gestore[] computer = new Gestore[numComputer];

    public ComputerService(Persona utilizzatore, String nome, String indirizzo, int numComputer) {
        this.utilizzatore = utilizzatore;
        this.nome = nome;
        this.indirizzo = indirizzo;
        Gestore[] computer = new Gestore[numComputer];
        this.numComputer = 0;
        for (int i = 0; i < numComputer; i++) {
            computer[i] = new Gestore();
        }
    }

    /* PRIMO METODO: Getter e setter per i suoi	attributi */
    public String getIndirizzo() {
        return this.indirizzo;
    }

    public String getNome() {
        return this.nome;
    }

    public Persona getUtilizzatore() {
        return this.utilizzatore;
    }

    public Produttore getMarca() { return this.marca; }

    public void setUtilizzatore(Persona utilizzatore) {
        this.utilizzatore = utilizzatore;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public void setMarca (Produttore marca) {this.marca = marca;}

    /*
    SECONDO METODO: Inserire un	computer nel service, il metodo	deve restituire	l'indice in	cui	viene inserito
     */
    public void aggiungiComputer(Gestore valore) {
        if (numComputer < computer.length) {
            computer[numComputer] = valore;
            numComputer++;
        } else {
            System.out.println("Capienza massima raggiunta, impossibile aggiungere altri computer");
            System.exit(0);
        }

    }

    /* TERZO METODO: Visualizzare il proprietario di un	computer dato il suo indice nel	vettore*/
    public Persona mostraUtilizzatore(int indice) {
        if (indice >= 0 && indice < computer.length && computer[indice] != null) {
            return computer[indice].getUtilizzatore();
        } else {
            return null;
        }
    }

    /* QUARTO METODO: Cercare tutti	i computer (i loro indici) posseduti da	una	certa persona*/
    public Gestore[] cercaUtilizzatore(Persona utilizzatore) {
        Gestore[] risultato = new Gestore[computer.length];
        int numComputer = 0;
        for (int i = 0; i < computer.length; i++) {
            if (this.computer[i].getUtilizzatore().equals(utilizzatore) && this.computer[i] != null) {
                risultato[numComputer] = this.computer[i];
                numComputer++;
            }
        }
        return risultato;
    }

    /*QUINTO METODO: Stampare i	dati di	ognuno dei computer*/
    public void stampaComputer() {
        for (int i = 0; i < computer.length; i++) {
            System.out.println("Ecco stampato il tuo computer" + computer[i].getMarca() + computer[i].getId() + computer[i].getValore());
        }
    }

    /*SESTO METODO: Modificare il proprietario di un computer dato il suo indice*/
    public void modificaUtilizzatore(int indice, Persona nuovoUtilizzatore) {
        if (indice >= 0 && indice < computer.length && computer[indice] != null) {
            computer[indice].setUtilizzatore(nuovoUtilizzatore);
            System.out.println("Il proprietario è stato modificato con successo.");
        } else {
            System.out.println("Nessun computer trovato per questo utilizzatore");
        }
    }

    /*SETTIMO METODO: Trovare il valore	di un computer dato	il suo indice*/

    public int mostraValore(int indice) {
        if (indice >= 0 && indice < computer.length) {
            return computer[indice].getValore();
        } else {
            System.out.println("Spiacente non è stato trovato alcun computer");
            return -1;
        }
    }

    /*OTTAVO METODO: Trovare il	totale dei valori dei computer gestiti dal service */
    public int totaleValori() {
        int totale = 0;
        for (int i = 0; i < computer.length; i++) {
            totale = totale + computer[i].getValore();
        }
        return totale;
    }

    /*NONO METODO: Trovare il computer con valore massimo e	quello con valore minimo*/
    public Gestore[] valoriMaxMin() {
        Gestore valoreMax = computer[0];
        Gestore valoreMin = computer[0];

        for (int i = 1; i < computer.length; i++) {
            if (valoreMax.getValore() > computer[i].getValore()) {
                valoreMax = computer[i];

            }
            if (valoreMin.getValore() < computer[i].getValore()) {
                valoreMin = computer[i];
            }
        }
        return new Gestore[]{valoreMax, valoreMin};
    }


    /* DECIMO METODO: Trovare tutti	i computer, di	una	data marca (parametrico	rispetto alla marca)*/

    public Gestore[] trovaMarca(Produttore marca) {
        Gestore[] risultato = new Gestore[computer.length];
        int numComputer = 0;
        for (int i = 0; i < computer.length; i++) {
            if (this.computer[i].getMarca().equals(marca) && this.computer[i] != null) {
                risultato[numComputer] = this.computer[i];
                numComputer++;
            }
        }
        return risultato;
    }

        /*UNDICESIMO METODO: Trovare i computer che	non	hanno mai cambiato proprietario (unico	proprietario),
        restituendo	il vettore di tali computer*/

    public Gestore[] unicoProprietario() {
        Gestore[] risultato = new Gestore[computer.length];
        int indice = 0;
        for (int i = 0; i < computer.length; i++) {
            if (computer[i].getUtilizzatore().equals(utilizzatore) && this.computer[i] != null) ;
            {
                risultato[indice] = computer[i];
                indice++;
            }
        }
        return risultato;
    }


    /*DODICESIMO METODO: Ordinare i	computer in	base al	valore crescente (usando i	metodi forniti dalla classe	Arrays)*/

    public Gestore[] ordinaComputer() {
        Gestore[] ordinato=this.computer;
        Arrays.sort(computer);
        {
            for (Gestore computer : computer) {
                numComputer = computer.getValore();
                System.out.println("Ecco a te l'elenco dei computer in ordine crescente" + computer.getId() + computer.getValore());
            }
        }
        return ordinato;
    }


}



