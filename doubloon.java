class doubloon {
    public static void main(String[] args) {
        System.out.println(isDoubloon("jkjzyyzk"));
        System.out.println(isDoubloon("aeaeae"));
    }

    public static boolean isDoubloon(String str) {
        str = str.toLowerCase();
        long first = 0;
        long second = 0;
        int k = str.length();

        for (int i = 0; i < str.length(); i++) {
            if (Math.pow(10, (str.charAt(i) - 'a')) < (long) Math.pow(10, 17))
                first += (long)Math.pow(10, (str.charAt(i) - 'a'));
            else
                second += (long)Math.pow(10, (str.charAt(i) - 'r'));
        }

        int l = (int) (Math.log(first) / Math.log(10)) + 1;

        for (int i = 0; i < l; i++) {
            long compare = first / (long)Math.pow(10, l - (i + 1));
            if (compare != 0 && compare != 2) {
                return false;
            }
            first %= Math.pow(10, l - (i + 1));
        }

        l = (int) (Math.log(second) / Math.log(10)) + 1;

        for (int i = 0; i < l; i++) {
            long compare = second / (long)Math.pow(10, l - (i + 1));
            if (compare != 0 && compare != 2) {
                return false;
            }
            second %= Math.pow(10, l - (i + 1));
        }

        return true;
    }
}
