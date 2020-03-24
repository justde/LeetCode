package plusOne;

/**
 * @author: zhangjd
 * @Date: 2019/4/13 22:59
 * @Description:
 */
public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int position = digits.length - 1;
        int a = digits[position];
        boolean isKuo = false;
        if (a != 9) {
            digits[position] = a + 1;
        }
        while (a == 9) {
            digits[position] = 0;
            if (position == 0) {
                isKuo = true;
                break;
            }
            a = digits[--position];
            if (a != 9) {
                digits[position] = a + 1;
            }
        }

        if (isKuo) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            System.arraycopy(digits,0,result,1,digits.length);
            return result;
        } else {
            return digits;
        }
    }
}
