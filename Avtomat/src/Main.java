//Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//        Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
//        В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
//        Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре
public class Main {
    public static void main(String[] args) {
        Drink hotDrink1 = new Drink("americano", 2);
        Drink hotDrink2 = new Drink("Latte", 1);
        System.out.println(hotDrink1);
        System.out.println(hotDrink2);

        Drink tea1 = new Drink("greentea",2);
        System.out.println(tea1);

    }
}
