package devDojo.orientacaoaobjetos.dominio;

public class Calculadora {
    public int soma(int a, int b){
        return a+b;

    }
    public int subtracao(int a, int b){
        return a-b;
    }
    public int multiplicacao(int a, int b){
        return a*b;
    }
    public int divisao(int a,int b){
        if (b==0){
            return 0;
        }
        return a/b;
    }
    public void somaArray(int[] arr){
        int sum=0;
        for (int num:arr) {
            sum+=num;

        }
        System.out.println(sum);
    }
    //o argumento na chamada de metodo pode ser varios ints, não precisa ser um array
    public void somaVarArgs(int... nums){
        int sum =0;
        for (int num:nums) {
            sum+=num;

        }
        System.out.println(sum);

    }
}
