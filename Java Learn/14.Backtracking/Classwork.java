public class Classwork {
    public static void changeArr(int arr[], int idx, int val) {
        // base case
        if (idx == arr.length) {
            priArr(arr);
            return;
        }
        // recursion
        arr[idx] = val;
        changeArr(arr, idx + 1, val + 1);// function calling step
        arr[idx] -= 2;// backtracking step

    }

    public static void priArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void findsubSets(String str, String ans) {
        // base case
        if (str == "") {
            if (ans == "")
                System.out.println("null");

            System.out.println(ans);
            return;
        }

        // recursion
        findsubSets(str.substring(1), ans + str.charAt(0));// choice where we added the character at that position
        findsubSets(str.substring(1), ans);
    }

    public static void permutation(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // recursion
        // tc :- O(n * n!)
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            permutation(newStr, ans + curr);
        }
    }

    public static void nQueens(char board[][], int row) {
        // now base case
        if (row == board.length) {
            printBoard(board);
            System.out.println();
            return;
        }

        // this is for the columns
        for (int i = 0; i < board.length; i++) {
            if(isSafe(board, row, i)){

                board[row][i] = 'Q';
                nQueens(board, row + 1);// function calling
                // now in backtracking we also have to remove the sitting queen then put her on
                // next place
                board[row][i] = 'x';// now it is removed. this is backtracking
            }

        }
    }
    public static boolean isSafe(char board[][], int row, int col){
        // 3 checking we have to do

        // vertical up safe
        for(int i=0;i<row;i++){
            if(board[i][col] == 'Q') return false;
        }

        // diag left safe
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q') return false;
        }

        // diag right safe
        for(int i=row-1,j=col+1;i>=0 && j<=board.length-1;i--,j++){
            if(board[i][j] == 'Q') return false;
        }

        return true;
    }
    public static void printBoard(char board[][]){
        System.out.println("-----chess Board------");
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+ " ");
                
            }
            System.out.println();
            
        }
    }
    static int count =0;
    public static void countNQueens(char board[][],int row){
        // base case
        if(row == board.length) {
            count++;
            return;
        }
        
        for(int i=0; i<board.length;i++){
            if(isSafe(board, row, i)){
                board[row][i] = 'Q';
                countNQueens(board, row+1);
                board[row][i] = 'x';
            }
        }

    }
    public static boolean ansNQueens(char board[][], int row){
        if(row == board.length){
            return true;
        }
        
        for(int i=0;i<board.length;i++){
            if(isSafe(board, row, i)){
                board[row][i] = 'Q';
                if(ansNQueens(board, row+1)){
                    return true;
                    // we want to traverse all the ways and only return true if possible

                    // if we have wrote something like this
                    //* return ansNQueens(board, row+1)  */
                    // ! then 
                    // so as to once a correctly put queen is placed don't remove and 
                    // once all the n queens are placed just return;
                }
                // now write the line if wrong queen is placed it backtracks the steps to remove it.
                board[row][i] = 'x';
            }
        }
        return false;
    }
    // ! wrong implementation of nqueens
    public static boolean ansNQueens1(char board[][], int row){
        if(row == board.length){
            return true;
        }
        
        for(int i=0;i<board.length;i++){
            if(isSafe(board, row, i)){
                board[row][i] = 'Q';
                return ansNQueens1(board, row+1);
                // what happens if no possible ways there for that run placement then it won't be able to reach the base case 
                //!and so it won't be able to go back and change its previous step
                // board[row][i] = 'x';//also backtracking becomes unreachable.
            }
        }
        return false;
    }
    static int countways=0;
    public static void gridWays(int grid[][], int row, int col){
        if(row== grid.length-1 && col == grid[0].length-1){
            countways++;
            // countways only happens if you have reached the end not the internal step you take
            return;
        }

        // for(int i=0;i<grid.length;i++){
        //     gridWays(grid, row, col);
        // }
        if(row<grid.length){
            // countways++;
            gridWays(grid,row+1,col);
        }
        if(col<grid[0].length){
            // countways++;
            gridWays(grid,row,col+1);
        }
    }
    public static boolean sudokuSolver(int sudoku[][], int row, int col){
        // base case
        if(row == 9){
            return true;
        }
        // recursion
        int nextRow = row, nextCol = col+1;
        if(col+1 == 9){
            nextCol = 0;
            nextRow = row+1;
        }
        // don't replace the ones which are already set
        if(sudoku[row][col]!=0){
            return sudokuSolver(sudoku,nextRow, nextCol);
        }
        for(int digit=1;digit<=9;digit++){
            if(isDigitSafe(sudoku, row, col, digit)){
                sudoku[row][col] = digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)){
                    return true;
                    // coz we only want to see whether it is solvable or not.
                }
                // now when backtracking 
                sudoku[row][col] = 0;

            }
        }
        return false;
    }
    public static boolean isDigitSafe(int sudoku[][], int row, int col, int digit){
        // row & col
        for(int i=0;i<9;i++){
            if(sudoku[row][i] == digit) return false;//for row
            if(sudoku[i][col] == digit) return false;//for col
        }
        

        // grid
        // first identifying the 3x3 grid it belongs to
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoku[i][j]==digit) return false;
            }
        }

        return true;

    }
    public static void printSudoku(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        // now we are learning backtracking
        // int arr[] = new int[5];
        // changeArr(arr, 0, 1);
        // findsubSets("abc", "");
        // String str = "a";
        // System.out.println(str.substring(1) == "");
        // priArr(arr);
        
        // permutation("abc", "");
        
        // N Queens
        // int n = 4;
        // char chessBoard[][] = new char[n][n];
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         chessBoard[i][j] = 'x';
        //     }
        // }
        // printBoard(chessBoard);
        // System.out.println();
        
        // nQueens(chessBoard, 0);
        
        // now counting the no of ways
        
        // countNQueens(chessBoard, 0);
        // System.out.println("Total ways to put queens are: "+ count);
        
        // now printing one way if any solution exist.
        
        // if(ansNQueens(chessBoard,0)){
        //     System.out.println("Solution is possible :");
        //     printBoard(chessBoard);   
        // }
        // else System.out.println("Solution is not possible.");
        
        // GridWays
        // int grid[][] = new int [4][3];
        // gridWays(grid, 0, 0);
        // System.out.println("Total no. of ways are: "+countways);
        
        // sudoku solver
        int sudoku [][] = {
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3}
        };

        if(sudokuSolver(sudoku, 0, 0)){
            System.out.println("Solution exits");
            printSudoku(sudoku);
            
        }
        else System.out.println("Solution doesn't exits...");

        int maze[][] = {
            {1,0,0,0},
            {1,1,0,1},
            {0,1,0,0},
            {1,1,1,1}
        };

    }
}
class Homework {
    // question 1
    public static void ratMaze(int maze[][], int row, int col){
        // base case
        if(row ==maze.length && col==maze.length){
            Classwork.printSudoku(maze);//this is just maze printer
            return;
        }

        // recursion
        // go up
        if(row>=0){
            ratMaze(maze, row-1, col);
        }
        // go down
        if(row<maze.length){
            ratMaze(maze, row+1, col);
        }
        // go right 
        if(col<maze.length){
            ratMaze(maze, row, col+1);
        }
        // go left
        if(col>=0){
            ratMaze(maze, row, col-1);
        }

    }
}
