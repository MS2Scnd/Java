public class TypeData {
    public static void main(String[] args) {
        // int, byte, short, long, double, float, char, boolean
        // adalah type data primitive

        // integer (satuan)
        int i = 10;
        System.out.println("\n=============== Integer ===============\n");
        System.out.println("nilai integer i = " + (i + 1));
        System.out.println("nilai Max = " + Integer.MAX_VALUE);
        System.out.println("nilai Max = " + Integer.MIN_VALUE);
        System.out.println("besar nilai integer = " + Integer.BYTES + "Bytes");
        System.out.println("besar nilai integer = " + Integer.SIZE + "Bit");

        // byte (satuan)
        byte b = 10;
        System.out.println("\n=============== Byte ===============\n");
        System.out.println("nilai byte b = " + (b));
        System.out.println("nilai Max = " + Byte.MAX_VALUE);
        System.out.println("nilai Min = " + Byte.MIN_VALUE);
        System.out.println("besar nilai byte = " + Byte.BYTES + "Bytes");
        System.out.println("besar nilai byte = " + Byte.SIZE + "Bit");

        // short (satuan)
        short s = 10;
        System.out.println("\n=============== Short ===============\n");
        System.out.println("nilai Short s = " + (s));
        System.out.println("nilai Max = " + Short.MAX_VALUE);
        System.out.println("nilai Max = " + Short.MIN_VALUE);
        System.out.println("besar nilai Short = " + Short.BYTES + "Bytes");
        System.out.println("besar nilai Short = " + Short.SIZE + "Bit");

        // long (satuan)
        long l = 10L;
        System.out.println("\n=============== Long ===============\n");
        System.out.println("nilai Long l = " + (l));
        System.out.println("nilai Max = " + Long.MAX_VALUE);
        System.out.println("nilai Max = " + Long.MIN_VALUE);
        System.out.println("besar nilai long = " + Long.BYTES + "Bytes");
        System.out.println("besar nilai long = " + Long.SIZE + "Bit");

        // double (koma, bilangan real)
        double d = 10.5d;
        System.out.println("\n=============== Double ===============\n");
        System.out.println("nilai double l = " + (d));
        System.out.println("nilai Max = " + Double.MAX_VALUE);
        System.out.println("nilai Max = " + Double.MIN_VALUE);
        System.out.println("besar nilai double = " + Double.BYTES + "Bytes");
        System.out.println("besar nilai double = " + Double.SIZE + "Bit");

        // float (koma, bilangan real)
        float f = 10.2f;
        System.out.println("\n=============== Float ===============\n");
        System.out.println("nilai float f = " + (f));
        System.out.println("nilai Max = " + Float.MAX_VALUE);
        System.out.println("nilai Max = " + Float.MIN_VALUE);
        System.out.println("besar nilai float = " + Float.BYTES + "Bytes");
        System.out.println("besar nilai float = " + Float.SIZE + "Bit");

        // char (character) Berdasarkan ASCII
        char c = 'a';
        System.out.println("\n=============== Character ===============\n");
        System.out.println("nilai char c = " + (c));
        System.out.println("nilai Max = " + Character.MAX_VALUE);
        System.out.println("nilai Max = " + Character.MIN_VALUE);
        System.out.println("besar nilai char = " + Character.BYTES + "Bytes");
        System.out.println("besar nilai char = " + Character.SIZE + "Bit");

        // boolean (nilai true atau false)
        boolean val = true;
        System.out.println("\n=============== Boolean ===============\n");
        System.out.println("nilai boolean = " + (val));
        System.out.println("nilai Max = " + Boolean.FALSE);
        System.out.println("nilai Max = " + Boolean.TRUE);
    }
}
