import org.w3c.dom.ranges.RangeException;

public class Main {
    public static final int CUB_STEPEN = 3;
    public static void main(String[] args) {
        task1();
        try {
            task2();
        }catch (Exception e){
            System.out.println("Обработали исключене: \"" + e.getMessage() + "\"");
        }
    }

    public static double numberOfCube(int num) {
        return Math.pow(num, CUB_STEPEN);
    }
    private static void task1() {
        System.out.println("Задание 1: Напишите метод, который возводит число в куб.");
        System.out.println("numberOfCube(2) = " + numberOfCube(2));
        System.out.println("numberOfCube(3) = " + numberOfCube(3));
    }

    private static void task2() throws Exception {
        System.out.println("Задание 2: Напишите пример перехвата и обработки исключения в секции throws-метода и передачи вызывающему методу..");

        throw new Exception("Пример исключения, которе нужно обработать");
    }
}