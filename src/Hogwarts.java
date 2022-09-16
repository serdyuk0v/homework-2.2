public abstract class Hogwarts {
    private final String fullName;
    private final int powerMagic;
    private final int transgressionDistance;

    public Hogwarts(String fullName, int powerMagic, int transgressionDistance) {
        this.fullName = fullName;
        this.powerMagic = powerMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getFullName() {
        return fullName;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    private int score() {
        return powerMagic + transgressionDistance;
    }

    public void compareHogwarts(Hogwarts hogwarts) {
        int inScore = score();
        int outScore = hogwarts.score();
        if (inScore > outScore) {
            System.out.println(getFullName() + " is a stronger magician than " + hogwarts.getFullName() + '!');
        } else if (inScore < outScore) {
            System.out.println(hogwarts.getFullName() + " is a stronger magician than " + getFullName() + '!');
        } else {
            System.out.println(getFullName() + " and " + hogwarts.getFullName() + " on equal terms!");
        }

    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Hogwarts {" + fullName +
                ", PowerMagic=" + powerMagic +
                ", TransgressionDistance=" + transgressionDistance;
    }
}
