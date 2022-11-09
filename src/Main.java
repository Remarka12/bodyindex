public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        System.out.println();
        System.out.println("Индекс массы тела: ");
        System.out.println(service.calculate(50, 1.6));
    }
}
