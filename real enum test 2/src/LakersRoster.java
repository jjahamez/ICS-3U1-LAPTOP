
public enum LakersRoster {

    LUKA_DONCIC(198, 230),
    DORIAN_FINNEY_SMITH(201, 220),
    JORDAN_GOODWIN(196, 220),
    RUI_HACHIMURA(203, 230),
    JAXSON_HAYES(213, 220),
    BRONNY_JAMES(191, 210),
    LEBRON_JAMES(206, 250),
    TREY_JAMIESON_III(208, 260),
    MAXI_KLEBER(218, 245),
    DALTON_KNECHT(198, 215),
    CHRISTIAN_KOLOKO(213, 220),
    ALEX_LEN(213, 250),
    SHAKE_MILTON(196, 205),
    MARKIEFF_MORRIS(206, 245),
    AUSTIN_REAVES(196, 197),
    JARRED_VANDERBILT(203, 214),
    GABE_VINCENT(188, 200);

    private final double height; // height in centimetres
    private final double weight; // weight in pounds

    LakersRoster(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getBMI() {
        double heightM = height / 100;// CM to M
        double weightKG = weight / 2.205; // LB to KG
        return weightKG / (heightM * heightM); //bmi 
    }

    public String getBMICategory() {
        double bmi = getBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.5) {
            return "Normal Weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public String getPlayerPosition() {
        if (height < 195) {
            return "Guard";
        } else if (height < 210) {
            return "Forward";
        } else {
            return "Center";
        }
    }

    public String compareHeight(LakersRoster other) {
        if (height > other.height) {
            return name() + " is taller than " + other.name() + ".";
        } else if (height < other.height) {
            return name() + " is shorter than " + other.name() + ".";
        } else {
            return name() + " and " + other.name() + " are the same height.";
        }
    }

    public boolean isGOAT() {
        return this == LEBRON_JAMES || this == BRONNY_JAMES;
    }

    public String getSummary() {
        double roundedBMI = Math.round(getBMI());
        return name() + ": Height = " + height + "cm, Weight = " + weight + "lbs, BMI = " + roundedBMI 
        + ", BMI Category = " + getBMICategory() + ", Recommended Position = " + getPlayerPosition();
    }
}
