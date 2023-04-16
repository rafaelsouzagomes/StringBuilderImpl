package impls;

import java.util.Arrays;

public class StringBuilderImpl {

    private char[] value;
    private int count;

    public StringBuilderImpl() {
        value = new char[16];
        count = 0;
    }
    
    public StringBuilderImpl(String str) {
        value = str.toCharArray();
        count = str.length();
    }

    public StringBuilderImpl append(String str) {
        int len = str.length();
        controlCapacity(count + len);
        count += len;
        str.getChars(0, len, value, count); // copiar String para o value char[]
        return this;
    }

    public String toString() {
        return new String(value, 0, count);
    }

    private void controlCapacity(int minCapacity) {
        int oldCapacity = value.length;
        if (minCapacity > oldCapacity) {
            int newCapacity = (oldCapacity * 2) + 2;
            if (newCapacity < minCapacity)
                newCapacity = minCapacity;
            value = Arrays.copyOf(value, newCapacity);
        }
    }
}
