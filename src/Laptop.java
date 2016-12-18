/**
 * Created by aremo on 12/18/2016.
 */
class Laptop {
    String producer;
    String model;
    String cpu;
    double ram;
    String graphic;

Laptop(String laptopProducer, String laptopModel, String laptopCpu, double laptopRam, String laptopGraphic) {

    producer = laptopProducer;
    model = laptopModel;
    cpu = laptopCpu;
    ram = laptopRam;
    graphic = laptopGraphic;
}

    void printInfo() {
        String info = "";
        info = info + producer+" ";
        info = info + model+", ";
        info = info+ "procesor: " + cpu + ", " ;
        info = info+ "pamięć ram: " + ram + "GB, " ;
        info = info+ "karta graficzna: " + graphic;

        System.out.println(info);
    }

}
