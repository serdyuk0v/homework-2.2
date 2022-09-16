public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int faithful;
    private int honest;

    public Hufflepuff(String fullName, int powerMagic, int transgressionDistance, int hardworking, int faithful, int honest) {
        super(fullName, powerMagic, transgressionDistance);
        this.hardworking = hardworking;
        this.faithful = faithful;
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "Hufflepuff - " +
                super.toString() +
                ", Hardworking=" + hardworking +
                ", Faithful=" + faithful +
                ", Honest=" + honest +
                '}';
    }
    private int score() {
        return hardworking + faithful + honest;
    }

    public void compareHufflepuff(Hufflepuff hufflepuff) {
        int inScore = score();
        int outScore = hufflepuff.score();
        if (inScore > outScore) {
            System.out.println(getFullName() + " is stronger than " + hufflepuff.getFullName() + '!');
        } else if (inScore < outScore) {
            System.out.println(getFullName() + " is weaker than " + hufflepuff.getFullName() + '!');
        } else {
            System.out.println(getFullName() + " and " + hufflepuff.getFullName() + " on equal terms!");
        }

    }

    public int getHardworking() {
        return hardworking;
    }

    public int getFaithful() {
        return faithful;
    }

    public int getHonest() {
        return honest;
    }
}
