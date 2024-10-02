package source.com.enumTest.pro;

public class RestaurantMenu {
    public static void main(String[] args) {
        for (MenuItem item : MenuItem.values()) {
            item.printInfo();
        }

        // 输出所有饮料大小
        System.out.println("Available drink sizes:");
        for (Size size : Size.values()) {
            System.out.println(size + " (" + size.getMilliliters() + " ml)");
        }
    }
}
