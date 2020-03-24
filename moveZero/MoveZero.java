package moveZero;

import javax.lang.model.type.ErrorType;
import java.time.OffsetDateTime;

/**
 * @author: zhangjd
 * @Date: 2019/4/14 23:03
 * @Description:
 */
public class MoveZero {
    /**
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     * <p>
     * 示例:
     * <p>
     * 输入: [0,1,0,3,12]
     * 输出: [1,3,12,0,0]
     * 说明:
     * <p>
     * 必须在原数组上操作，不能拷贝额外的数组。
     * 尽量减少操作次数。
     *
     * 结果：1ms  39m
     */

    public static int[] moveZeroes(int[] nums) {
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                flag++;
                continue;
            }
            if (flag != 0) {
                nums[i - flag] = nums[i];
            }
        }
        for (int i = flag; i > 0; i--) {
            nums[nums.length-i] = 0;
        }
        return nums;
    }

    public static int[] moveZeroes1(int[] nums) {
        int neww = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[neww ++] = nums[i];
            }
        }

        while (neww<nums.length){
            nums[neww++] = 0;
        }

        return nums;
    }
    public static void main(String[] args) {
        int[] a= {0,1,0,3,12};
        int[] ints = moveZeroes(a);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
