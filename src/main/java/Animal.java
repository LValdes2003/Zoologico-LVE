public class Animal {
    //constructor
    public Animal(String dieta, String habitat) {
        this.dieta = dieta;
        this.habitat = habitat;
    }

    //atributos
    private String dieta;
    private String habitat;
    private String[] alimentacion;
    private String[] salud;
    public String[] comportamiento;


    //setters y getters
    public String getDieta() {
        return dieta;
    }
    public void setDieta(String dieta) {
        this.dieta = dieta;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public String[] getAlimentacion() {
        return alimentacion;
    }
    public String[] getSalud() {
        return salud;
    }
    public String[] getComportamiento() {
        return comportamiento;
    }

    //metodos
    public void registrarAlimentacion(String diaDeAlimentacion, String comida) {
        alimentacion[alimentacion.length] = diaDeAlimentacion + " " + comida;
    }
    public void registrarSalud(String diaDeSalud, String estadoDeSalud) {
        salud[salud.length] = diaDeSalud + " " + estadoDeSalud;
    }
     public void registrarComportamiento(String diaDeComportamiento, String estadoDeComportamiento) {
          this.comportamiento[this.comportamiento.length] = diaDeComportamiento + " " + estadoDeComportamiento;
     }
}
