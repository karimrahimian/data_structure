package monj;

public class ArrayOperation {
    private final int Size = 10;
    int []array = new int[Size];
    int lastIndex = 0;
    public void traverse(){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public void insertEnd(int x){
        if (lastIndex <= Size-1) {
            array[lastIndex] = x;
            lastIndex++;
        }
    }
    public void insertAt(int x,int k){
        //shift array to right
        for (int i = lastIndex; i > k; i--) {
            array[i] = array[i-1];
        }
        array[k] = x;
        lastIndex++;
    }

    public void deleteAt(int k){
        for (int i = k; i < lastIndex; i++) {
            array[i] = array[i+1];
        }
        lastIndex--;
    }
    public void deleteEnd(){
        lastIndex--;
    }
}
