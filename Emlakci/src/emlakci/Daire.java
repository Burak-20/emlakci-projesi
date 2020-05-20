
package emlakci;

public abstract class  Daire {

    public int hesap;
    public int odaAlani = 25;
    private int PencereSayisi ;
    private boolean klimaVarMi;
    public int birimHesabi ;
    public int klimaFiyati = 2000 ;

    public Daire( int PencereSayisi, boolean klimaVarMi) {
        this.PencereSayisi = PencereSayisi;
        this.klimaVarMi = klimaVarMi;
    }

    public abstract int fiyatHesapla() ;
    
        
        

    }
