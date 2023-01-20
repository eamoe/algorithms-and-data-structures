package algorithms.lesson2;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.jetbrains.annotations.NotNull;

public class Laptop implements Comparable<Laptop> {

    private int id;
    private double price;
    private int ram;
    private Pair<Integer, String> brand;

    public Laptop(int id,
                  Pair<Integer, String> brand,
                  double price,
                  int ram) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.ram = ram;
    }

    public Laptop(Pair<Integer, String> brand,
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

    public Pair<Integer, String> getBrand() {
        return brand;
    }

    public void setBrand(Pair<Integer, String> brand) {
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
        return new EqualsBuilder()
                .append(price, laptop.price)
                .append(ram, laptop.ram)
                .append(brand.getKey(), laptop.brand.getKey())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(price)
                .append(ram)
                .append(brand.getKey())
                .toHashCode();
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
        return new CompareToBuilder()
                .append(this.price, o.price)
                .append(this.ram, o.ram)
                .append(this.brand.getKey(), o.brand.getKey())
                .toComparison();
    }

}