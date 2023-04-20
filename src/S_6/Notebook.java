package S_6;

public class Notebook {
    public String name; //Наименование
    public int ram; //Оперативная память
    public int hdd; //Жёсткий диск
    public OS os; //Операционная система
    public String colour; //Цвет корпуса
    public int cost; //Стоимость
    private boolean availability;

    public Notebook(String name, int ram, int hdd, OS os, String colour, int cost){ // Описание входных параметров ноутбука
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.colour = colour;
    }

    public boolean availability(boolean param){
        return param;
    } // Характеристика наличия ноутбука в магазине

    public String value (){ // Характеристика ниши ноутбука в соответствии с его стоимостью
        if (cost > 1000) {
            String value = "Top";
        }
        if (cost <= 1000 && cost >= 500){
            String value = "Middle";
        }
        if (cost < 500){
            String value = "Budget";
        }
        return value();
    }

    @Override
    public String toString(){ // Предопределяем метод базового класса
        return String.format("Ноутбук: {name: %s, ram: %d, hdd: %d, os: %s, colour: %s, cost: %d}", name, ram, hdd, os, colour);
    }

    @Override
    public boolean equals(Object obj){ // Проверка на соответствие входных параметров
        if (obj instanceof Notebook)
            return (((Notebook) obj).name.equals(this.name) &&
                    ((Notebook) obj).ram == this.ram &&
                    ((Notebook) obj).hdd == this.hdd &&
                    ((Notebook) obj).colour.equals(this.colour) &&
                    ((Notebook) obj).os.equals(this.os));
        else return false;
    }


}
