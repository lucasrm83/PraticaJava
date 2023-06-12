package devDojo.excecoes.runtime;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        try{
            for (int i = 0; i <arr.length ; i++) {
                System.out.println(arr[i]);

            }


        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("dentro de arraysindex");

        }catch (IndexOutOfBoundsException e){
            System.out.println("dentro de indexoutof");

        }catch (IllegalArgumentException e){
            System.out.println("dentro de illegalargument");

        }catch (ArithmeticException e){
            System.out.println("dentro de arithimeticexception");

        }







    }
}
