/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emlakci;

/**
 *
 * @author Burak
 */
public class IkiOda extends Daire {

    private int odaSayisi = 2;
    private int daireAlani;
    private int PencereSayisi;
    private boolean klimaVarMi;

    public IkiOda( int PencereSayisi, boolean klimaVarMi) {
        super(PencereSayisi, klimaVarMi);
        this.daireAlani = odaAlani * 2;
        this.klimaVarMi = klimaVarMi ;
        birimHesabi = 1300 ;
    }

    @Override
    public int fiyatHesapla() {
        if (klimaVarMi) {
            hesap = daireAlani * birimHesabi + klimaFiyati;

        } else {
            hesap = daireAlani * birimHesabi;

        }
        return hesap;
    }

}
