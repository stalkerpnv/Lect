public class MethodsExample {

    // модификаторы тип_возвр_значения имя (параметры)
    // тип_возвр_значения имя()



    static int sumOne(int a, int b){
         return a+b;
    }

    static void sumTwo(int a, int b){
        if(a<b){
            return;
        }
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        System.out.println(sumOne(10,5));
        sumTwo(10,25);
    }
}
