package com.patterns.design.constructional.builder.ex4;

public class Dyrektor
{
    public void ZbudujMiHulajnogeWKtorejJestesSpecjalista(IBudowniczyHulajnog budowniczy)
    {
        budowniczy.DokrecKolka();
        budowniczy.ZamontujHamulce();
        budowniczy.DoklejNaklejke();
        budowniczy.ZamontujKierownice();
    }
}