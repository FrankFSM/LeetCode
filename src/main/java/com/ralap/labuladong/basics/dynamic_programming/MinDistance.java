package com.ralap.labuladong.basics.dynamic_programming;

enum Choice {
    NO, ADD, UPDATE, DELETE,
}

class Node {
    public int value;
    public Choice choice;

    public Node(int value, Choice choice) {
        this.value = value;
        this.choice = choice;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", choice=" + choice +
                '}';
    }
}


/**
 * 最小编辑距离
 */
public class MinDistance {

    private String str1;
    private String str2;

    private int[][] memo;

    public int solution(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
        return this.helper(str1.length() - 1, str2.length() - 1);
    }

    public int helper(int str1Len, int str2Len) {
        // str1已到头,返回str2的剩余长度
        if (str1Len == -1) {
            return str2Len + 1;
        }
        // str2已到头，返回str1的剩余长度
        if (str2Len == -1) {
            return str1Len + 1;
        }

        // 字符相同,直接跳过
        if (str1.charAt(str1Len) == str2.charAt(str2Len)) {
            return helper(str1Len - 1, str2Len - 1);
        } else {
            // 删除str1
            int delete = helper(str1Len - 1, str2Len);
            // 替换str1
            int update = helper(str1Len - 1, str2Len - 1);
            // 添加str1
            int add = helper(str1Len, str2Len - 1);
            // 选中最少，然后加本次操作
            return Math.min(Math.min(delete, update), add) + 1;
        }
    }

    /**
     * 备忘录
     */
    public int memoSolution(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;

        this.memo = new int[str1.length()][str2.length()];

        return memoHelper(str1.length() - 1, str2.length() - 1);
    }

    private int memoHelper(int str1Len, int str2Len) {
        // base case
        if (str1Len == -1) {
            return str2Len + 1;
        }
        if (str2Len == -1) {
            return str1Len + 1;
        }
        // 先查备忘录
        if (this.memo[str1Len][str2Len] != 0) {
            return this.memo[str1Len][str2Len];
        }

        // 俩个字符相同，跳过
        if (this.str1.charAt(str1Len) == this.str2.charAt(str2Len)) {
            memo[str1Len][str2Len] = memoHelper(str1Len - 1, str2Len - 1);
        } else {
            // 删除
            int delete = memoHelper(str1Len - 1, str2Len);
            // 添加
            int add = memoHelper(str1Len, str2Len - 1);
            // 修改
            int update = memoHelper(str1Len - 1, str2Len - 1);
            // 使用其中最最小的情况
            memo[str1Len][str2Len] = Math.min(delete, Math.min(add, update)) + 1;
        }
        return memo[str1Len][str2Len];
    }

    /**
     * dp table
     */
    public int dpSolution(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
        return this.dpHelper(str1.length(), str2.length());
    }

    private int dpHelper(int str1Len, int str2Len) {
        int[][] dp = new int[str1Len][str2Len];
        // base case
        for (int i = 0; i < str1Len; i++) {
            dp[i][0] = i + 1;
        }
        for (int i = 0; i < str2Len; i++) {
            dp[0][i] = i + 1;
        }
        for (int i = 1; i < str1Len; i++) {
            for (int j = 1; j < str2Len; j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    int add = dp[i][j - 1];
                    int update = dp[i - 1][j - 1];
                    int delete = dp[i - 1][j];
                    dp[i][j] = Math.min(Math.min(add, update), delete) + 1;
                }
            }
        }
        return dp[str1Len - 1][str2Len - 1];
    }


    /**
     * dp table print
     * str1 -> str2
     */
    public Node dpNodeSolution(String str1, String str2) {
        int str1Length = str1.length();
        int str2Length = str2.length();
        Node[][] dpTable = new Node[str1Length + 1][str2Length + 1];
        // base case
        for (int i = 0; i <= str1Length; i++) {
            // str2为空，str1要删除
            dpTable[i][0] = new Node(i, Choice.DELETE);
        }
        for (int i = 0; i <= str2Length; i++) {
            // str1为空，str1要新增
            dpTable[0][i] = new Node(i, Choice.ADD);
        }
        // 状态转移
        for (int i = 1; i <= str1Length; i++) {
            for (int j = 1; j <= str2Length; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dpTable[i][j] = new Node(dpTable[i - 1][j - 1].value, Choice.NO);
                } else {
                    dpTable[i][j] = this.minNode(dpTable[i][j - 1], dpTable[i - 1][j], dpTable[i - 1][j - 1]);
                    dpTable[i][j].value++;
                }
            }
        }
        this.print(dpTable, str1, str2);
        return dpTable[str1Length][str2Length];
    }

    public void print(Node[][] dpTable, String str1, String str2) {
        int rows = dpTable.length;
        int cols = dpTable[0].length;
        int row = rows - 1;
        int col = cols - 1;
        while (row != 0 && col != 0) {
            char c1 = str1.charAt(row - 1);
            char c2 = str2.charAt(col - 1);
            Choice choice = dpTable[row][col].choice;
            System.out.println("s1[" + (row - 1) + "]");
            switch (choice) {
                case NO:
                    System.out.println("skip: " + c1);
                    row--;
                    col--;
                    break;
                case ADD:
                    System.out.println("add: " + c2);
                    col--;
                    break;
                case DELETE:
                    System.out.println("delete: " + c1);
                    row--;
                    break;
                case UPDATE:
                    System.out.println("update: " + c1 + " to " + c2);
                    row--;
                    col--;
                    break;
            }
        }

        // str1未处理完，直接删除
        while (row > 0) {
            System.out.println("str1[" + (row -1) + "]");
            System.out.println("delete: " + str1.charAt(row-1));
            row--;
        }
        // str2未处理完，直接添加到str1
        while (col > 0) {
            System.out.println("str1[0]");
            System.out.println("add: " + str2.charAt(col-1));
            col--;
        }
    }

    /**
     * 计算value最小的Node
     */
    private Node minNode(Node add, Node delete, Node update) {
        Node res = new Node(add.value, Choice.ADD);
        if (delete.value < res.value) {
            res.value = delete.value;
            res.choice = Choice.DELETE;
        }

        if (update.value < res.value) {
            res.value = update.value;
            res.choice = Choice.UPDATE;
        }
        return res;
    }
}
