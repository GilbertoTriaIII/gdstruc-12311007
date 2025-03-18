public class SimpleHashTable {
    private SavedPlayer[] hashtable;

    public SimpleHashTable() {
        hashtable = new SavedPlayer[10];
    }

    public int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public boolean isOccupied(int index) {
        return hashtable[index] != null;
    }


    public void put(String key, Player player) {
        // "Deku" (4 characters) -> 4 % 10 (4/10 is 0, r 4)
        int index = hashKey(key);

        if (isOccupied(index)) {
            // perform linear probing
            int stoppingIndex = index;

            if (index == hashtable.length - 1) {
                index = 0;
            } else {
                index++;
            }

            while (index != stoppingIndex && isOccupied(index)) {
                index = (index + 1) % hashtable.length;


            }
        }

        hashtable[index] = new SavedPlayer(key, player);
    }

    public int findIndex(String key) {
        int index = hashKey(key);
        SavedPlayer savedPlayer = hashtable[index];

        if (savedPlayer == null) {
            return -1;
        }
        if (!key.equals(savedPlayer.getKey())) {
            // perform linear probing
            int stoppingIndex = index;
            boolean found = false;

            if (index == hashtable.length - 1) {
                index = 0;
            } else {
                index++;
            }

            while (index != stoppingIndex && !found) {
                if (isOccupied(index)) {
                    savedPlayer = hashtable[index];

                    if (key.equals(savedPlayer.getKey())) {
                        found = true;
                        break;
                    }
                    index = (index + 1) % hashtable.length;
                }
            }

            if (!found) {
                index = -1;
            }
        }

        return index;
    }

    public void remove(String key) {
        int index = findIndex(key);

        Player removingPlayer = hashtable[index].getValue();
        hashtable[index] = null;
    }

        public Player get(String key) {
            int index = findIndex(key);

            if (index == -1) {
                return null;
            }

            return hashtable[index].getValue();
        }

        public void printHashTable() {
            for (int i = 0; i < hashtable.length; i++) {
                if (isOccupied(i)) {
                System.out.println(i + " - " + hashtable[i]);
            }
            else {
                System.out.println(i + " - NULL");
            }
        }
    }
}