class ArrayDemoMulti
{
    public static void main(String[] args)
    {
        int arr[][]= new int [3][4];
        arr[0][0]=10;
        arr[0][3]=20;
        arr[1][1]=30;
        arr[2][0]=40;
        arr[2][2]=50;

        System.out.println(arr.length);   //3
        System.out.println(arr[0].length); //4
        System.out.println(arr[1].length);//4
        System.out.println(arr[2].length);//4
        
        

    }
}