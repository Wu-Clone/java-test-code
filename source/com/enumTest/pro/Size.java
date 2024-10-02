package source.com.enumTest.pro;

public enum Size {
    SMALL(200), MEDIUM(400), LARGE(600);
    private final int milliliters;

    private Size(int milliliters) {
        this.milliliters = milliliters;
    }

    public int getMilliliters() {
        return milliliters;
    }
}
