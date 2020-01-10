/*
    2차원 배열
    1)Rectangular Array
    2)Ragged(Jagged) Array <- 가변배열
 */

public class ArrayDemo2 {
    public static void main(String[] args) {
        // 1. 첫번째 방법 : 선언 -> 생성 -> 할당
        /*int[] array[];          // 선언
        array = new int[3][4];    // 생성. heap에 넣어줘야
        array[0][0] = 4; array[0][1] = 5;*/

        // 2. 두번째 방법 : 선언 -> 생성 및 할당
       /* int[][] array;
        array = new int[][]{{1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12}};
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                System.out.print("[" + i + "," + j + "]" + array[i][j] + "\t");
            }
            System.out.println();
        }*/

        // 3. 세번째 방법 : 초기화
        /*int array[][] = {{1,2,3,4},
                        {5,6,7,8,},
                        {9,10,11,12}};*/

        // 가변배열
        // 1. 첫번째 방법 : 선언 -> 생성 -> 할당
        /*int[][] array;          // 선언
        array = new int[3][]    // 전체 배열 생성
        array[0] = new int[4];
        array[1] = new int[8];
        array[2] = new int[2];  // 각 행 배열 생성
        array[0][0] = 4; array[0][1] = 5;   // 할당
        */
        // 2. 두번째 방법 : 선언 -> 생성 및 할당
        /*int[][] array;          // 선언
        array = new int[3][];
        array[0] = new int[] {1,2,3,4};
        array[1] = new int[] {5,6,7,8};
        array[2] = new int[] {9, 10, 11, 12};*/

        // 3번째 방법 : 초기화
        /*array = new int[][]{
                {1,2,3,4},
                {5,6,7,8,9},
                {10,11}
        };*/

        int[][] array = new int[][]{
                {1,2,3},
                {4,5,6,7,8,9}
        };
        System.out.println("층 수 : " + array[1].length);
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print("[" + i + "," + j + "]" + array[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
