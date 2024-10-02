package designs.HeapImp;

import java.util.*;

public class HeapSort {

    public static void main(String[] args) {
        int[] asteroids = new int[]{8,-8};
        System.out.println(asteroidCollision(asteroids));
    }

    public static List<Integer> asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> st = new Stack<>();

        int i = 0;
        while(i<n){
            if(asteroids[i] > 0){
                st.push(asteroids[i]);
            }
            else{
                if (st.isEmpty()) st.push(asteroids[i]);
                else if(st.peek() < 0){
                    st.push(asteroids[i]);
                }
                else {
                    while (!st.isEmpty() && st.peek() < Math.abs(asteroids[i]) && st.peek() > 0) {
                        st.pop();
                    }
                    if(st.isEmpty()) st.add(asteroids[i]);
                    else if(st.peek() == Math.abs(asteroids[i]) && st.peek() > 0) st.pop();
                    else if(st.peek() < 0) st.push(asteroids[i]);
                }
            }
            i++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        List<Integer> res = ans.reversed();
        return res;
    }

    public static String infixToPostfix(String exp) {
        Map<Character, Integer> pMap = new HashMap<>();
        Stack<Character> st = new Stack<>();
        pMap.put('^', 3);
        pMap.put('*', 2);
        pMap.put('/', 2);
        pMap.put('+', 1);
        pMap.put('-', 1);

        String ans = "";
        for(char ch : exp.toCharArray()){
            System.out.println("Ans: " + ans);
            if(isOperator(ch)){
                if(ch == '('){
                    st.push(ch);
                    continue;
                }
                else if(ch == ')'){
                    while(st.peek() != '('){
                        ans += st.pop();
                    }
                    st.pop();
                    continue;
                }
                while(!st.isEmpty() && st.peek() != '(' && pMap.get(ch) <= pMap.get(st.peek())){
                    ans += st.pop();
                }
                st.push(ch);
            }
            else{
                ans += ch;
            }

        }
        return ans;
    }
    public static boolean isOperator(char ch){
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '(' ||
                ch == ')'||
                ch == '^';
    }

    void sort(int[] arr){

        int N = arr.length;
        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(arr, N, i);

        for (int i = N - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int N, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < N && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < N && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, N, largest);
        }
    }
}
