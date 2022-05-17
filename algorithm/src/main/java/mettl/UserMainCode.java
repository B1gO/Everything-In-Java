package mettl;

import java.util.*;

/**
 * @author b1go
 * @date 5/16/22 5:48 PM
 * <p>
 * These relationships are given in the form a linear array where emperor is at the first position and his children are at pos (2i + 1) and (2i + 2)
 * This is the pattern followed throughout.
 * Henry wants to figure out all the siblings of the person X from the data.
 * Return the sorted list of all of john's siblings.
 * If no sibling return {-1}
 * <p>
 * input 1: N, the length of the array
 * input2: An array representing the ancentral tree
 * input 3 : X, the person whose siblings are sought.
 * <p>
 * output - return the array of all siblings in increasingly sorted order.
 * <p>
 * Examples :
 * <p>
 * input 1 : 6
 * input 2 : {1,2,3,4,5}
 * input 3 : 1
 * <p>
 * out put : {-1}
 * <p>
 * Explanation : x is the root of the tree and has no siblings
 * <p>
 * input 1 : 6
 * input 2 : {1,2,3,4,5,6}
 * input 3 : 5
 * <p>
 * output : {4,6}
 * <p>
 * Explanation : {2,3 } are the children of {1}.
 * {4,5,6 } are the children of {2,3}, thus the siblings of x= 5 are {4,6}
 */
public class UserMainCode {
    public static void main(String[] args) {
        /**
         * input 1 : 5
         * input 2 : {1,2,3,4,5}
         * input 3 : 1
         * out put : {-1}
         *        1
         *      2    3
         *    4  5  6
         * 1 has no sibling, so output -1;
         * 5 has sibling 4 and 6
         * */
        int input1 = 6;
        int[] input2 = new int[]{1,2,3,4,5,6};
        System.out.println("****** siblings of 1 ******");
        int[] ints = siblingSearch(input1, input2, 1);
        Arrays.stream(ints).forEach(System.out::println);

        System.out.println("****** siblings of 5 ******");
        ints = siblingSearch(input1, input2, 5);
        Arrays.stream(ints).forEach(System.out::println);

        System.out.println("****** siblings of 3 ******");
        ints = siblingSearch(input1, input2, 3);
        Arrays.stream(ints).forEach(System.out::println);

        System.out.println("****** siblings of 2 ******");
        ints = siblingSearch(input1, input2, 2);
        Arrays.stream(ints).forEach(System.out::println);
    }

    public static int[] siblingSearch(int input1, int[] input2, int input3) {
        // corner case;
        if (input1 <= 1 || input2[0] == input3) {
            return new int[]{-1};
        }

        // q is used to store index
        Queue<Integer> q = new LinkedList<>();
        // store index
        q.add(0);

        while (!q.isEmpty()) {
            boolean flag = false;
            // store elements of each level of tree
            List<Integer> levels = new ArrayList<>();

            // store q.size() because of that q.size() is changing in the below for loop
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int idx = q.poll();

                if (input2[idx] == input3) {
                    flag = true;
                } else {
                    // store siblings
                    levels.add(input2[idx]);
                    // left child
                    if (2 * idx + 1 < input2.length) {
                        q.add(2 * idx + 1);
                    }
                    // right child
                    if (2 * idx + 2  < input2.length) {
                        q.add(2 * idx + 2);
                    }
                }
            }

            // found the siblings, return it.
            if (flag) {
                return levels.stream().mapToInt(Integer::intValue).toArray();
            }
        }

        // no siblings found, return [-1]
        return new int[]{-1};
    }
}
