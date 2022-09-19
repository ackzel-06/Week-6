public class App {
    public static void main(String[] args) throws Exception {

        // Conditional Structure
        boolean suspendend = false;
        boolean holiday = true;

        if (suspendend) {
            System.out.println("i will stay at my room");
        }
        else if (holiday){
            System.out.println("I have freetime to watch movie");
        }
        else {
            // Step 1
            rideTricycle();

            // Step 2
            rideJeep();

            // Step 5
            walk();
        }

    }
    static void rideTricycle() {
        System.out.println("Ride tricycle to Roosvelt");
        System.out.println("Exit tricycle at Roosvelt ");

    
    }
    static void rideJeep() {
        System.out.println("Ride jeep along Roosvelt");
        System.out.println("Exit jeep along Lacson avenue");
    }

    static void walk() {
        System.out.println("Walk for 10 mins");
    }
}
