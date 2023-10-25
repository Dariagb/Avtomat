public class HotDrinkMachine implements VendingMachine {
    private String name;
    private int volume;
    private int temperature;

    public HotDrinkMachine(String name, int volume, int temperature) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
    }

    public HotDrinkMachine(int name, int volume, int temperature) {
        this(String.valueOf(name), volume, temperature);
    }

    public HotDrinkMachine getProduct(String name, int volume, int temperature) {
        if (this.name.equals(name) && this.volume == volume && this.temperature == temperature) {
            return this;
        }
        return null;
    }

    public HotDrinkMachine getProduct(int name, int volume, int temperature) {
        return getProduct(String.valueOf(name), volume, temperature);
    }
}

