// Использование специально создаваемого исключения

// Создать исключение
class NonIntResultException extends Exception {
    int n;
    int d;

    NonIntResultException(int i, int j) {
        n = j;
        d = j;
    }
    public String toString() {
        return "Результат операции " + n + " / " + d +
        " не является целым числом";
    }
}
class CustomExceptDemo {
    public static void main(String args[]) {

        // В массиве numer содержатся нечетные числа
        int numer[] = { 4, 8, 15, 32, 64, 127, 256, 512 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };

        for(int i = 0; i < numer.length; i++) {
            try {
                if((numer[i] % 2) != 0)
                    throw new
                        NonIntResultException(numer[i], denom[i]);
                System.out.println(numer[i] + " / " + 
                                    denom[i] + " равно " + 
                                    numer[i] / denom[i]);
            }
            catch (ArithmeticException exc) {
                // Перехватить исключение
                System.out.println("Попытка деления на нуль");
            }
            catch (ArrayIndexOutOfBoundsException exc) {
                // Перехватить исключение
                System.out.println("Соответствующий элемент не найден");
            }
            catch (NonIntResultException exc) {
                // Перехватить исключение
                System.out.println(exc);
            } 
        }
    }
}