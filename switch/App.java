public class App {
    public static void main(String[] args) throws Exception {

        String today = "Monday";

        switch (today) {
            case "monday":
                System.out.println("I'll go to school");
                break;
            case "tuesday":
                System.out.println("I have a virtual class");
                break;
            case "wednesday":
                System.out.println("Free time to clean my room!");
                break;
            case "thursday":
                System.out.println("virtual to computing class");
                break;
            case "friday":
                System.out.println("bebe time");
                break;
            case "Saturday":
                System.out.println("Pe class puro exercise");
                break;
            case "Sunday":
                System.out.println("baksetball pustahan");
                break;
            default:
                System.out.println("incorrect day");
                break;
        }

    }
}
