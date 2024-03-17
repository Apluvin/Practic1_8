/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hw_1_8;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexandr Balkovskii
 */
public class PhoneList {
    private List<TelephoneInfo> phoneList = new ArrayList<>();

    public void addPhone(TelephoneInfo phone) {
        if (!phoneList.stream().anyMatch(p -> p.getSerialNumber().equals(phone.getSerialNumber()))) {
            phoneList.add(phone);
            System.out.println("Телефонный аппарат добавлен: " + phone);
        } else {
            System.out.println("Телефон с таким серийным номером уже существует.");
        }
    }

    public void removePhoneBySerialNumber(String serialNumber) {
        phoneList.removeIf(p -> p.getSerialNumber().equals(serialNumber));
        System.out.println("Телефонный аппарат с серийным номером " + serialNumber + " удален.");
    }

    public void removeAllPhones() {
        phoneList.clear();
        System.out.println("Все телефонные аппараты удалены.");
    }

    public void displayPhoneList() {
        System.out.println("Текущий список телефонов:");
        if (phoneList.size()==0){
            System.out.println("Телефоны в списке отсутствуют");
        }else{
        for (TelephoneInfo phone : phoneList) {
            System.out.println(phone);
        }
      }
    }
}
