public class Main {
    public static void main(String[] args) {
        System.out.println("Lakers Roster Summary:\n");

        for (LakersRoster player : LakersRoster.values()) {
            System.out.println(player.getSummary());
            System.out.println("-------------------------");
        }

        System.out.println("\nPlayers by Position:");
        for (LakersRoster player : LakersRoster.values()) {
            System.out.println(player.name() + " is a " + player.getPlayerPosition());
        }
    }
}
