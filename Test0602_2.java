package javaDailyProctice.Test0602;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//红与黑问题
public class Test0602_2 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                while (sc.hasNext()) {
                    int m = sc.nextInt();
                    int n = sc.nextInt();
                    sc.nextLine();
                    Character[][] map = new Character[m][n];
                    Node start = null;
                    for (int i = 0; i < m; i ++ ) {
                        String s = sc.nextLine();
                        for (int j = 0; j < n; j ++ ) {
                            map[i][j] = s.charAt(j);
                            if(s.charAt(j) == '@') start = new Node(i, j);
                        }
                    }
                    int[][] direction = {{0, 1}, {0, - 1}, {1, 0}, { - 1, 0}};
                    bfs(map, direction, start);
                }
            }
            public static void bfs(Character[][] map, int[][] direction, Node start) {
                Queue<Node> queue = new LinkedList<Node>();
                boolean[][] visited = new boolean[map.length][map[0].length];
                queue.add(start);
                visited[start.x][start.y] = true;
                int count = 1;
                while ( ! queue.isEmpty()) {
                    Node cur = queue.poll();
                    for (int i = 0; i < 4; i ++ ) {
                        Node next = new Node(cur.x + direction[i][0], cur.y + direction[i][1]);
                        if(next.x >= 0 && next.x < map.length && next.y >= 0 && next.y < map[0].length && map[next.x][next.y] != '#' && ! visited[next.x][next.y]) {
                            count ++ ;
                            queue.add(next);
                            visited[next.x][next.y] = true;
                        }
                    }
                }
                System.out.println(count);
            }
            static class Node {
                int x;
                int y;
                public Node(int x, int y) {
                    this.x = x;
                    this.y = y;
                }
            }
}

