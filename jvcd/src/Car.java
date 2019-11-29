public class Car {
    public static void main(String[] args) {

        CarInfo myCar = new CarInfo();
        myCar.Name = "Subaru Ascent";
        myCar.Price = 43867;

        System.out.println(myCar.Name);
        System.out.println(myCar.Price);
        myCar.Vroom();
    }
}