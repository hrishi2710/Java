package app;

public class App {

    static boolean solveKT(){
        int move = 1;
        int[][] sol = new int[8][8];
        for(int i =0; i<8 ; i++){
            for(int j=0; j<8; j++){
                sol[i][j] = -1;
            }
        }
        sol[0][0] = 0;
        int[] x_move = {2, 1, -1, -2,-2,-1,1,2};
        int[] y_move = {1,2,2,1,-1,-2,-2,-1};
        if(solveKTUtil(move, 0 , 0 , sol, x_move,y_move)){
            printSolution(sol);
        }
        else{
            System.out.println("SOlution doesn't exist");
        }
        return false;
    }

    static void printSolution(int[][] sol){
        for(int i =0; i<8; i++){
            for(int j =0 ; j<8 ; j++){
                System.out.print(sol[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static boolean isSafe(int x, int y, int[][] sol){
        if(x<=7 && y<=7 && x>=0 && y>=0 &&sol[x][y] == -1){
            return true;
        }
        return false;
    }

    static boolean solveKTUtil(int move, int x, int y, int[][] sol, int[] x_move, int[] y_move){
        if(move == 64){
            return true;
        }
        int k = 0; int next_x; int next_y;
        for(k = 0; k<8; k++){
            next_x = x+ x_move[k];
            next_y = y+y_move[k];
            if (isSafe(next_x,next_y,sol)){
                sol[next_x][next_y] = move;
                printSolution(sol);
                System.out.println("");
                if(solveKTUtil(move+1, next_x, next_y, sol, x_move, y_move))
                return true;
                else
                sol[next_x][next_y] = -1;
            }
        }
        return false;
    }
    public static void main(String[] args) throws Exception {
        solveKT();
    }
}