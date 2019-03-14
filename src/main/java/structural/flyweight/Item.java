package structural.flyweight;

//Instances of Item will be the Flyweights

// class is immutable (no setters). Name can be set only by constructor

class Item {
    private final String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
