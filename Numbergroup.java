public interface NumberGroup {
    int num1 = 0;

    public static numInstantiator(int x) {
        num1 = x;
    }

    public static boolean contains(int y) {
        if(num1 == y)
            return true;
        else
            return false;
    }
}