import java.util.Scanner;
import java.util.Random;
public class TextBasedGame {
    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        return scanner.nextLine();
    }
    public static int encounterGreninja() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have encountered a Greninja, type 1 to deploy Moltres, type 2 to deploy Venasaur");
        return scanner.nextInt();
    }
    public static int venasaurEffective() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Venasaur is super effective... Type 1 to enable Solar Beam, type 2 to use Vine Whip!");
        return scanner.nextInt();
    }
    public static int venasaurVineWhip() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Venasaur used Vine Whip and deals a significant amount of damage... Type 1 to finish off Greninja with Sludge Bomb");
        return scanner.nextInt();
    }
    public static int encounterPikachu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have encountered a Pikachu, type 1 to deploy Groudon, type 2 to deploy Articuno");
        return scanner.nextInt();
    }
    public static int deployGroudon() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have deployed Groudon... Type 1 to use Mud Shot, type 2 to use Dragon Tail");
        return scanner.nextInt();
    }
    public static String chargeAttack() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type \"Charge\" if you want a chance to charge up the attack, type \"No\" to not charge it!");
        return scanner.nextLine();
    }
    public static int articunoNeffective() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have deployed Articuno and it is not very effective... type 1 to deploy Gyarados, type 2 to deploy Groudon");
        return scanner.nextInt();
    }
    public static int secondGroudon() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have chosen to deploy Groudon and it is super effective... Type 1 to use Mud Shot, type 2 to use Dragon Tail!");
        return scanner.nextInt();
    }

    public static int lastGroudon() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Groudon used Dragon Tail, it does little to no damage... Type 1 to use Mud Shot, type 2 to use Precipipe Blade");
        return scanner.nextInt();
    }
        public static void main(String[] args) {
            String userName = getName();
            System.out.println("Hello, " + userName + "!");
            System.out.println("You are currently against Ash Ketchum");
            System.out.println("On the right there is a Greninja and on the left there is a Pikachu, type East to go right, and West for left: ");
            Scanner scanner = new Scanner(System.in);
            String start = scanner.nextLine();
            if (start.equals("East")) {
                int second = encounterGreninja();
                if (second == 1) {
                    System.out.println("Moltres is not very effective, Moltres faints, you lose!");
                } else if (second == 2) {
                    int fourth = venasaurEffective();
                    if (fourth == 1) {
                        System.out.println("Venasaur used Solar Beam...  You Win!");
                    } else if (fourth == 2) {
                        int fifth = venasaurVineWhip();
                        if (fifth == 1) {
                            System.out.println("Venasaur used sludge bomb... You Win!");
                        } else {
                            System.out.println("Invalid Input");
                        }
                    } else {
                        System.out.println("Invalid Input");
                    }
                } else {
                    System.out.println("Invalid Input");
                }
            } else if (start.equals("West")) {
                int second1 = encounterPikachu();
                if (second1 == 1) {
                    int third1 = deployGroudon();
                    String third2 = chargeAttack();
                    Random random = new Random();
                    int randomNumber = random.nextInt(100) + 1;
                    int percentage = randomNumber/2;
                    if (third1 == 1 && third2.equals("Charge") && percentage >= 50) {
                        System.out.println("Groudon used Charged Mud Shot... You Win!");
                    } else if (third1 == 2 && third2.equals("Charge") && percentage >= 25) {
                        System.out.println("Groudon used Charged Dragon Tail... You Win!");
                    } else if (third1 == 1 && third2.equals("Charge") && percentage < 50) {
                        System.out.println("Groudon used Mud Shot and barely defeats Pikachu... You Win!");
                    } else if (third1 == 2 && third2.equals("Charge") && percentage < 50) {
                        System.out.println("Groudon used Dragon Tail and barely defeats Pikachu... You Win!");
                    } else if (third1 == 1 && third2.equals("No")) {
                        System.out.println("Groudon used Dragon Tail... You Win!");
                    } else if (third1 == 2 && third2.equals("No")) {
                        System.out.println("Groudon used Dragon Tail, it does little to no damage, and Pikachu uses Wild Charge... You Lose!");
                    } else {
                        System.out.println("Invalid Input");
                    }
                } else if (second1 == 2) {
                    int third3 = articunoNeffective();
                    if (third3 == 1) {
                        System.out.println("You have deployed Gyarados and it is not very effective... ");
                        Random random = new Random();
                        int randomNumber = random.nextInt(100) - 89;
                        int percentage = randomNumber%2;
                        if (percentage == 0) {
                            System.out.println("Pikachu uses Wild Charge, and Gyarados faints... You Lose!");
                        } else {
                            System.out.println("Pikachu uses Discharge, and Gyarados faints... You Lose!");
                        }
                    } else if (third3 == 2) {
                        int fourth = secondGroudon();
                        if (fourth == 1) {
                            System.out.println("Groudon used Mud Shot... You Win!");
                        } else if (fourth == 2) {
                            int fourth2 = lastGroudon();
                            if (fourth2 == 1) {
                                System.out.println("Groudon used Dragon Tail, it does little to no damage, and Pikachu uses Wild Charge... You Lose!");
                            } else if (fourth2 == 2) {
                                System.out.println("Groudon used Precipipe Blade... You Win!");
                            } else {
                                System.out.println("Invalid Input");
                            }
                        } else {
                            System.out.println("Invalid Input");
                        }

                    } else {
                        System.out.println("Invalid Input");
                    }
                } else {
                    System.out.println("Invalid Input");
                }
            } else {
                System.out.println("Invalid Input");
            }
        }
    }


