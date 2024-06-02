/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author catlinh
 */
public class Graph {

    int matrix[][];
    int n;

    public Graph() {
        matrix = new int[][]{
            {0, 0, 1, 1, 0},
            {0, 0, 0, 1, 1},
            {1, 0, 0, 0, 0},
            {1, 1, 0, 0, 1},
            {0, 1, 0, 1, 0}
        };
        n = matrix.length;
    }

    public void display(int[][] matrix) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    System.out.print(j + " ");
                } else if (j == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(matrix[i - 1][j - 1] + " ");
                }
            }
            System.out.println("");
        }
    }

    public void visit(int e) {
        System.out.println(e);
    }

    public void bfs(int e) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visit = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            visit[i] = false;
        }
        queue.add(e);
        visit[e] = true;

        while (!queue.isEmpty()) {
            int u = queue.poll();
            System.out.print(u + " ");

            for (int j = 1; j <= n; j++) {
                if (!visit[j] && matrix[u - 1][j - 1] == 1) {
                    queue.add(j);
                    visit[j] = true;
                }
            }
        }

    }

    public void dfs(int e) {
        Stack<Integer> stack = new Stack<>();

        boolean[] visit = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            visit[i] = false;
        }

        visit[e] = true;
        stack.push(e);
        System.out.print(stack.peek() + " ");

        Iterator<Integer> list = 
        for (int j = 1; j <= n; j++) {
            if (!visit[j] && matrix[stack.peek() - 1][j - 1] == 1) {
                visit[j] = true;
                dfs(j);
            }
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Graph p = new Graph();
        p.display(p.matrix);
        p.dfs(2);
    }

}
