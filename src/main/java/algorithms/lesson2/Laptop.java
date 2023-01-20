package algorithms.lesson2;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Laptop implements Comparable<Laptop> {

    private int id;
    private double price;
    private int ram;
    private String brand;

    public Laptop(int id,
                  String brand,
                  double price,
                  int ram) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.ram = ram;
    }

    public Laptop(String brand,
                  double price,
                  int ram) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return brand.equals(laptop.brand)
                && price == laptop.price
                && ram == laptop.ram;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, price, ram);
    }

    @Override
    public String toString() {
        return '\n' + "Laptop ".toUpperCase() +
                "ID=" + id + "; " +
                "Brand='" + brand + '\'' + "; " +
                "Price='" + price + '\'' + "; " +
                "Ram='" + ram + '\'';
    }

    @Override
    public int compareTo(@NotNull Laptop o) {
        if (this.price >= o.price
                && (this.brand.equalsIgnoreCase(o.brand) || o.brand.isEmpty())
                && this.ram >= o.ram) {

            return 1;
        }
        else {
            return -1;
        }

    }
}