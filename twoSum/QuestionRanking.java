package twoSum;

/**
 * @author: zhangjd
 * @Date: 2019/4/9 23:19
 * @Description:
 */
public class QuestionRanking {
    private static void find(int target, int[][] array){
        int hangshu = array[0].length;
        int line = array.length;
        int Rhangshu;
        if (target<array[0][hangshu/2]){
            Rhangshu = hangshu/2;
        }
        System.out.println(hangshu);
        System.out.println(line);
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3},{1,2,3}};
        QuestionRanking.find(5,arr);
    }
}
