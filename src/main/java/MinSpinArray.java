public class MinSpinArray {
    public int minArray(int[] numbers) {
        for (int i = numbers.length - 1; i > 0; i--) {
            if (numbers[i] < numbers[i - 1])
                return numbers[i];
        }
        return numbers[0];
    }
    public static void main(String[] args){
        int[] numbers = {1,3,5};
        new MinSpinArray().minArray(numbers);
    }
}
