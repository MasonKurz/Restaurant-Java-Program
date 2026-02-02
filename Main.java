public class Main {
    public static void main(String[] args) {

        Restaurant mcDonalds = new Restaurant();
        Restaurant chipotle = new Restaurant(30, 4.5, 14, 5, "6:00am - 9:00pm");

        System.out.println(chipotle.waitTime);
        System.out.println(chipotle.hoursOpen);
        System.out.println(chipotle.avgPrice);
        System.out.println(chipotle.distance);
        System.out.println(chipotle.hoursOpen);
    }
}
