package ArrayListSrc;

public class ArraysSupport {
    // 数组最大长度
    public static final int SOFT_MAX_ARRAY_LENGTH = Integer.MAX_VALUE - 8;

    /**
     * 扩容
     * 
     * @param oldLength  旧的长度
     * @param minGrowth  最小扩容
     * @param prefGrowth 尽可能大地扩容
     * @return
     */
    public static int newLength(int oldLength, int minGrowth, int prefGrowth) {
        // 要考虑溢出
        int prefLength = oldLength + Math.max(minGrowth, prefGrowth); // might overflow
        if (0 < prefLength && prefLength <= SOFT_MAX_ARRAY_LENGTH) {
            return prefLength;
        } else {
            // put code cold in a separate method
            return hugeLength(oldLength, minGrowth);
        }
    }

    /**
     * 主要是 Integer.MAX_VALUE - 7 到 Integer.MAX_VALUE - 1 之间的值
     * 如果小于 0，则溢出
     * 
     * @param oldLength
     * @param minGrowth
     * @return
     */
    private static int hugeLength(int oldLength, int minGrowth) {
        int minLength = oldLength + minGrowth;
        if (minLength < 0) { // overflow
            throw new OutOfMemoryError(
                    "Required array length " + oldLength + " + " + minGrowth + " is too large");
        } else if (minLength <= SOFT_MAX_ARRAY_LENGTH) {
            return SOFT_MAX_ARRAY_LENGTH;
        } else {
            return minLength;
        }
    }
}
