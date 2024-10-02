package designs.HeapImp;

public class MinHeap {
    int[] tree;
    int idx = -1;
    int MAX_CAPACITY;

    public MinHeap(int cap) {
        this.MAX_CAPACITY = cap;
        tree = new int[MAX_CAPACITY];
    }

    public void insert(int ele){
        idx++;

        int currIdx = idx, parent = (currIdx-1)/2;
        tree[currIdx] = ele;

        while(currIdx != parent){
            parent = (currIdx-1)/2;
            if(tree[parent] > tree[currIdx]){
                //swap
                int temp = tree[parent];
                tree[parent] = tree[currIdx];
                tree[currIdx] = temp;

                currIdx = parent;
            }
            else {
                break;
            }
        }
    }

    public int getTop(){
        if(getSize() > 0)
            return tree[0];
        return -1;
    }

    public int getSize(){
        return idx+1;
    }

    public void removeTop(){
        if(idx == -1) return;
        //set the root element to the last element
        tree[0] = tree[idx];
        //remove last element
        idx--;

        int curr = 0;
        while(curr < getSize()){
            int left = (2*curr)+1;
            int right = (2*curr)+2;

            int leftVal = 0, rightVal = 0;

            if(left > idx){
                break;
            }
            else if(right > idx){
                leftVal = tree[left];
                rightVal = Integer.MAX_VALUE;
            }
            else {
                leftVal = tree[left];
                rightVal = tree[right];
            }

            //find min
            if(leftVal < rightVal){
                //swap from left
                if(tree[curr] > tree[left]){
                    int temp = tree[curr];
                    tree[curr] = tree[left];
                    tree[left] = temp;
                }
                else {
                    break;
                }
                curr = left;
            }
            else{
                //swap from right
                if(tree[curr] > tree[right]){
                    int temp = tree[curr];
                    tree[curr] = tree[right];
                    tree[right] = temp;
                }
                else {
                    break;
                }
                curr = right;
            }

        }
    }

    public static void main(String[] args) {
        MinHeap heap = new MinHeap(10);
        heap.insert(9);
        heap.insert(7);
        System.out.println(heap.getTop()
        );
        heap.insert(1);
        heap.insert(5);
        heap.insert(8);
        heap.insert(10);
        heap.insert(15);
        System.out.println(heap.getTop());
        heap.removeTop();
        System.out.println(heap.getTop());
        heap.removeTop();
        System.out.println(heap.getTop());

    }
}
