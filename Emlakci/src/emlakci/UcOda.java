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
public class UcOda extends Daire {

    private int odaSayisi = 3;
    private int daireAlani;
    private int PencereSayisi;
    private boolean klimaVarMi;

    public UcOda(int PencereSayisi, boolean klimaVarMi) {
        super( PencereSayisi, klimaVarMi);
        this.daireAlani =odaAlani * 3;
        this.klimaVarMi = klimaVarMi;
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
