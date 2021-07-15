public static void burbuja (int[]matrix){
    int temporal;
    for(int i=1; i<matrix.lenght; i++){
        for (int j=0; j<matrix.lenght-1; j++){
            if (matrix[j]>matrix[j+1]){
                temp=matrix[j];
                matrix[j] = matrix[j+1];
                matrix[j+1]=temp;
            }
        }
    }
}
