void main() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    //Setting the matrix
    //double [] to create a bidimensional matrix.
    int[][] mat = new int[n][n];//n lines and collumns
    for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < n; j++) {
            mat[i][j] = sc.nextInt();
        }
    }
    for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat[i].length; j++) {
            IO.print(mat[i][j] + "\t");
        }
        System.out.println();
    }
    IO.println("Main diagonal");
    for(int i = 0; i< mat.length ; i++){
        IO.print(mat[i][i] + " ");
    }
    IO.println();
    int count = 0;
    IO.print("Negative numbers");
    for(int i = 0; i < mat.length ; i ++){
        for( int j = 0; j < mat[i].length; j++){
            if(mat[i][j] < 0){
                IO.println(mat[i][j]);
                count++;
            }
        }
    }
    IO.println("Negative numbers: " + count);

    sc.close();
}
