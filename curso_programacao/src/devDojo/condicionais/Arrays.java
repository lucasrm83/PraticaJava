package devDojo.condicionais;

public class Arrays {
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] =2;
        nums[2] =3;
        imprimeArrays(nums);


    }
    public static void imprimeArrays(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
