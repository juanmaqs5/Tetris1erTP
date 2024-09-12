package com.ucp.tetris;

public abstract class PieceBase implements IRotator {
    public int matriz[][]  = new int[4][4];
    protected int matrizRow;
    protected int matrizCol;

public PieceBase(){
    }

public int posiciones(int pos1, int pos2){
       return matriz[pos1][pos2];
    }

public void limpiarMatriz(){
    for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                matriz[i][j]=0;
            }
        }
    }

public void moverColumnaIzquierda(){}

public boolean esPosibleRotarDerecha(int fila, int columna, int[][] board) {
    // Crea una matriz temporal para representar la pieza rotada
    int[][] rotatedPiece = new int[4][4];

    // Copia la pieza actual a la matriz temporal
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            rotatedPiece[i][j] = matriz[i][j];
        }
    }

    // Realiza una rotación hacia la derecha en la matriz temporal
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            rotatedPiece[i][j] = matriz[3 - j][i];
        }
    }

    // Verifica si la rotación es válida
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            if (rotatedPiece[i][j] == 1) {
                int boardRow = fila + i;
                int boardCol = columna + j;

                // Verifica si la pieza se sale del tablero o colisiona con otra pieza
                if (boardRow < 0 || boardRow >= 20 || boardCol < 0 || boardCol >= 10 || board[boardRow][boardCol] == 1) {
                    return false;
                }
            }
        }
    }

    return true;
}

public boolean esPosibleRotarIzquierda(int fila, int columna, int[][] board) {
    // Crea una matriz temporal para representar la pieza rotada a la izquierda
    int[][] rotatedPiece = new int[4][4];

    // Copia la pieza actual a la matriz temporal
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            rotatedPiece[i][j] = matriz[i][j];
        }
    }

    // Realiza una rotación hacia la izquierda en la matriz temporal
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            rotatedPiece[i][j] = matriz[j][3 - i];
        }
    }

    // Verifica si la rotación es válida
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            if (rotatedPiece[i][j] == 1) {
                int boardRow = fila + i;
                int boardCol = columna + j;

                // Verifica si la pieza se sale del tablero o colisiona con otra pieza
                if (boardRow < 0 || boardRow >= 20 || boardCol < 0 || boardCol >= 10 || board[boardRow][boardCol] == 1) {
                    return false;
                }
            }
        }
    }

    return true;
}

}
