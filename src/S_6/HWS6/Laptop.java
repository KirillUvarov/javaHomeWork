package S_6.HWS6;

public class Laptop {
    int id;
    int ram;
    int ssd;
    String os;
    String colour;

    public Laptop(int id, int ram, int ssd, String os, String colour){
        this.id = id;
        this.ram = ram;
        this.ssd = ssd;
        this.os = os;
        this.colour = colour;
    }

    public String toString() {
        return String.format("id: %d, ram: %d ГБ, ssd: %d ГБ, OS: %s, color: %s", id, ram, ssd, os, colour);
    }

    public boolean equals(Object o) {
        Laptop t = (Laptop) o;
        return id == t.id;
    }
}
