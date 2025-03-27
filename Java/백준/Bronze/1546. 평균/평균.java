import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        int sum = 0; // 최댓값을 찾기 위한 변수
        double a = 0; // 변환된 값들의 합

        // 배열 입력 및 최댓값 찾기
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (i == 0 || sum < arr[i]) { // 첫 번째 값 초기화
                sum = arr[i];
            }
        }

        // 조정된 평균 계산
        for (int i = 0; i < N; i++) {
            a += (double) arr[i] / sum * 100;
        }

        System.out.println(a / N); // 평균 출력
        sc.close();
    }
}