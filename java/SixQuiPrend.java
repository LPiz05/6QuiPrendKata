

public class SixQuiPrend {

    private static final int NB_CARD_MAX = 104;

    public static int findNumberOfBullHeads(int value) {
        // TODO

        //la valeur de base d'une carte est 1
        //si la carte est multiple de 5, la valeur augmente de 1
        //si la carte est multiple de 10, la valeur augmente encore de 1
        //si les chiffres des dizaines et unités sont les memes, la valeur augmente de 4 (sauf pour le numéro 100)
        //la carte 55 vaut 7 têtes de boeufs

        int bullHeads = 1;

        bullHeads += (value % 5 == 0) ? 1:0;
        bullHeads += (value % 10 == 0) ? 1:0;
        bullHeads += ((value % 11 == 0) && (value != 100)) ? 4:0;

        return (value == 55) ? 7:bullHeads;
    }

    public static void gameLoop() {
        for (int cardValue = 1 ; cardValue <= NB_CARD_MAX ; cardValue++) {
            System.out.println(cardValue + " -> " + findNumberOfBullHeads(cardValue));
        }
    }
}

