/*
AMAOEd MIS6232 Computer Programming 2 (Java)

Author: J. E. Cunanan
Student No: 2022-0072254

Laboratory Exercise 005
*/
package Lab005;

public class LaboratoryExercise5 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {10,9,8,7,6,5,4,3,2,1};
        int[][] arr3 = {{1,2,3},{4,5,6},{7,8,9},{10}};

        // Questions 1 to 5
//        System.out.println(arr1[0]);
//        System.out.println(arr3[arr1[0]][arr2[arr1[8]]]);
//        System.out.println(arr3[2][arr1[1]]);
//        System.out.println(arr1[arr2[arr1[arr2[3]]]]);
//        System.out.println(arr1[x++]);

        // Questions 6 and 7
//        for (int x=1; x<=5; x++) {
//            System.out.println(arr2[5-x]);
//        }

        // Questions 8 to 10
        for (int x=0; x<10; x++) {
            arr1[x] = arr2[x];
            arr2[x] = x;
        }
//        System.out.println(arr2[0]);
//        System.out.println(arr3[arr1[0]][arr2[arr1[8]]]);
        System.out.println(arr3[2][arr1[1]]);
    }
}

/*
Answers to Questions
1. B: 1
2. A: 5
3. C: 9
4. C: 3
5. D: None of the above (x in arr1[x++] has yet to be initialized)
6. B: 54321
7. C: 678910
8. A: 0
9. D: None of the above
10. D: None of the above
 */