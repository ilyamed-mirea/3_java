package n4.part0.n1;

public class YearsTime {
    private static final Seasons bestSeason = Seasons.SUMMER;

    public static void getInfoAboutSeason() {
        System.out.println("My favourite season is " + bestSeason.toString());
    }

    public static void switchSeasons(Seasons season) {
        switch (season) {
            case AUTUMN:
                System.out.println("I love autumm");
                break;
            case SPRING:
                System.out.println("I love spring");
                break;
            case WINTER:
                System.out.println("I love winter");
                break;
            case SUMMER:
                System.out.println("I love summer");
                break;
        }
    }

    public static void printEnumValues() {
        for (Seasons season:Seasons.values() ) {
            System.out.printf("season %s, middleTemp: %d, description: %s%n",season.toString(), season.getMiddleTemp(),season.getDescription());
        }
    }

    public static void main(String[] args) {
        getInfoAboutSeason();
        printEnumValues();
    }
}
