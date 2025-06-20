import java.util.*;
public class Main {
	static int[][] graph = new int[1001][1001];
	static int v;
	static int e;
	static boolean[] visited = new boolean[1001];
	public static void dfs(int index) {
		if(visited[index] == true)
			return;
		else {
			visited[index] = true;
			for(int i = 1; i <= v; i++) {
				if(graph[index][i] == 1) {
					dfs(i);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		v = sc.nextInt();
		e = sc.nextInt();
		int a,b;
		for(int i = 0; i < e; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			graph[a][b] = graph[b][a] = 1;
		}
		int result = 0 ;
		for(int i = 1; i <= v; i++) {
			if(visited[i] == false) {
				dfs(i);
				result++;
			}
		}
		System.out.println(result);
		sc.close();
		return;
	}
}