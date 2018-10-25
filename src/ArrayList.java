import java.util.Arrays;

public class ArrayList implements List {
    private Object[] elementData;
    private int size;

    public ArrayList(int initialCapacity){
        elementData = new Object[initialCapacity];
        //size == 0;
    }

    public ArrayList(){
        this(4);
        //elementData = new Object[]{};
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int i) {
        return elementData[i];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object e) {
        return false;
    }

    @Override
    public int indexOf(Object e) {
        return 0;
    }

    @Override
    public void add(int i, Object e) {
        if(size == elementData.length){
//            Object[] newArr = new Object[elementData.length*2];
//            for (int i = 0; i < elementData.length; i++) {
//                newArr[i] = elementData[i];
//            }
//            elementData = newArr;
            elementData = Arrays.copyOf(elementData, elementData.length*2);
        }
        for (int j = size; j > i ; j--) {
            elementData[j] = elementData[j-1];
        }
        elementData[i] = e;
        size++;
    }

    @Override
    public void add(Object e) {
//        if(size == elementData.length){
////            Object[] newArr = new Object[elementData.length*2];
////            for (int i = 0; i < elementData.length; i++) {
////                newArr[i] = elementData[i];
////            }
////            elementData = newArr;
//            elementData = Arrays.copyOf(elementData, elementData.length*2);
//        }
//        elementData[size++] = e;
        this.add(size, e);
    }

    @Override
    public boolean addBefore(Object obj, Object e) {
        return false;
    }

    @Override
    public boolean addAfter(Object obj, Object e) {
        return false;
    }

    @Override
    public Object remove(int i) {
        for (int j = i; j < size - 1 ; j++) {
            elementData[j] = elementData[j+1];
        }
        size--;
        return null;
    }

    @Override
    public boolean remove(Object e) {
        return false;
    }

    @Override
    public Object replace(int i, Object e) {
        return null;
    }

    @Override
    public String toString() {
        if(size == 0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        for(int i=0;i<size;i++){
            if(i !=size -1){
                builder.append(elementData[i]+",");
            }else{
                builder.append(elementData[i]);
            }

        }
        builder.append("]");
        return builder.toString();
    }
}
