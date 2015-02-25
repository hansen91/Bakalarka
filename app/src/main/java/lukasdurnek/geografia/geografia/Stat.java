package lukasdurnek.geografia.geografia;

/**
 * Created by Lukas on 24. 2. 2015.
 */
public class Stat {
    private String nazov;
    private String kontinent;
    private String hlavneMesto;
    private String rozloha;
    private String pocObyv;
    private String znameMesta;
    private String uradnyJazyk;
    private String mena; //peniaze

    public Stat(String nazov, String kontinent, String hlavneMesto, String rozloha, String pocObyv, String znameMesta, String uradnyJazyk, String mena) {
        this.nazov = nazov;
        this.kontinent = kontinent;
        this.hlavneMesto = hlavneMesto;
        this.rozloha = rozloha;
        this.pocObyv = pocObyv;
        this.znameMesta = znameMesta;
        this.uradnyJazyk = uradnyJazyk;
        this.mena = mena;
    }

}
