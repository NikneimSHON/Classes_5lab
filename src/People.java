public class People {
    public static void main(String[] args) {
        Phone phone1 = new Phone("000000000", "Samsung", 0.3);
        Phone phone2 = new Phone("111111111", "iPhone", 0.9);
        Phone phone3 = new Phone("999999999", "Nokia", 0.65);

        System.out.println("Phone 1:");
        System.out.println("Number: " + phone1.getNumber());
        System.out.println("Model: " + phone1.getModel());
        System.out.println("Weight: " + phone1.getWeight());

        System.out.println("\nPhone 2:");
        System.out.println("Number: " + phone2.getNumber());
        System.out.println("Model: " + phone2.getModel());
        System.out.println("Weight: " + phone2.getWeight());

        System.out.println("\nPhone 3:");
        System.out.println("Number: " + phone3.getNumber());
        System.out.println("Model: " + phone3.getModel());
        System.out.println("Weight: " + phone3.getWeight());

        phone1.receiveCall("John Doe");
        phone2.receiveCall("Jane Smith", "987654321");

        phone3.sendMessage("111111111", "222222222", "333333333");

    }
}