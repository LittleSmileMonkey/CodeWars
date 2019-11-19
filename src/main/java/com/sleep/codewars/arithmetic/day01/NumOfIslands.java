package com.sleep.codewars.arithmetic.day01;

import java.util.LinkedList;

/**
 * author：xingkong on 2019/11/19
 * e-mail：xingkong@changjinglu.net
 * 给定一个由 '1'（陆地）和 '0'（水）组成的的二维网格，计算岛屿的数量。
 * 一个岛被水包围，并且它是通过水平方向或垂直方向上相邻的陆地连接而成的。
 * 你可以假设网格的四个边均被水包围。
 * <p>
 * 输入:
 * 11110
 * 11010
 * 11000
 * 00000
 * <p>
 * 输出: 1
 * <p>
 * 输入:
 * 11000
 * 11000
 * 00100
 * 00011
 * <p>
 * 输出: 3
 */
class NumOfIslands {
    /**
     * 广度优先算法
     *
     * @param grid
     * @return
     */
    public int numIslands_bfs(char[][] grid) {
        int islandCount = 0;
        if (grid == null || grid.length == 0) return islandCount;
        int nr = grid.length;
        int nc = grid[0].length;
        for (int r = 0; r < nr; r++) {
            for (int c = 0; c < nc; c++) {
                if (grid[r][c] != '1') continue;
                islandCount++;
                //已访问过的节点置为0
                grid[r][c] = '0';
                LinkedList<Integer> visited = new LinkedList<>();
                //根节点
                visited.add(r * nc + c);
                while (!visited.isEmpty()) {
                    Integer currentPosition = visited.poll();
                    int row = currentPosition / nc;
                    int col = currentPosition % nc;
                    if (row - 1 >= 0 && grid[row - 1][col] == '1') {
                        visited.add((row - 1) * nc + col);
                        grid[row - 1][col] = '0';
                    }
                    if (row + 1 < nr && grid[row + 1][col] == '1') {
                        visited.add((row + 1) * nc + col);
                        grid[row + 1][col] = '0';
                    }
                    if (col - 1 >= 0 && grid[row][col - 1] == '1') {
                        visited.add(row * nc + col - 1);
                        grid[row][col - 1] = '0';
                    }
                    if (col + 1 < nc && grid[row][col + 1] == '1') {
                        visited.add(row * nc + col + 1);
                        grid[row][col + 1] = '0';
                    }
                }
            }
        }
        return islandCount;
    }

    /**
     * 深度优先算法
     * 思路：将网格看成一个无向图，相邻的1之间有边
     * 关键：访问过的节点标记为'0'，避免重复扫描.
     * 时间复杂度：O(M*N)
     * 控件复杂度：O(M*N)，整个网络均为陆地的情况下深度达到M*N
     *
     * @param grid
     * @return
     */
    public int numIslands_dfs(char[][] grid) {
        int islandCount = 0;
        if (grid == null || grid.length == 0) return islandCount;
        int nr = grid.length;
        int nc = grid[0].length;
        for (int r = 0; r < nr; r++) {
            for (int c = 0; c < nc; c++) {
                if (grid[r][c] != '1') continue;
                dfs(grid, r, c);
                islandCount++;
            }
        }
        return islandCount;
    }

    private void dfs(char[][] grid, int r, int c) {
        int nr = grid.length;
        int nc = grid[0].length;
        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0') return;
        //已经访问过的节点置为0
        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

}
