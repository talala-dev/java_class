//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();

    int[][] mat = new int[m][n];
    for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat[i].length; j++) {
            mat[i][j] = sc.nextInt();
        }
    }
    sc.nextLine();
    IO.print("Numero pertencente a matriz: ");
    int number = sc.nextInt();

    for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat[i].length; j++) {
            if (mat[i][j] == number) {
                IO.println("Position " + i + "," + j + ":");
                if (j > 0) IO.println("Left: " + mat[i][j - 1]) ;
                else{IO.println("Left: N/A");}
                if (j < mat[i].length -1 ) IO.println("Right: " + mat[i][j + 1]);
                else{IO.println("Right: N/A");}
                if (i > 0) IO.println("Up: " + mat[i-1][j]);
                else{IO.println("Up: N/A");}
                if (i < mat.length - 1 )IO.println("Down: " + mat[i+ 1][j]);
                else{IO.println("Down: N/A");}
            }
        }
    }

    sc.close();
    
}
