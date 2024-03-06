public class Habitat {
    // atributos
    private int temperatura;
    private double humedad;
    private boolean limpieza;
    private String[] animales;

    // setters y getters
    public int getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    public double getHumedad() {
        return humedad;
    }
    public void setHumedad(double humedad) {
        this.humedad = humedad;
    }
    public boolean isLimpieza() {
        return limpieza;
    }
    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }
    public String[] getAnimales() {
        return animales;
    }
    public void setAnimales(String[] animales) {
        this.animales = animales;
    }
}
