import java.util.Random;

public class MagicBox<T> {
    T[] items;

    public MagicBox(int size) {
        this.items = (T[]) new Object[size];
    }

    public boolean add(T item) {      //метод добавления нового итема в коробку
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        System.out.println("В коробке больше нет места!");
        return false;
    }

    public T pick() {   //метод проверяет полная ли коробка, если да, то возвращает случайный элемент из неё
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        int amountEmptyCells = 0;

        for (T item : items) {
            if (item == null) {
                amountEmptyCells += 1;
            }
        }

        if (amountEmptyCells != 0) {
            throw new BoxIsNotFull(amountEmptyCells);
        }
        return items[randomInt];
    }
}
