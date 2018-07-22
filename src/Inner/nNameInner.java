package Inner;

/**
 * Created by wanyu on 2018/3/12.
 */
public class nNameInner {
    public static void main(String[] args) {
        Driver driver=new Driver();
        driver.User(new Car() {
            @Override
            public void drive() {
                System.out.println("开车了");
            }
        });
    }
}
class Driver{
    public void User(Car car){
        car.drive();
    }
}
class Bus implements Car{

    @Override
    public void drive() {

    }
}
