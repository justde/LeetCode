package buyStock;

/**
 * @author: zhangjd
 * @Date: 2019/4/28 23:45
 * @Description:
 */
public class buyStock {

    public static void main(String[] args) {
        int[] a = {1, 9, 6, 9, 1, 7, 1, 1, 5, 9, 9, 9};
        int i = maxProfit(a);
        System.out.println(i);
    }

    public static int maxProfit(int[] prices) {
        int result = 0;
        boolean has = false;
        int price = 0;
        for (int i = 0; i < prices.length; i++) {
            //升值
            if (i == prices.length - 1) {
                if (has && prices[i] >= prices[i - 1]) {
                    result = result + prices[i] - price;
                }
                break;
            }
            if (prices[i + 1] > prices[i]) {
                if (has) {
                    continue;
                } else {
                    price = prices[i];
                    has = true;

                }
            } else if (prices[i + 1] == prices[i]) {
                continue;
            } else {
                //降价
                if (has) {
                    price = prices[i] - price;
                    has = false;
                    result = result + price;
                } else {
                    continue;
                }
            }
        }
        return result;
    }
}
