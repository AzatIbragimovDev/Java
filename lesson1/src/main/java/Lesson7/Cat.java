package Lesson7;

class Cat {

    private String name;
    private int appetite;
    private boolean satiety = false; //кот создается голодным
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

    }

    public int getAppetite() {
        return appetite;
    }

    public boolean getSatiety () {
        return satiety;
    }
    public String getName() {
        return name;
    }
    public void eat(Plate p) {
        satiety = p.decreaseFood(appetite);

    }
}