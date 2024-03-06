public class Reptil extends Animal {
    // Constructor
    public Reptil(String dieta, String habitat) {
        super(dieta, habitat);
    }

    // Attributes
    private boolean venenoso;
    private String color;

    // Setters and getters
    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
