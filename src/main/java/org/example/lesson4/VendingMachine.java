package org.example.lesson4;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine <T> {
    // Добавить в список продуктов
    // Получать и удалять продукт
    // Должен быть отдельный класс для всех

    private List<T> products= new ArrayList<>();
    public void addProducts(T product) {
        products.add(product);
    }
    public List<T> getAll() {
        return products;
    }
}
