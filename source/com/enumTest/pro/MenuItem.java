package source.com.enumTest.pro;

public enum MenuItem {
    // 每个菜单项都有类型、价格、描述
    PASTA(MenuType.MAIN_COURSE, 12.99, "Delicious Italian pasta with tomato sauce"),
    STEAK(MenuType.MAIN_COURSE, 19.99, "Grilled steak with a side of vegetables"),
    CAESAR_SALAD(MenuType.APPETIZER, 7.99, "Fresh Caesar salad with Parmesan cheese"),
    ICE_CREAM(MenuType.DESSERT, 5.99, "Vanilla ice cream with chocolate syrup"),
    COFFEE(MenuType.DRINK, 3.99, "Freshly brewed coffee", Size.SMALL),
    SODA(MenuType.DRINK, 2.99, "Sparkling soda with ice", Size.MEDIUM);

    private final MenuType type;
    private final double price;
    private final String description;
    private final Size size;

    // 非饮料
    MenuItem(MenuType type, double price, String description) {
        this(type, price,description,null);
    }

    // 饮料
    MenuItem(MenuType type, double price, String description, Size size) {
        this.type = type;
        this.price = price;
        this.description = description;
        this.size = size;
    }

    public MenuType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void printInfo(){
        System.out.println("Item: " + this.name());
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Description: " + description);
        if (size != null) {
            System.out.println("Size: " + size + " (" + size.getMilliliters() + ")");
        }
        System.out.println();
    }
}
