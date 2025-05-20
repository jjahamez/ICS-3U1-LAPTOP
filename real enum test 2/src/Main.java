public class Main {
    public static void main(String[] args) {
        System.out.println("Player Summaries:");
        for (LakersRoster player : LakersRoster.values()) {
            System.out.println(player.getSummary());
            System.out.println("----------------------------------------------------------------------------------------------------------------------");
        } 
        // player summaries

        System.out.println("\nBMI:"); 
        System.out.println(LakersRoster.LEBRON_JAMES.name() + " BMI: " + Math.round(LakersRoster.LEBRON_JAMES.getBMI()));
        System.out.println(LakersRoster.RUI_HACHIMURA.name() + " BMI: "  + Math.round(LakersRoster.RUI_HACHIMURA.getBMI()));
        System.out.println(LakersRoster.JAXSON_HAYES.name() + " BMI: "  + Math.round(LakersRoster.JAXSON_HAYES.getBMI()));
        // checks bmi 

        System.out.println("\nBMI Categories:");
        System.out.println(LakersRoster.LEBRON_JAMES.name() + " BMI: " + (LakersRoster.LEBRON_JAMES.getBMICategory()));
        System.out.println(LakersRoster.BRONNY_JAMES.name() + " BMI: "  + (LakersRoster.BRONNY_JAMES.getBMICategory()));
        System.out.println(LakersRoster.SHAKE_MILTON.name() + " BMI: "  + (LakersRoster.SHAKE_MILTON.getBMICategory()));
        // checks bmi category 

        System.out.println("\nHeight Comparisons:");
        System.out.println(LakersRoster.LEBRON_JAMES.compareHeight(LakersRoster.MARKIEFF_MORRIS));
        System.out.println(LakersRoster.DORIAN_FINNEY_SMITH.compareHeight(LakersRoster.ALEX_LEN));
        System.out.println(LakersRoster.JARRED_VANDERBILT.compareHeight(LakersRoster.AUSTIN_REAVES));
        // compares height between different players

        System.out.println("\nGOAT Status:");
        System.out.println("Is LeBron James the GOAT? " + LakersRoster.LEBRON_JAMES.isGOAT());
        System.out.println("Is Gabe Vincent the GOAT? " + LakersRoster.GABE_VINCENT.isGOAT());
        System.out.println("Is Luka Doncic the GOAT? " + LakersRoster.LUKA_DONCIC.isGOAT());
        //Is the goat

    } 
}
