import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ComputerServiceList {
    private Persona utilizzatore;
    private String nome;
    private String indirizzo;
    /* private int numComputer; */
    //si decide di non usare numCOmputer perché l'arraylist permette di aumentare il numero dinamicamente

    private Produttore marca;

    private ArrayList<Gestore> computer;

    public ComputerServiceList(Persona utilizzatore, String nome, String indirizzo) {
        this.utilizzatore = utilizzatore;
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.computer = new ArrayList<Gestore>();
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

    public Produttore getMarca() {
        return this.marca;
    }

    public void setUtilizzatore(Persona utilizzatore) {
        this.utilizzatore = utilizzatore;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public void setMarca(Produttore marca) {
        this.marca = marca;
    }


    /*
    SECONDO METODO: Inserire un	computer nel service, il metodo	deve restituire	l'indice in	cui	viene inserito
     */
    public void aggiungiComputer(Gestore valore) {
        computer.add(valore);
    }

    /* TERZO METODO: Visualizzare il proprietario di un	computer dato il suo indice nel	vettore*/
    public Persona mostraUtilizzatore(int indice) {
        if (indice >= 0 && indice < computer.size() && computer.get(indice) != null) {
            return computer.get(indice).getUtilizzatore();
        } else {
            return null;
        }
    }

    /* QUARTO METODO: Cercare tutti	i computer (i loro indici) posseduti da	una	certa persona*/
    public ArrayList<Gestore> cercaUtilizzatore(Persona utilizzatore) {
        ArrayList<Gestore> risultato = new ArrayList<>();
        for (Gestore computer : computer) {
            if (computer != null && computer.getUtilizzatore().equals(utilizzatore)) {
                risultato.add(computer);
            }
        }

        return risultato;
    }

    /*QUINTO METODO: Stampare i	dati di	ognuno dei computer*/

    public void stampaComputer() {
        for (int i = 0; i < computer.size(); i++) {
            System.out.print(computer.get(i));
        }
    }

    /*SESTO METODO: Modificare il proprietario di un computer dato il suo indice*/

    public void modificaUtilizzatore(int indice, Persona nuovoUtilizzatore) {
        if (indice >= 0 && indice < computer.size() && computer.get(indice) != null) {
            computer.get(indice).setUtilizzatore(nuovoUtilizzatore);
            System.out.println("Il proprietario è stato modificato con successo.");
        } else {
            System.out.println("Nessun computer trovato per questo utilizzatore");
        }
    }

    /*SETTIMO METODO: Trovare il valore	di un computer dato	il suo indice*/

    public int mostraValore(int indice) {
        if (indice >= 0 && indice < computer.size()) {
            return computer.get(indice).getValore();
        } else {
            System.out.println("Spiacente non è stato trovato alcun computer");
            return -1;
        }
    }

    /*OTTAVO METODO: Trovare il	totale dei valori dei computer gestiti dal service */

    public int totaleValori() {
        int totale = 0;
        for (int i = 0; i < computer.size(); i++) {
            totale = totale + computer.get(i).getValore();
        }
        return totale;
    }

    /*NONO METODO: Trovare il computer con valore massimo e	quello con valore minimo*/

    public ArrayList<Gestore> valoriMaxMin() {
        Gestore valoreMax = computer.get(0);
        Gestore valoreMin = computer.get(0);

        for (int i = 1; i < computer.size(); i++) {
            if (valoreMax.getValore() > computer.get(i).getValore()) {
                valoreMax = computer.get(i);

            }
            if (valoreMin.getValore() < computer.get(i).getValore()) {
                valoreMin = computer.get(i);
            }
        }
        return new ArrayList<Gestore>();
    }

    /* DECIMO METODO: Trovare tutti	i computer, di	una	data marca (parametrico	rispetto alla marca)*/

    public ArrayList<Gestore> trovaMarca(Produttore marca) {
        ArrayList<Gestore> risultato = new ArrayList<>();
        for (int i = 0; i < computer.size(); i++) {
            if (computer.get(i).getMarca().equals(marca) && computer.get(i) != null) {
                risultato.add(computer.get(i));
            }
        }
        return risultato;
    }

    /*UNDICESIMO METODO: Trovare i computer che	non	hanno mai cambiato proprietario (unico	proprietario),
        restituendo	il vettore di tali computer*/

    public ArrayList<Gestore> unicoProprietario() {
        ArrayList<Gestore> risultato = new ArrayList<>();
        for (int i = 0; i < computer.size(); i++) {
            if (computer.get(i).getUtilizzatore().equals(utilizzatore) && computer.get(i) != null) ;
            {
                risultato.add(computer.get(i));
            }
        }
        return risultato;

    }

    /*DODICESIMO METODO: Ordinare i	computer in	base al	valore crescente (usando i	metodi forniti dalla classe	Arrays)*/

    public void ordinaComputer() {
        Collections.sort(computer);
        for (Gestore computer : computer) {
            System.out.println(computer);
        }
    }


    }



