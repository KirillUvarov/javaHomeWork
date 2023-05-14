package Final_HW_java.ToyStore;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Toy toy1 = new Toy(0, "Doll", 25);
        Toy toy2 = new Toy(1, "Hot road", 40);
        Toy toy3 = new Toy(2, "Transformer", 3);
        Toy toy4 = new Toy(3, "Lego", 65);

        List<Toy> toys = new ArrayList<Toy>();
        toys.add(toy1);
        toys.add(toy2);
        toys.add(toy3);
        toys.add(toy4);

        for (Toy toy : toys) {
            System.out.println(toy);
        }


        ToyStore toyStore = new ToyStore(toys);
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();

    }
}
