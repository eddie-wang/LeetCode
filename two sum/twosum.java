/**
*problem：Two Sum
*Author : Wang xiaohui
*思路是：先对整个数组排序（nlogn）然后从排好序的数组的两边 同时比较，具体看代码很简单  时间O（n） 
*所以一共时间是O（nlogn）
*/
public class Solution {

    public int[] twoSum(int[] numbers, int target) {
        int[] index = new int[numbers.length];  //index数组存放索引信息 比如 index[i]=j 表示 排好序的数组中的第i个元素是原始数组中的第j个 
        for (int i = 0; i < numbers.length; i++) {
            index[i] = i;
        }
        int[] numbers_sorted = new int[numbers.length];//storage sorted array
        System.arraycopy(numbers, 0, numbers_sorted, 0, numbers.length);
        sort(numbers_sorted, 0, numbers.length, index);
        int i, j;
        for (i = 0, j = numbers_sorted.length - 1; i < j;) {
            if (numbers_sorted[i] + numbers_sorted[j] == target) {
                break;
            }
            if (numbers_sorted[i] + numbers_sorted[j] < target) {
                i++;
            } else {
                j--;
            }

        }
        i = index[i] + 1; //从1开始所以要加一个1
        j = index[j] + 1;
        if (i > j) {
            int temp = i;
            i = j;
            j = temp;
        }
        return new int[]{i, j};
    }
   /**
   * 递归快速排序算法（随机）  这里要用随机的快速排序 否则会超时
   */
    void sort(int numbers[], int i, int j, int[] index) //j指向数组的最后一个元素的下一个位置
    {
        int start = i;
        int end = j;
        if (start < end) {
            int random = (int) (Math.random() * (j - i - 1)) + i;//随机选取pivot值  避免最差情况
            int pivot = numbers[random];
            numbers[random] = numbers[i];
            numbers[i] = pivot;
            int temp;
            temp = index[i];
            index[i] = index[random];
            index[random] = temp;
            i--;

            while (i < j) {
                do {
                    i++;
                } while (i < j && numbers[i] <= pivot);
                do {
                    j--;
                } while (numbers[j] > pivot);
                if (i < j) {

                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                    //
                    temp = index[j];
                    index[j] = index[i];
                    index[i] = temp;
                }

            }
            numbers[start] = numbers[j];
            numbers[j] = pivot;

            temp = index[j];
            index[j] = index[start];
            index[start] = temp;
            sort(numbers, start, j, index);
            sort(numbers, j + 1, end, index);
        }
    }
}
