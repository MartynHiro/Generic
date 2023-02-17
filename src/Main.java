public class Main {
    public static void main(String[] args) {
        //проверка на String и заполненную коробку
        MagicBox<String> names = new MagicBox<>(2);
        names.add("Sergey");
        names.add("Nadya");
        System.out.println(names.pick() + "\n ----------------------------");

        //проверка на int и незаполненную коробку
        MagicBox<Integer> numbers = new MagicBox<>(6);
        numbers.add(100);
        numbers.pick();
        System.out.println(names.pick());
    }
}