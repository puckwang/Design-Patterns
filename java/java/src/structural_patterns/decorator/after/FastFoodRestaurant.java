package structural_patterns.decorator.after;

interface Food {
    String getContent();
}

abstract class Combo implements Food {
    Food food;

    Combo(Food food) {
        this.food = food;
    }
}

class Hamburger implements Food {
    @Override
    public String getContent() {
        return "漢堡";
    }
}

class FriedChicken implements Food {
    @Override
    public String getContent() {
        return "炸雞";
    }
}

class ComboOne extends Combo {
    ComboOne(Food food) {
        super(food);
    }

    @Override
    public String getContent() {
        return String.format("%s + %s", food.getContent(), "薯條");
    }
}

class ComboTwo extends Combo {
    ComboTwo(Food food) {
        super(food);
    }

    @Override
    public String getContent() {
        return String.format("%s + %s", food.getContent(), "沙拉");
    }
}

public class FastFoodRestaurant {
    public static void main(String args[]) {
        Food food1 = new Hamburger();
        Food food2 = new ComboOne(new Hamburger());
        Food food3 = new ComboTwo(new Hamburger());
        Food food4 = new ComboOne(new Hamburger());
        Food food5 = new ComboTwo(new FriedChicken());
        Food food6 = new ComboOne(new ComboTwo(new Hamburger()));

        System.out.println(food1.getContent());
        System.out.println(food2.getContent());
        System.out.println(food3.getContent());
        System.out.println(food4.getContent());
        System.out.println(food5.getContent());
        System.out.println(food6.getContent());
    }
}
