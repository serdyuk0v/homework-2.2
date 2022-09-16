public class Gryffindor extends Hogwarts {
    private final int nobility;
    private final int courage;
    private final int bravery;

    public Gryffindor(String fullName, int powerMagic, int transgressionDistance, int nobility, int courage, int bravery) {
        super(fullName, powerMagic, transgressionDistance);
        this.nobility = nobility;
        this.courage = courage;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor - " +
                super.toString() +
                ", Nobility=" + nobility +
                ", Courage=" + courage +
                ", Bravery=" + bravery +
                '}';
    }

    private int score() {
        return nobility + courage + bravery;
    }

    public void compareGryffindor(Gryffindor gryffindor) {
        int inScore = score();
        int outScore = gryffindor.score();
        if (inScore > outScore) {
            System.out.println(getFullName() + " is stronger than " + gryffindor.getFullName() + '!');
        } else if (inScore < outScore) {
            System.out.println(getFullName() + " is weaker than " + gryffindor.getFullName() + '!');
        } else {
            System.out.println(getFullName() + " and " + gryffindor.getFullName() + " on equal terms!");
        }

    }

    public int getNobility() {
        return nobility;
    }

    public int getCourage() {
        return courage;
    }

    public int getBravery() {
        return bravery;
    }
}
