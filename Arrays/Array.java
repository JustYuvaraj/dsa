package Arrays;
/*
 *  import  java.util.ArrayList;
 * ArrayList<Integer> list = new ArrayList(n);
 * list.add(0);
 * list.add(1);
 * list.add(2);
 * list.remove(index or value);
 * list.indexOf(2);
 * list.contains(10 );
 * list.size();
 * list.toArray(); 
 * 

 */
public class Array {
   private int[] numbers ;
   private int size = 0;
   public Array(int n){
        this.numbers = new int[n];
    }
    public void insert(int num){
        if(size < numbers.length ){
            numbers[size++] = num;
        } else {
            int[] newArr = new int[2*numbers.length];
            for(int i = 0 ; i < numbers.length ;  i++){
                newArr[i] = numbers[i];
            }
            numbers = newArr;
            numbers[size++] = num;
        }
    }
    public void print(){
        for(int i = 0 ; i < size ; i++){
            System.out.println(numbers[i]);
        }
    }
    public void removeAt(int n){
        for(int i = n ; i < size ; i++){
            numbers[i] = numbers[ i + 1]; 
        }
        size--;

    }
    public int length(){
    
        return size; 

    }
    public int indexOf(int target){
        for(int i = 0 ; i < size ; i++){
            if(numbers[i] == target){
                return i;
            }
        }
        return -1;
    }

}
