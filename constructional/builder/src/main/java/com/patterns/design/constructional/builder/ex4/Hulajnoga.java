package com.patterns.design.constructional.builder.ex4;

public class Hulajnoga
{
    private String Hamulec = "ha";
    private String Kierownica = "ki";
    private String Kolka = "ko";
    private String Naklejka = "na";

    public String getHamulec() {
        return Hamulec;
    }

    public void setHamulec(String hamulec) {
        Hamulec = hamulec;
    }

    public String getKierownica() {
        return Kierownica;
    }

    public void setKierownica(String kierownica) {
        Kierownica = kierownica;
    }

    public String getKolka() {
        return Kolka;
    }

    public void setKolka(String kolka) {
        Kolka = kolka;
    }

    public String getNaklejka() {
        return Naklejka;
    }

    public void setNaklejka(String naklejka) {
        Naklejka = naklejka;
    }

    @Override
    public String toString(){
        return Hamulec + " " + Kierownica + " " + Kolka + " " + Naklejka;
    }
}