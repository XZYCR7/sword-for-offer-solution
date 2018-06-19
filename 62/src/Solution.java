import java.util.LinkedList;

public class Solution {
    // 约瑟夫环问题
    // 其实并不一定要构造出一个真的循环链表
    public int LastRemaining_Solution(int n, int m) {
        // 先处理极端输入
        if (n <= 1) {
            return -1;
        }
        // 这里用链表是为了提升性能，如果用 ArrayList 在删除操作中，就会有大量的性能消耗
        LinkedList<Integer> list = new LinkedList<>();
        int bt = 0;
        for (int i = 0; i < n; i++) {
            list.addLast(i);
        }
        while (list.size() > 1) {
            // 表示的是索引的值
            bt = (bt + m - 1) % list.size();
            // 下面这一行代码可以帮助调试
            // System.out.println(bt + " " + list);
            // bt 是链表的索引
            list.remove(bt);
        }
        // 思考为什么会有最后这个判断
        return list.get(0);
    }

    // 测试用例： n = 6，[0,1,2,3,4,5]，m=3
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 6;
        int m = 3;
        int lastRemainingSolution = solution.LastRemaining_Solution(n, m);
        System.out.println(lastRemainingSolution);
    }
}