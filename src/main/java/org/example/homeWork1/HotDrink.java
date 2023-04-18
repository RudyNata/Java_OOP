package org.example.homeWork1;

public class HotDrink extends Drink {
    private int temperature;

    HotDrink (String name, int volume, int temperature) {
        super.name = name;
        super.volume = volume;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        super.name = name;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        super.volume = volume;
    }
    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return String.format("Drink name: %s, Volume: %d, Temperature: %d", name, volume, temperature);
    }
}
