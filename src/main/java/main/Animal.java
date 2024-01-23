package main;

class Animal {
    private String laji;
    private String nimi;
    private int ikä;

    public Animal(String laji, String nimi, int ikä) {
        this.laji = laji;
        this.nimi = nimi;
        this.ikä = ikä;
    }

    public void run() {
        System.out.println(this.nimi + " juoksee kovaa vauhtia!");
    }

    public String toString() {
        return laji + ": " + nimi + ", " + ikä + " vuotta";
    }
}
