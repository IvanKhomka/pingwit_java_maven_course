package com.pingwit_java_course.part24.homework.task4;

import java.util.Scanner;

public class FlowerShopMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlowerShop shop = new FlowerShop();
        DiscountService discountService = new DiscountService();

        while (true) {
            shop.showCatalog();

            System.out.println("\nВыберите номер позиции или введите 'exit' для выхода:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Спасибо за визит! До свидания.");
                System.exit(0);
            }

            Integer choice = parseChoice(input);
            if (choice == null || !shop.isValidProductId(choice)) {
                System.out.println("Такой позиции нет или она недоступна. Попробуйте ещё раз.");
                continue;
            }

            Product product = shop.getProductById(choice);
            double price = product.getPrice();

            System.out.println("Сегодня у вас день рождения? (да/нет): ");
            String birthdayInput = scanner.nextLine();
            boolean isBirthday = birthdayInput.equalsIgnoreCase("да");

            if (discountService.isEligibleForDiscount(isBirthday)) {
                System.out.println("В честь праздника мы дарим вам скидку 10% на весь заказ!");
                price = discountService.applyDiscount(price);
            }

            System.out.println("Введите, пожалуйста, адрес доставки:");
            String address = scanner.nextLine();

            Order order = new Order(product, address, price);
            order.printConfirmation();

            System.out.println("Спасибо за покупку! До свидания.");
            System.exit(0);
        }
    }

    private static Integer parseChoice(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода. Пожалуйста, введите номер позиции.");
            return null;
        }
    }
}