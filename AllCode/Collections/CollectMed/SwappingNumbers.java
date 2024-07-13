package CollectMed;

public class SwappingNumbers {

    public static void swapping(int[] numbers){
        int temp = 0;
        int size = numbers.length;
        for(int index = 0; index < size; index++ ){
            for(int num = 0; num< size-index-1; num++){
                if(numbers[num] > numbers[num+1]){
                    temp = numbers[num];
                    numbers[num] = numbers[num+1];
                    numbers[num+1] = temp;
                }
            }
            System.out.println();
            for(int number: numbers){
                print(number + " " );
            }
        }

    }
    public static void print(String message){
        System.out.print(message);
    }
    public static void main(String[] args) {
        int [] result = {4,5,2,1,6,89,7};
        swapping(result);
    }
}
