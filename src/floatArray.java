public class floatArray {
    public static void main(String[] args) {
        int [] float_array = new int[101];
        for (int i = 100; i < 201; i++) {
            float_array[i - 100] = i;
        }
        float sum = 0;
        for (int i = 0; i < float_array.length; i++) {
            sum += float_array[i];
        }
        float everage;
        everage = sum / float_array.length;
        System.out.println("배열의 합은 : " + String.format("%.1f", sum));
        System.out.println("배열의 평균은 : " + everage);
    }
}
