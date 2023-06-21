package devDojo.Arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] nums = new int[3];
        //Já atribui o tamanho e seus valores
        int [] nums2 = {1,2,3,4,5,6};
        nums[0] = 1;
        nums[1] =2;
        nums[2] =3;
        imprimeArrays(nums2);



    }
    public static void imprimeArrays(int[]arr){
        for (int num:arr) {
            System.out.println(num);

        }
    }
}
