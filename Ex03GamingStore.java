import java.util.Scanner;

public class Ex03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentMoney = Double.parseDouble(scanner.nextLine());
        String gameName = scanner.nextLine();
        double totalSpend = 0.00;


        while (!gameName.equals("Game Time")) {
            String currentGameName = "";
            double gamePrice = 0.00;
            switch (gameName) {
                case "OutFall 4":
                    currentGameName = "OutFall 4";
                    gamePrice = 39.99;
                    break;
                case "CS: OG":
                    currentGameName = "CS: OG";
                    gamePrice = 15.99;
                    break;
                case "Zplinter Zell":
                    currentGameName = "Zplinter Zell";
                    gamePrice = 19.99;
                    break;
                case "Honored 2":
                    currentGameName = "Honored 2";
                    gamePrice = 59.99;
                    break;
                case "RoverWatch":
                    currentGameName = "RoverWatch";
                    gamePrice = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    currentGameName = "RoverWatch Origins Edition";
                    gamePrice = 39.99;
                    break;
                default:
                    System.out.println("Not Found");
                    gameName = scanner.nextLine();
                    continue;
            }
            if (currentMoney >= gamePrice ) {
                System.out.printf("Bought %s\n", currentGameName);
                totalSpend += gamePrice;
                currentMoney -= gamePrice;
            } else {
                System.out.println("Too Expensive");
                gameName = scanner.nextLine();
                continue;
            }
            if (currentMoney == 0) {
                System.out.println("Out of money!");
                System.exit(0);
            }
            gameName = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpend, currentMoney);
    }
}
