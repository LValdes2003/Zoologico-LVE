public class Mamifero extends Animal{
    //constructor
    public Mamifero(String dieta, String habitat) {
        super(dieta, habitat);
    }

    //atributos
    private String tipoPelo;
    private int tamano;

    //setters y getters
    public String getTipoPelo() {
        return tipoPelo;
    }
    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }
    public int getTamano() {
        return tamano;
    }
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
}
