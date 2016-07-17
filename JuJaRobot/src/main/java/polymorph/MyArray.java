package polymorph;

import java.util.Arrays;

public class MyArray {

    private Object[] data;

    public MyArray() {
        data = new Object[0];
    }

    public MyArray(int length) {
        data = new Object[length];
    }

    public MyArray(MyArray array) {
        data = new Object[array.data.length];
        for (int i = 0; i < array.data.length; i++) {
            data[i] = array.data[i];
        }
    }

    public void add(int index, Object element) {
        Object[] array2 = new Object[data.length + 1];
        for (int i = 0; i < index; i++) {
            array2[i] = data[i];
        }
        array2[index] = element;

        for (int j = index; j < data.length; j++) {
            array2[j + 1] = data[j];
        }
        data = array2;
    }

    public void remove(int index) {
        if (index == 0) {
            Object[] array2 = new Object[data.length - 1];
            for (int i = 0; i < array2.length; i++) {
                array2[i] = data[i + 1];
            }
        }
        Object[] array2 = new Object[data.length - 1];

        for (int i = 0; i < index; i++) {
            array2[i] = data[i];
        }

        for (int i = index; i < array2.length; i++) {
            array2[i] = data[i + 1];
        }
        data = array2;
    }

    public void add(Object value) {
        add(data.length, value);
    }

    public Object get(int index) {
        return data[index];
    }

    public void set(int index, Object value) {
        data[index] = value;
    }

    public int size() {
        return data.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    public MyArray copy() {
        return new MyArray(this);
    }

    public Object[] getArray(){
        return new MyArray(this).data;
    }
}
