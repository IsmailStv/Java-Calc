public enum RomanNumeral {
    I(1), II(2), III(3), IV(4), V(5), VI(6),
    VII(7), VIII(8), IX(9), X(10);

    private int arabiс;

    RomanNumeral(int arabiс) {
        this.arabiс = arabiс;
    }
    public int getArabiс() {
        return arabiс;
    }
    public String toString() {
        return "Перевод" + arabiс;
    }
}
