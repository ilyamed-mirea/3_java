package n4.part0.n1;

public enum Seasons {
    WINTER(-12),
    SPRING(13),
    SUMMER(26) {
        @Override
        public String getDescription() {return "Warm time of the year";}
    },
    AUTUMN(10)
    ;

    int middleTemp;
    Seasons(int middleTemp) {
        this.middleTemp = middleTemp;
    }
    int getMiddleTemp() {
        return this.middleTemp;
    }
    String getDescription() {
        return "Cold time of the year";
    }
}
