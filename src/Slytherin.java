public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int dominate;

    public Slytherin(String fullName, int powerMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int dominate) {
        super(fullName, powerMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.dominate = dominate;
    }

    @Override
    public String toString() {
        return "Slytherin - " +
                super.toString() +
                ", Cunning=" + cunning +
                ", Determination=" + determination +
                ", Ambition=" + ambition +
                ", Resourcefulness=" + resourcefulness +
                ", Dominate=" + dominate +
                '}';
    }

    private int score() {
        return cunning + determination + ambition + resourcefulness + dominate;
    }

    public void compareSlytherin(Slytherin slytherin) {
        int inScore = score();
        int outScore = slytherin.score();
        if (inScore > outScore) {
            System.out.println(getFullName() + " is stronger than " + slytherin.getFullName() + '!');
        } else if (inScore < outScore) {
            System.out.println(getFullName() + " is weaker than " + slytherin.getFullName() + '!');
        } else {
            System.out.println(getFullName() + " and " + slytherin.getFullName() + " on equal terms!");
        }

    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getDominate() {
        return dominate;
    }
}
