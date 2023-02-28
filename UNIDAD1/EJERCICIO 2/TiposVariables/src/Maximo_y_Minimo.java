public class Maximo_y_Minimo {
    public static void main(String[] args) {

        byte ByteMax = Byte.MAX_VALUE;
        byte ByteMin = Byte.MIN_VALUE;
        //byte Byteover = ByteMax + 1;
        //byte Byteunder = ByteMin - 1;

        short ShortMax = Short.MAX_VALUE;
        short ShortMin = Short.MIN_VALUE;
        //short Shortover = ShortMax + 1;
        //short Shortunder = ShortMin - 1;

        int IntMax = Integer.MAX_VALUE;
        int IntMin = Integer.MIN_VALUE;


        long LongMax = Long.MAX_VALUE;
        long LongMin = Long.MIN_VALUE;
        long Longover = LongMax + 1;
        long Longunder = LongMin - 1;


        System.out.println(ByteMax);
        System.out.println(ByteMin);

        System.out.println(ShortMax);
        System.out.println(ShortMin);

        System.out.println(IntMax);
        System.out.println(IntMin);

        System.out.println(LongMax);
        System.out.println(LongMin);

        System.out.println(Longover);
        System.out.println(Longunder);


    }
}
