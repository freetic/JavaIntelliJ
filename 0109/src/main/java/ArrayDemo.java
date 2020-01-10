public class ArrayDemo {
    public static void main(String[] args) {
        // 1. 첫번째 방법: 선언 -> 생성 -> 할당
        /*int[] age;
        age = new int[4];
        age[0] = 5; age[1] = 6; age[2] = 7; age[3] = 8;*/

        // 2. 두번째 방법: 선언 -> 생성 및 할당
        /*int[] ages;
        ages = new int[] {5,6,7,8};*/

        // 3. 세번째 방법: 초기화
        /*int[] ages = {5,6,7,8};
        for(int i:ages){
            System.out.println(i);
        }*/

        // 배열의 초기화 같은 배열의 타입에 따라 달라진다.
        // 정수형 : 0, 실수형 : 0.0, boolean형 : false, char형: null값('\0', '\u0000')
        // 참조형 : null번지
        /*boolean[] array = new boolean[4];
        for(int i=0; i<4; i++) System.out.println(array[i]);
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }*/



    }
}

