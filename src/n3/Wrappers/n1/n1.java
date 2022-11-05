package n3.Wrappers.n1;

public class n1 {
    public static void main(String[] args) {
        Double doubleValueOf = Double.valueOf(12.34);
        double doubleFromString = Double.parseDouble("23.45");
        Double doubleObj = new Double(12.34);

        byte doubleToByte = doubleObj.byteValue();
        short doubleToShort = doubleObj.shortValue();
        int doubleToInt = doubleObj.intValue();
        long doubleToLong = doubleObj.longValue();
        float doubleToFloat = doubleObj.floatValue();
        double doubleFromDouble = doubleObj.doubleValue();
        boolean doubleToBoolean = doubleObj.isNaN();
        char doubleToChar = doubleObj.toString().charAt(0);

        System.out.println(doubleObj);
        String doubleToString = Double.toString(doubleObj);
    }
}
