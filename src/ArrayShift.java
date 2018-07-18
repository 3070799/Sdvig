import java.util.Arrays;

public class ArrayShift {

    public static int[] cyclicShift(int[] array, int shiftPositions) {

        // инициализация массива для сдвига
        int[] b = new int[array.length];
        if(shiftPositions >=0){
            System.arraycopy(array, array.length - shiftPositions, b, 0, shiftPositions);
            System.arraycopy(array, 0, b, shiftPositions, array.length - shiftPositions);
        }else {
            shiftPositions=-shiftPositions;
            System.arraycopy(array, shiftPositions, b, 0,array.length- shiftPositions);
            System.arraycopy(array, 0, b, array.length - shiftPositions, shiftPositions);
        }




        System.out.println(java.util.Arrays.toString(array));
        System.out.println(java.util.Arrays.toString(b));
        return b;


    }
}
