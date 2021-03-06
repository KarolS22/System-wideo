package com.company;

public class Main {

    public static void main(String[] args) {

        String nazwaPliku="Sample.avi";
        FabrykaOdtwarzaczy obiekt = new FabrykaOdtwarzaczy();

        OdtwarzaczWideo odtwarzacz = obiekt.zwrocOdtwarzaczWideo(nazwaPliku);

        if(odtwarzacz != null) {
            odtwarzacz.odtwarzaj(nazwaPliku);
        }

    }
}

interface OdtwarzaczWideo {

    public void odtwarzaj(String nazwaPliku);

}

class OdtwarzaczMP4 implements OdtwarzaczWideo {

    public void odtwarzaj(String nazwaPliku) {
        System.out.println("Odtwarzaj format mp4 z pliku "+nazwaPliku);
    }
}

class OdtwarzaczAVI implements OdtwarzaczWideo {

    public void odtwarzaj(String nazwaPliku) {
        System.out.println("Odtwarzaj format AVI z pliku "+nazwaPliku);
    }
}

class FabrykaOdtwarzaczy {

    public OdtwarzaczWideo zwrocOdtwarzaczWideo(String nazwaPliku) {
        if (nazwaPliku.endsWith(".mp4")){
            return new OdtwarzaczMP4();
        }
        else if (nazwaPliku.endsWith(".avi")){
            return new OdtwarzaczAVI();
        }
        else return null;
    }
}