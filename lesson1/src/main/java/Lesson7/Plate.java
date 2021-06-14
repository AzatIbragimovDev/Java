package Lesson7;

class Plate {
    private int food;
    private final int maxFood;
    public Plate(int maxFood, int food) {
        this.food = food;
        this.maxFood = maxFood;
    }
    public boolean decreaseFood(int appetite) {
        if(food >= appetite ) {
            food -= appetite;
            return true;
        } else if (food < appetite) {
            System.out.println("Еды в тарелке недостаточно!");
            increaseFoodToMax();
            System.out.println("Досыпали еды в тарелку: " +food);
            food -=appetite;
        } else {
            System.out.println("Коту не удалось поесть, еды не достаточно!");
        }
        return false;

    }
    public void increaseFoodToMax() {

        if(food < maxFood) {
            food = maxFood;
        }
    }
    public void info() {
        System.out.println("В тарелке осталось еды: " + food);
    }


}