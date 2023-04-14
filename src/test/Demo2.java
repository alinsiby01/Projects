package test;

public class Demo2 {
    public static void main(String [] args){
        String[] arr = {"A","B","C","D"};
        int l= arr.length;
        for (int i=0; i< l; i++){
            System.out.println(arr[i] + " ");
            if (arr[i].equals("C")){
                continue;
            }
            System.out.println("Word done");
            break;
        }
    }
}
