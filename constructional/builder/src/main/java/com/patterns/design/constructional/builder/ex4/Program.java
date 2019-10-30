package com.patterns.design.constructional.builder.ex4;

class Program
{
    public static void main(String[] args)
    {
        Dyrektor James = new Dyrektor();
        IBudowniczyHulajnog Aron = new BudownczyHulajnogiStandardowej();
        IBudowniczyHulajnog Michal = new BudowniczyHulajnogiExtremalnej();

        James.ZbudujMiHulajnogeWKtorejJestesSpecjalista(Aron);
        James.ZbudujMiHulajnogeWKtorejJestesSpecjalista(Michal);

        Hulajnoga hulajnogaStandardowa = Aron.OddajZbudowanaHulajnoge();
        Hulajnoga hulajnogaExtreme = Michal.OddajZbudowanaHulajnoge();

        System.out.println(hulajnogaExtreme);
        System.out.println(hulajnogaStandardowa);
    }
}