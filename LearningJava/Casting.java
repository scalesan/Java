public class Casting{
    public static void main(String[] args){
        byte byteValue = 20;
        short shortValue = 55;
        int intValue = 888;
        long longValue = 23355;
        
        float floatValue = 8834.5f;
        double doubleValue = 54.2;

        System.out.println(Byte.MAX_VALUE);

        intValue = (int)longValue;
        System.out.println(intValue);

        doubleValue = intValue;
        System.out.println(doubleValue);

        intValue = (int)floatValue;
        System.out.println(intValue);

        byteValue = (byte)128;
        System.out.println(byteValue);

    }
}