package com.patterns.design.constructional.builder.ex4;

public class BudownczyHulajnogiStandardowej implements IBudowniczyHulajnog {
    private Hulajnoga hulajnoga = new Hulajnoga();

    public void DokrecKolka(){
        hulajnoga.setKolka("koStandard");
    };

    public void ZamontujHamulce(){
        hulajnoga.setHamulec("haStandard");
    };

    public void DoklejNaklejke(){
        hulajnoga.setNaklejka("naStandard");
    };

    public void ZamontujKierownice(){
        hulajnoga.setKierownica("kiStandard");
    };

    public Hulajnoga OddajZbudowanaHulajnoge(){
        return hulajnoga;
    };
}
