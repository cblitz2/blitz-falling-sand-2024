package blitz.fallingsand;

public class Sand {
    private int[][] field = new int[3][3];

    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                builder.append(field[y][x]);
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    /**
     * @return the value in the field
     */
    public int get(int x, int y) {
        return field[y][x];
    }

    /**
     * Sets the value in field to be 1
     */
    public void put(int x, int y) {
        field[y][x] = 1;
    }


    public void fall() {
        for (int y = field.length - 2; y >= 0; y--) {
            for (int x = 0; x < 3; x++) {
                int state = field[y][x];
                if (state == 1) {
                    int below = field[y + 1][x];
                    if (below == 0) {
                        put(x, y + 1);
                        field[y][x] = 0;
                    }
                }
            }
        }
    }
}
