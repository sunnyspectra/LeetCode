bool isValidSudoku(char** board, int boardSize, int* boardColSize){
    int horizontal[9], vertical[9], block[9][9] = {0};
    for(int i = 0; i < 9; i++){
        memset(horizontal, 0, sizeof(horizontal));
        memset(vertical, 0, sizeof(vertical));
        for(int j = 0; j < 9; j++){
            if (board[i][j] != '.'){
                if(horizontal[(board[i][j] - '0')-1] != 0) return false;
                horizontal[(board[i][j] - '0')-1] = 1;
                
                int block_num = ((int)(i / 3))*3 + (int)(j / 3);
                if (block[block_num][(board[i][j] - '0')-1] != 0) return false;
                block[block_num][(board[i][j] - '0')-1] = 1;
            }  
            if (board[j][i] != '.'){
               if(vertical[(board[j][i] - '0')-1] != 0) return false;
                vertical[(board[j][i] - '0')-1] = 1; 
            }  
        }
    }
    return true;
}
