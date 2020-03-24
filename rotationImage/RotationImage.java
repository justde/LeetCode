package rotationImage;

import com.sun.xml.internal.ws.api.addressing.OneWayFeature;

import java.rmi.MarshalException;
import java.util.Arrays;

/**
 * @author: zhangjd
 * @Date: 2019/4/18 23:17
 * @Description:
 */
public class RotationImage {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };
        rotate(b);
        for (int i = 0; i < b.length; i++) {
            String s = Arrays.toString(b[i]);
            System.out.println(s);
        }
    }

    public static void rotate(int[][] matrix) {
        int b = matrix.length;
        int a = b / 2;
        int c = b-1;
        for (int i = 0; i < a; i++) {//第几外圈
            for (int j = i; j < c-1 ; j++) {//圈内第几个转
                int temp = matrix[i][j];
                matrix[i][j] = matrix[c-j][i];
                matrix[c-j][i] = matrix[c-i][c-j];
                matrix[c-i][c-j] = matrix[j][c-i];
                matrix[j][c-i] = temp;
            }
        }

    }
}
