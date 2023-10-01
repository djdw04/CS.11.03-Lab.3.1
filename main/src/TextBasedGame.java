public class TextBasedGame {
    public static void main(String[] args) {
        playGame();
    }
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You find yourself in a dark cave. Start the game by typing North.");

        String pathChoice = scanner.nextLine();

        if (pathChoice.equalsIgnoreCase("North")) {
            System.out.println("You've walked forward, you've encountered a route that leads you 3 ways.");
            System.out.println("Which path do you take?");
            System.out.println("North");
            System.out.println("East");
            System.out.print("West");

            String actionChoice = scanner.nextLine();
            scanner.nextLine();

            if (actionChoice == "North") {
                System.out.println("You have been eaten by a crocodile");
                System.out.println("Game over!");
            } else {
                System.out.println("Invalid choice. Game over!");
            }

    }
}