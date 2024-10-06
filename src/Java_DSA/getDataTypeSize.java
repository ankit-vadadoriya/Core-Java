package Java_DSA;

public class getDataTypeSize {
    public static void main(String[] args) {

        int sizeOfInt = Integer.BYTES;
        System.out.println("Integer : " + sizeOfInt + " Bytes");

        int sizeOfLong = Long.BYTES;
        System.out.println("Long : " + sizeOfLong + " Bytes");

        int sizeOfFloat = Float.BYTES;
        System.out.println("Float : " + sizeOfFloat + " Bytes");

        int sizeOfDouble = Double.BYTES;
        System.out.println("Double : " + sizeOfDouble + " Bytes");

        int sizeOfCharacter = Character.BYTES;
        System.out.println("Character : " + sizeOfCharacter + " Bytes");
    }
}
