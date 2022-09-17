public class ArrayExample {
    public static void main(String[] args) {
        double[] numbers = new double[5];
        double max = 0, averageValue = 0, sum = 0;
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = Math.random();
            sum += numbers[i];
            System.out.println(numbers[i]);
        }
        double min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        averageValue = sum / numbers.length;
        System.out.println("Минимальное значение : " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + averageValue);
    }

}

