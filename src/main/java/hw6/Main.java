package hw6;

import com.sun.xml.internal.ws.message.ByteArrayAttachment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Integer[] arr = new Integer[] {1, 3, 4};
//        System.out.println(Arrays.toString(getPastFour(arr)));

//        Integer[] arr1 = new Integer[] {1, 4, 1, 4};
//        System.out.println(checkOneAndFour(arr1));

    }


    public static Integer[] getPastFour(Integer[] arr) throws IllegalArgumentException {

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));

        if (arr.length < 1) {
            throw new IllegalArgumentException("length: " + arr.length);
        }
        if (list.indexOf(4)<0){
            throw new RuntimeException();
        }

        int i = list.lastIndexOf(4);

        Integer[] ans = new Integer[arr.length-i-1];

        System.arraycopy(arr, i+1, ans, 0, ans.length);

        return ans;
    }



    public static boolean checkOneAndFour(Integer[] arr) {

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));

        if (list.indexOf(1) < 0 || list.indexOf(4) < 0){
            return false;
        }

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] != 1 && arr[i] != 4){
                return false;
            }
        }

        return true;
    }
}
