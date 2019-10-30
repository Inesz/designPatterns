package com.patterns.design.constructional.builder.ex4;

public class BudowniczyHulajnogiExtremalnej implements IBudowniczyHulajnog {
    private Hulajnoga hulajnoga = new Hulajnoga();

    public void DokrecKolka(){
        hulajnoga.setKolka("koExtreme");
    };

    public void ZamontujHamulce(){
        hulajnoga.setHamulec("haExtreme");
    };

    public void DoklejNaklejke(){
        hulajnoga.setNaklejka("naExtreme");
    };

    public void ZamontujKierownice(){
        hulajnoga.setKierownica("kiExtreme");
    };

    public Hulajnoga OddajZbudowanaHulajnoge(){
        return hulajnoga;
    };
}
