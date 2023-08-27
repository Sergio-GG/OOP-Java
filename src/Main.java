import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите бренд шоколада (Коркунов, Бабаевский, Snickers): ");
        String chocoBrand = scan.nextLine();
        System.out.println("Введите калорийность шоколада (200, 150, 300): ");
        int chocoCalories = scan.nextInt();


        Product product1 = new Product();
        //product1.name = "Product1";
        //product1.brand = "Brand1";
        //product1.price = 200;
        //System.out.println(product1.displayInfo());

        Product product2 = new Product(null, "Brand2", 300);
        //System.out.println(product2.displayInfo());
        product2.setPrice(400);
        double price = product2.getPrice();
        //System.out.println(price);
        //System.out.println(product2.displayInfo());

        Product product3 = new Product("Product3");
        //product3.price = -100;
        //product3.name = "A";
        //System.out.println(product3.displayInfo());

        Product bottleOfMilk1 =
                new BottleOfMilk("Бутылка1", "ООО Молоко", 350, 1.5, 15);
        //System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfWater1 =
                new BottleOfWater("Бутылка c водой", "ООО Источник", 350, 1);
        //System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfWater2 =
                new BottleOfWater("Бутылка c водой", "ООО Источник", 150, 1.5);
        Product bottleOfWater3 =
                new BottleOfWater("Бутылка c водой", "ООО Источник", 250, 2);


        Product chocolate1 = new Chocolate("Шоколад", "Коркунов", 300, 200);
        Product chocolate2 = new Chocolate("Шоколад", "Бабаевский", 350, 150);
        Product chocolate3 = new Chocolate("Шоколад", "Snickers", 300, 300);


        List<Product> products = new ArrayList<>();
        products.add(bottleOfMilk1);
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);
        products.add(chocolate1);
        products.add(chocolate2);
        products.add(chocolate3);


        VendingMachine vendingMachine = new VendingMachine(products);
        // BottleOfWater bottleOfWater = vendingMachine.getBottleOfWater("Бутылка c водой", 1.5);
        // if (bottleOfWater != null){
        //     System.out.println("Вы получили: ");
        //     System.out.println(bottleOfWater.displayInfo());
        // }
        // else {
        //     System.out.println("Такой бутылки с водой нет в автомате.");
        // }

        Chocolate choco = vendingMachine.getChocolate(chocoBrand, chocoCalories);
        if (choco != null) {
            System.out.println("Вы получили: ");
            System.out.println(choco.displayInfo());
        } else {
            System.out.println("Такой шоколадки нет в автомате.");
        }
    }
}