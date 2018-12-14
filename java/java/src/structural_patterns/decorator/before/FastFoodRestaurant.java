package structural_patterns.decorator.before;

class Hamburger {
    public String getContent() {
        return "漢堡";
    }
}

class FriedChicken {
    public String getContent() {
        return "炸雞";
    }
}

class ComboOne extends Hamburger {
    public String getContent() {
        return super.getContent() + " + 薯條";
    }
}

class ComboTwo extends Hamburger {
    public String getContent() {
        return String.format("%s + %s", super.getContent(), "沙拉");
    }
}

class ComboThree extends FriedChicken {
    public String getContent() {
        return String.format("%s + %s", super.getContent(), "薯條");
    }
}

class ComboFour extends FriedChicken {
    public String getContent() {
        return String.format("%s + %s", super.getContent(), "沙拉");
    }
}

class ComboFire extends FriedChicken {
    public String getContent() {
        return String.format("%s + %s + %s", super.getContent(), "沙拉", "薯條");
    }
}

public class FastFoodRestaurant {
    public static void main(String args[]) {
        Hamburger hamburger = new Hamburger();
        ComboOne comboOne = new ComboOne();
        ComboTwo comboTwo = new ComboTwo();
        ComboThree comboThree = new ComboThree();
        ComboFour comboFour = new ComboFour();
        ComboFire comboFire = new ComboFire();

        System.out.println(hamburger.getContent());
        System.out.println(comboOne.getContent());
        System.out.println(comboTwo.getContent());
        System.out.println(comboThree.getContent());
        System.out.println(comboFour.getContent());
        System.out.println(comboFire.getContent());
    }
}
