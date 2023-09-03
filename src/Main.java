import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Cat cat1 = new Cat("Barsik", 5, false);
        Cat cat2 = new Cat("Knopa", 10, false);
        Cat cat3 = new Cat("Bagira", 105, false);
        Cat cat4 = new Cat("Tigrillo", 120, false);
        Cat cat5 = new Cat("Pushok", 20, false);

        Cat[] squad = {cat1, cat2, cat3, cat4, cat5};

        Plate plate = new Plate(100);

        for (Cat cats: squad) {
            if (plate.getFood() >= cats.getAppetite()) {
                System.out.println("Аппетит нашего котейки: " + cats.getAppetite());
                plate.info();
                cats.setSatiety(true);
                System.out.println("Сытость кота: " + cats.isSatiety());
                cats.eat();
                plate.setFood(plate.getFood() - cats.getAppetite());

                System.out.println("--------------------------");
            }
            else {
                System.out.println("Аппетит нашего котейки: " + cats.getAppetite());
                plate.info();
                cats.notEnough();

                while (true) {
                    System.out.println("Хотите подсыпать корма обжорке? Да/Нет");
                    String answer = scan.next();
                    if (answer.equals("Да")) {
                        System.out.println("Введите количество дополнительного корма: ");
                        int addFoodForCat = scan.nextInt();
                        plate.addFood(addFoodForCat);
                        if (plate.getFood() >= cats.getAppetite()){
                            cats.setSatiety(true);
                            cats.eat();
                            plate.setFood(plate.getFood() - cats.getAppetite());
                            break;
                        }
                        else {
                            System.out.println("Зверюга все еще голодна");
                        }
                        plate.info();
                    } else if (answer.equals("Нет")) {
                        System.out.println("Правильно, пусть худеет");
                        break;
                    } else {
                        System.out.println("Правильно, пусть худеет");
                        break;
                    }
                }

                System.out.println("--------------------------");
            }
        }

        for (Cat cat: squad) {
            System.out.println("Cытость кота " + cat.getName() + ": " + cat.isSatiety());
        }
    }
}