public class ArrayExample {
    public static void main(String[] args) {

        double[] numbers = arrayNumbers(5);
        System.out.println("Минимальное значение : " + minValue(numbers));
        System.out.println("Максимальное значение: " + maxValue(numbers));
        System.out.println("Среднее значение: " + averageValue(numbers));
    }

    public static double[] arrayNumbers(int n){
        double[] numbers = new double[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.random();
            System.out.println(numbers[i]);
        }
        return numbers;
    }

    public static double minValue(double[] numbers) {
        double min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static double maxValue(double[] numbers) {
        double max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static double averageValue(double[] numbers) {
        double sum=0, averageValue=0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        averageValue = sum / numbers.length;
        return  averageValue;
    }


}