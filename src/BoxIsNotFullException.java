public class BoxIsNotFullException extends RuntimeException {
    public BoxIsNotFullException(int quantity) {
        super("Коробка не полная, добавьте в неё ещё " + quantity + " предметов");
    }
}
