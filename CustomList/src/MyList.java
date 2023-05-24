import java.util.Arrays;

public class MyList<T> {

    private T[] result;

    MyList() {
        this.result = (T[]) new Object[10];
    }

    MyList(int capacity) {
        this.result = (T[]) new Object[capacity];
    }


    public void add(T item) {

        if (this.result[this.result.length - 1] != null) {
            this.result = Arrays.copyOf(this.result, this.result.length * 2);
        }
        for (int i = 0; i < this.result.length; i++) {
            if (this.result[i] == null) {
                this.result[i] = item;
                break;
            }
        }


    }

    public T[] getResult() {
        return (T[]) this.result;
    }

    public int size() {
        int counter = 0;
        for (Object i : this.getResult()) {
            if (i != null) {
                counter++;
            }
        }
        return counter;
    }

    public int getCapacity() {
        return this.getResult().length;
    }


    public T getIndex(int index) {

        if (index < 0 || index > this.getResult().length) {
            return null;
        } else {
            return this.getResult()[index];
        }

    }

    public void setIndex(int index, T data) {

        if (index < 0 || index > this.size() - 1) {
            System.out.println("null");
        } else {
            this.result[index] = data;
        }
    }

    public void remove(int index) {

        T[] afterArray = Arrays.copyOfRange(this.result, index + 1, this.result.length);

        for (int i = index, k = 0; i < this.size(); i++, k++) {
            this.result[i] = afterArray[k];
        }

    }

    public void ArrayToString() {
        for (T data : this.getResult()) {
            if (data != null) {
                System.out.print(data + " ");
            }
        }
    }

    public <E extends Comparable<E>> int ArrayIndexOf(E data) {
// Comparable sınıfını araştır
        int counter = 0;

        for (T item : this.result) {
            if (item != null && item instanceof Comparable) {
                Comparable<T> comparableItem = (Comparable<T>) item;
                int comparisonResult = comparableItem.compareTo((T) data);
                if (comparisonResult == 0) {
                    return counter;
                }
            }
            counter++;
        }
        return -1;
    }

    public boolean isEmpty(){
        for (T data : this.result){
            if (data != null){
                return false;
            }
        }
        return true;

    }
}
