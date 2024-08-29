package poly;

public class DriverEx {
    public static void main(String[] args) {
        Driver driver = new Driver();

        // 무엇을 운전하고 싶은지
        driver.drive(new Bus());
        driver.drive(new Taxi());
        driver.drive(new Vehicle());
    }

}
