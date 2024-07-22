package SE26Enums;

public enum Continentes {
    
    AFRICA(50),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);

    private final int paises;

    Continentes(int paises){
        this.paises = paises;
    }

    //
    public int getPaises(){
        return this.paises;
    }
}
