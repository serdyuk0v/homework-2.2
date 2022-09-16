public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int witty;
    private int creativity;

    public Ravenclaw(String fullName, int powerMagic, int transgressionDistance, int intelligence, int wisdom, int witty, int creativity) {
        super(fullName, powerMagic, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.witty = witty;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw - " +
                super.toString() +
                ", Intelligence=" + intelligence +
                ", Wisdom=" + wisdom +
                ", Witty=" + witty +
                ", Creativity=" + creativity +
                '}';
    }

    private int score() {
        return intelligence + wisdom + witty + creativity;
    }

    public void compareRavenclaw(Ravenclaw ravenclaw) {
        int inScore = score();
        int outScore = ravenclaw.score();
        if (inScore > outScore) {
            System.out.println(getFullName() + " is stronger than " + ravenclaw.getFullName() + '!');
        } else if (inScore < outScore) {
            System.out.println(getFullName() + " is weaker than " + ravenclaw.getFullName() + '!');
        } else {
            System.out.println(getFullName() + " and " + ravenclaw.getFullName() + " on equal terms!");
        }

    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }
}
