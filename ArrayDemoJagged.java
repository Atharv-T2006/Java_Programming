class ArrayDemoJagged
{
    public static void main(String[] args)
    {
        int arr[][]=new int[3][];
        arr[0]= new int[4];
        arr[1]= new int[7];
        arr[2]= new int[5];

        System.out.println(arr.length);     //3 
        System.out.println(arr[0].length);  // 4
        System.out.println(arr[1].length);  // 7
        System.out.println(arr[2].length);  // 5



        

    }
}