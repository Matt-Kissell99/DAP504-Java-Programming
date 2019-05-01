public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Car carObj = new Car("Orange", 4);
        Car carObj2 = new Car("red", 5);

        System.out.println("The colour of you car is:" + carObj.colour);
        System.out.println("The number of wheels for your car is:" + carObj.wheels);
        System.out.println("The number of wheels for your car is:" + carObj2.wheels);


    }
}
