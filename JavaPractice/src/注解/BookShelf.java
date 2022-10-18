package 注解;

public class BookShelf {
    @Book(name="围城",author = "钱钟书",price = 88.0)
    public void showBook(){}

    public static void main(String[] args) {
        BookShelf bs = new BookShelf();
        bs.showBook();
    }
}
