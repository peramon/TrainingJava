public class MultidimmensionalArray {
    public static void main(String[] args) {
        int myArrayOneDimension[] = new int[10];
        int myArrayTwoDimension[][] = new int[10][20];
        int myArrayThreeDimension[][][] = new int[10][20][30];

        int multiplicationTable[][] = new int[10][10];

        for(int i = 0; i < multiplicationTable.length; i++){
            for (int j = 0; j < multiplicationTable.length; j++){
                multiplicationTable[i][j] = i * j;
            }
        }

        System.out.println("The result of multyplying 4 by 5 is in the position [4][5] -> " + multiplicationTable[4][5]);

        int myArrayMultidimensional[][] = {{45,11,87,54},{74,15,54,54,54,62,64},{45,45,62,89,78}};
        for(int i = 0; i < myArrayMultidimensional.length; i++){
            for (int j = 0; j < myArrayMultidimensional.length; j++){
                System.out.println("Array " + i + " " +j+ " es ->" + myArrayMultidimensional[i][j]);
            }
        }
    }
}
