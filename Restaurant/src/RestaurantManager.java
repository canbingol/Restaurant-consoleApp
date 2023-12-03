public class RestaurantManager {
    final String name = " Canın yeri";
    public int table;
    public int carPark;
    public int employees;
    static int stock;
    private final int restoranAlanı = 260;

    public RestaurantManager(int table, int carPark, int employees, int stock) {
        super();
        this.table = table;
        this.carPark = carPark;
        this.employees = employees;
        this.stock = stock;
    }

    public RestaurantManager() {

    }

    private void RestaurantInfo() {
        System.out.println("Restourant Name: " + name);
        System.out.println("Number of Table: " + table);
        System.out.println("Çalışan Sayısı: " + employees);
        System.out.println("parking capacity: " + carPark);
    }



}
