/**
 * Created by aremo on 12/18/2016.
 */
public class ComputerShop {
    public static void main(String[] args) {
        final String appName = "ComputerShop v1.0";
        System.out.println(appName);
        System.out.println("Dostępne laptopy:");
        Laptop lenovo = new Laptop("lenovo", "Y510P","i7 2.40GHz", 8, "2xGF GT 750M");
        Laptop Toshiba = new Laptop("Toshiba","Pro A100", "i2 1.66GHz", 4, "ATI Radeon X1600");

        lenovo.printInfo();
        Toshiba.printInfo();
    }
}
