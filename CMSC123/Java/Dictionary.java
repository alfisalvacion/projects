class Dictionario {
    public static final int LETTERS = 26, WORDS = LETTERS*LETTERS;
    Definition[] table = new Definition[Dictionario.WORDS];

    void insert(Word w, Definition d) {
        table[w.mapToIndex()] = d;
    }

    Definition find(Word w) {
        return table[w.mapToIndex()];
    }

    void print() {
        for(int i = 0; i<10; i++) {
            System.out.println(i + ":" + table[i].toString());
        }
    }
}

class Word {
    String word;
    int mapToIndex() {
        return Dictionario.LETTERS * word.charAt(0) - 'a' + word.charAt(1) - 'a';
    }
}

class Definition {
    String definition;
    Definition(String def) {
        this.definition = def;
    }
    public String toString() {
        return this.definition;
    }
}

class Dictionary {
    public static void main(String[] args) {
        Dictionario d = new Dictionario();
        Definition aa = new Definition("first word");
        Definition ab = new Definition("second word");
        Definition ac = new Definition("third word");
        d.insert(new Word("aa"), aa);
        d.insert(new Word("ab"), ab);
        d.insert(new Word("ac"), ac);
    }
}
