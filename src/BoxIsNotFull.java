public class BoxIsNotFull extends RuntimeException {
    public BoxIsNotFull(int quantity) {
        super("Коробка не полная, добавьте в неё ещё " + quantity + " предметов");
    }
}
