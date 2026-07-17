public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Persona p1 = new Persona("Bianchi", "via Susa");
        Persona p2 = new Persona("Rossi", "via Roma");
        Persona p3 = new Persona("Verdi", "via Garibaldi");
        Persona p4 = new Persona("Longo", "via Po");
        String indirizzo1 = p1.getIndirizzo();
        String indirizzo2 = p2.getIndirizzo();
        String indirizzo3 = p3.getIndirizzo();
        Produttore r1 = new Produttore("Sony", "Corea del Sud");
        Produttore r2 = new Produttore("Apple", "Stati Uniti");
        Produttore r3 = new Produttore("Samsung", "Giappone");

        String nazione1 = r1.getNazione();
        String nazione2 = r2.getNazione();
        String nazione3 = r3.getNazione();


        Gestore g = new Gestore(r1, 1, p1);
        Gestore g1 = new Gestore(r2, 2, p2);
        Gestore g2 = new Gestore(r3, 3, p3);

        int valore1 = g1.getValore();
        int valore2 = g2.getValore();
        int valore3 = g.getValore();

        ComputerTavolo ct = new ComputerTavolo(p1, r1, 2, "Computer da tavolo", 5);
        ComputerPrivato pt = new ComputerPrivato(r2, 2, p3);

        ComputerService cs1 = new ComputerService(p1, "Ciao", "Corso Giulio Cesare", 25);
        ComputerService cs2 = new ComputerService(p2, "Bye", "Corso Vittorio Emanunele", 25);
        ComputerService cs3 = new ComputerService(p3, "Salut", "Corso Regio Parco", 25);


        cs1.aggiungiComputer(pt);
        cs1.aggiungiComputer(ct);
        cs2.aggiungiComputer(g1);
        cs2.aggiungiComputer(g2);
        cs3.aggiungiComputer(g2);
        cs3.aggiungiComputer(ct);

        cs2.mostraUtilizzatore(2);

        cs2.stampaComputer();
        cs1.mostraUtilizzatore(1);

        cs3.cercaUtilizzatore(p2);



        cs2.modificaUtilizzatore(2,p2);

        cs3.mostraValore(3);

        cs2.totaleValori();
        cs1.totaleValori();

        cs3.trovaMarca(r3);

        cs1.ordinaComputer();
        cs2.ordinaComputer();
        cs3.ordinaComputer();

        YellowPages y1 = new YellowPages ();
        YellowPages y2 = new YellowPages ();
        YellowPages y3 = new YellowPages ();
        YellowPages y4 = new YellowPages ();
        YellowPages y5 = new YellowPages ();

        y1.trova("Torino");
        y2.elenca("Milano");
        y3.aggiungiCitta("Torino", cs2);
        y4.aggiungiCitta("Firenze", cs3);




    }
}
