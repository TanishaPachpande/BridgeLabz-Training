package bagnball;


public class Ball implements Storable {

    private String id;
    private String color;
    private String size;

    // Constructor
    public Ball(String id, String color, String size) {
        this.id = id;
        this.color = color;
        this.size = size;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Ball [ID=" + id + ", Color=" + color + ", Size=" + size + "]";
    }
}

