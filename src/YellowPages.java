import java.util.HashMap;
public class YellowPages {
    private HashMap <String, ComputerService> citta;
    public YellowPages (){
        this.citta= new HashMap<>();

    }
    public HashMap<String, ComputerService> getCitta() {
        return citta;
    }

    /* PRIMO METODO: aggiungere	una	citta e	il suo Computer	Service	(con errore se la citta	già esiste) */
    public void aggiungiCitta(String nomeCitta, ComputerService computerService) {
        if (this.citta.containsKey(nomeCitta)) {
            citta.put(nomeCitta, computerService);
        } else {
            System.out.println("Errore: la città" + nomeCitta + "esiste già");
        }
    }


/* SECONDO METODO: trova nome ed indirizzo del Computer	service	data la	citta (oppure dire
che	non	esiste)*/

    public void trova (String nomeCitta) {
        if (citta.containsKey(nomeCitta)) {
            ComputerService computerService = citta.get(nomeCitta);
            System.out.println("Nome:" + computerService.getNome() + "Indirizzo:" + computerService.getIndirizzo());
        } else {
            System.out.println("Errore la città non esiste");
        }
    }

    /*TERZO METODO: elimina	un computer service data la citta*/

    public void elimina (String nomeCitta, ComputerService computerService) {
        if (citta.containsKey(nomeCitta)) {
            citta.remove(nomeCitta);}
    }

    /*QUARTO METODO: elenca	le citta in	cui	è presente un ComputerService*/
    public void elenca (String nomeCitta) {
        for (String citta : citta.keySet()) {
            System.out.println("Ecco la lista di città in cui è presente un computer service:" + nomeCitta );
        }
    }

}
