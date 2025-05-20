
public enum LakersRoster {

    LUKA_DONCIC(198, 230, 210),
    DORIAN_FINNEY_SMITH(201, 220, 212),
    JORDAN_GOODWIN(196, 220,208),
    RUI_HACHIMURA(203, 230, 218),
    JAXSON_HAYES(213, 220, 222),
    BRONNY_JAMES(191, 210, 201),
    LEBRON_JAMES(206, 250, 214),
    TREY_JAMIESON_III(208, 260, 218),
    MAXI_KLEBER(218, 245, 209),
    DALTON_KNECHT(198, 215, 206),
    CHRISTIAN_KOLOKO(213, 220, 227),
    ALEX_LEN(213, 250, 222),
    SHAKE_MILTON(196, 205, 214),
    MARKIEFF_MORRIS(206, 245, 210),
    AUSTIN_REAVES(196, 197, 199),
    JARRED_VANDERBILT(203, 214, 216),
    GABE_VINCENT(188, 200, 203);

    private final double height; // height in centremetres
    private final double weight; // weight in pounds 
    private final double wingspan; //wingspan in centremetres 

    LakersRoster(double height, double weight, double wingspan) {
        this.height = height;
        this.weight = weight;
        this.wingspan = wingspan;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getWingspan() {
        return wingspan; 
    }

    public double getBMI() {
        double heightM = height / 100;
        double weightKG = weight * 2.205;
        return weightKG / (heightM * heightM);
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
        if (this.height > other.height) {
            return this.name() + " is taller than " + other.name() + "."; 
        } else if (this.height < other.height) {
            return this.name() + " is shorter than " + other.name() + ".";
        } else {
            return this.name() + " and " + other.name() + " are the same height.";
        }
    }

    public double getWingspanToHeightRatio() {
        return wingspan / height; 
    }  

    public double getWingspanToWeightRatio() {
        return wingspan / weight; 
    }

    public boolean isGOAT() {
        return this == LEBRON_JAMES || this == BRONNY_JAMES; 
    }

    public String getSummary() {
        return name() + ": Height = " + height + "cm, Weight = " + weight + "lbs, BMI = " + getBMI() + " Wingspan ratio = " + getWingspanToHeightRatio() + "Weight Ratio = " + getWingspanToWeightRatio() + " Recommended Position = " + getPlayerPosition();
    }
}
