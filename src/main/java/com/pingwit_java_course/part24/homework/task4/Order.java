package com.pingwit_java_course.part24.homework.task4;

public record Order(Product product, String deliveryAddress, double finalPrice) {
    public void printConfirmation() {
        System.out.println("\nСпасибо за ваш заказ на сумму: " + finalPrice + " руб.");
        System.out.println("Ваш заказ: " + product.getName());
        System.out.println("Адрес доставки: " + deliveryAddress);
        System.out.println("Курьер свяжется с вами в ближайшее время.");
    }
}