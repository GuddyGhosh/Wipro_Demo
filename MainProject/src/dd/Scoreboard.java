import java.util.*;

public class Scoreboard {
    
    private HashMap<String, Integer> playerScores;

    public Scoreboard() 
    {
        playerScores = new HashMap<>();
    }

    
    public void addOrUpdatePlayer(String name, int score) 
    {
        playerScores.put(name, score); 
        System.out.println(name + "'s score updated to " + score);
    }

   
    public void displayScores() {
        if (playerScores.isEmpty()) {
            System.out.println("No players in the scoreboard.");
            return;
        }
        System.out.println("\n--- Scoreboard ---");
        for (Map.Entry<String, Integer> entry : playerScores.entrySet()) {
            System.out.println("Player: " + entry.getKey() + ", Score: " + entry.getValue());
        }
    }

    
    public void removePlayer(String name) {
        if (playerScores.containsKey(name)) {
            playerScores.remove(name);
            System.out.println(name + " removed from the scoreboard.");
        } else {
            System.out.println(name + " not found.");
        }
    }

    
    public void getPlayerScore(String name) {
        if (playerScores.containsKey(name)) {
            Integer score = playerScores.get(name); 
            System.out.println(name + "'s score is " + score);
        } else {
            System.out.println(name + " not found.");
        }
    }

   
    public boolean playerExists(String name)
    {
        return playerScores.containsKey(name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scoreboard scoreboard = new Scoreboard();
        int choice;

        do {
            System.out.println("\n--- Scoreboard Menu ---");
            System.out.println("1. Add/Update Player");
            System.out.println("2. Display All Scores");
            System.out.println("3. Remove Player");
            System.out.println("4. Get Player Score");
            System.out.println("5. Check if Player Exists");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter player name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter player score: ");
                    int score = Integer.parseInt(sc.nextLine());
                    scoreboard.addOrUpdatePlayer(name, score);
                    break;
                case 2:
                    scoreboard.displayScores();
                    break;
                case 3:
                    System.out.print("Enter player name to remove: ");
                    name = sc.nextLine();
                    scoreboard.removePlayer(name);
                    break;
                case 4:
                    System.out.print("Enter player name: ");
                    name = sc.nextLine();
                    scoreboard.getPlayerScore(name);
                    break;
                case 5:
                    System.out.print("Enter player name to check: ");
                    name = sc.nextLine();
                    if (scoreboard.playerExists(name)) {
                        System.out.println(name + " exists in the scoreboard.");
                    } else {
                        System.out.println(name + " not found.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting Scoreboard...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
