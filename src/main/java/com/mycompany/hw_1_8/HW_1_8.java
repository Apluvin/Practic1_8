/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hw_1_8;
import java.util.Scanner;

/**
 *
 * @author Alexandr Balkovskii
 */
public class HW_1_8 {
    
    public static void main(String[] args) {
        System.out.println("Балковский Александр, РИБО-02-22, вариант 2");
        PhoneList phoneList = new PhoneList();

        // Изначальный список телефонов
        TelephoneInfo phone1 = new TelephoneInfo("Samsung Galaxy S 20", "SGS20B55", "blue", true);
        TelephoneInfo phone2 = new TelephoneInfo("iPhone 12 Pro Max", "IP12PM77", "black", true);
        TelephoneInfo phone3 = new TelephoneInfo("VEF TA-68","USSR124578","white",false);
        phoneList.addPhone(phone1);
        phoneList.addPhone(phone2);
        phoneList.addPhone(phone3);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие: ");
            System.out.println("1) Добавить телефон");
            System.out.println("2) Удалить телефон по серийному номеру");
            System.out.println("3) Очистить список телефонов");
            System.out.println("4) Показать список телефонов");
            System.out.println("5) Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Введите модель телефона:");
                    String model = scanner.nextLine();
                    System.out.println("Введите серийный номер:");
                    String serialNumber = scanner.nextLine();
                    System.out.println("Введите цвет:");
                    String color = scanner.nextLine();
                    System.out.println("Это мобильный телефон? (true/false):");
                    boolean isMobile = scanner.nextBoolean();
                    scanner.nextLine();
                    TelephoneInfo newPhone = new TelephoneInfo(model, serialNumber, color, isMobile);
                    phoneList.addPhone(newPhone);
                    break;
                case 2:
                    System.out.println("Введите серийный номер телефона для удаления:");
                    String serialNumToRemove = scanner.nextLine();
                    phoneList.removePhoneBySerialNumber(serialNumToRemove);
                    break;
                case 3:
                    phoneList.removeAllPhones();
                    break;
                case 4:
                    phoneList.displayPhoneList();
                    break;
                case 5:
                    System.out.println("Программа завершена.");
                    System.exit(0);
                default:
                    System.out.println("Неверная команда. Попробуйте еще раз.");
            }
        }
    }
}