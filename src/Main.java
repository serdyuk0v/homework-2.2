public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Harry Potter", 65, 35, 71, 43, 29),
                new Gryffindor("Germiona Greinger", 87, 44, 13, 83, 45),
                new Gryffindor("Ron Uizli", 10, 5, 32, 19, 58)
        };
        Slytherin[] slytherins = {
                new Slytherin("Drako Malfoy", 66, 30, 34, 87, 22, 61, 91),
                new Slytherin("Graham Montegyu", 39, 30, 58, 39, 83, 37, 11),
                new Slytherin("Gregori Goil", 48, 79, 73, 22, 47, 74, 69)
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Zahariya Smith", 47, 17, 83, 63, 39),
                new Hufflepuff("Sedric Diggori", 28, 49, 57, 29, 71),
                new Hufflepuff("Justin Finch-FLetchli", 39, 39, 91, 37, 57)
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Chjou Chang", 52, 83, 35, 69, 91, 74),
                new Ravenclaw("Padma Patil", 19, 8, 58, 39, 18, 95),
                new Ravenclaw("Markus Belbi", 59, 12, 83, 48, 79, 70)
        };

        gryffindors[0].compareHogwarts(slytherins[0]);
        gryffindors[1].compareGryffindor(gryffindors[2]);
        slytherins[2].compareSlytherin(slytherins[1]);
        hufflepuffs[0].compareHufflepuff(hufflepuffs[2]);
        ravenclaws[1].compareRavenclaw(ravenclaws[0]);


    }
}