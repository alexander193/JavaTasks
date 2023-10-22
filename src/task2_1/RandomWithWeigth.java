package task2_1;

public class RandomWithWeigth {
    private final int[] numbers;
    private final int[] weight;

    public RandomWithWeigth(int[] numbers, int[] weight) {
        this.numbers = numbers;
        this.weight = weight;
    }

    public int random() {
        int weightSum = 0; // Общий вес всех весов
        for (int j : weight)
            weightSum += j;
        int rand = (int) (Math.random() * weightSum); // Генерация случайного числа от 0 до weigthSum
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (sum + weight[i] > rand && sum <= rand) {
                return numbers[i];
            }
            sum += weight[i];
        }
        return 0;
    }
}
