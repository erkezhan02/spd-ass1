public class Main {

    public static void main(String[] args) {
        User user = new User("Yerkezhan", "yerkezhan@example.com");
        EmailValidator validator = new EmailValidator();

        if (validator.isValid(user.getEmail())) {
            System.out.println(user.getName() + "'s email is valid.");
        } else {
            System.out.println(user.getName() + "'s email is invalid.");
        }


        Shape rectangle = new Rectangle(5, 3);
        Shape circle = new Circle(4);
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Circle area: " + circle.area());



        Bird sparrow = new Sparrow();
        ((Flyable) sparrow).fly();
        Bird penguin = new Penguin();
        penguin.eat();


        Workable humanWorker = new HumanWorker();
        Workable robotWorker = new RobotWorker();
        humanWorker.work();
        ((Eatable) humanWorker).eat();
        robotWorker.work();

    }
}
