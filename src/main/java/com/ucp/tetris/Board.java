package com.ucp.tetris;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Board{
    public int board[][]; 
    public Random random = new Random();
    public PieceBase piezaAleatoria;
    public PieceBase piezaRotada;
    public int indiceAleatorioPiezas = random.nextInt(7);
    public int indiceAleatorioDireccionRotar = random.nextInt(2);
    public int indiceAleatorioNumeroRotaciones = random.nextInt(4);
    public int piezaAleatoriaColumn = random.nextInt(10);
    public int puntero;
    public int pieceFila;
    public int numeroDeFilasBorradas = 0;
    public ArrayList<PieceBase> listaObjetos = new ArrayList<>();
    public Board() {
        board = new int[20][10];
    }
    
    public void generateNewPiece() {
        /*indiceAleatorioPiezas = random.nextInt(7);*/
        pieceFila = 0;
        switch (indiceAleatorioPiezas){
        case 0:
        piezaAleatoria = new PieceSquare();
        listaObjetos.add(piezaAleatoria);
            break;
        case 1:
        piezaAleatoria = new PieceStick();
        listaObjetos.add(piezaAleatoria);
        break;
        case 2:
        piezaAleatoria = new PieceT();
        listaObjetos.add(piezaAleatoria);
        break;
        case 3:
        piezaAleatoria = new PieceDog();
        listaObjetos.add(piezaAleatoria);
        break;
        case 4:
        piezaAleatoria = new PieceDog(0);
        listaObjetos.add(piezaAleatoria);
        break;
        case 5:
        piezaAleatoria = new PieceL();
        listaObjetos.add(piezaAleatoria);
        break;
        case 6:
        piezaAleatoria = new PieceL(0);
        listaObjetos.add(piezaAleatoria);
        break;
        default:
            break;
    }

    /*indiceAleatorioDireccionRotar = random.nextInt(2);
    indiceAleatorioNumeroRotaciones = random.nextInt(4);
    piezaAleatoriaColumn = random.nextInt(10);*/

    for(int i = 0; i < indiceAleatorioNumeroRotaciones ; i++){
        if(indiceAleatorioDireccionRotar == 0){
                piezaAleatoria.rotarDerecha();
        }else if(indiceAleatorioDireccionRotar == 1){
                piezaAleatoria.rotarIzquierda();
                piezaAleatoria.rotación = 1;
            }
    }           
            if(indiceAleatorioPiezas == 0 && piezaAleatoriaColumn == 9 || indiceAleatorioPiezas == 2 && indiceAleatorioNumeroRotaciones == 1 && indiceAleatorioDireccionRotar == 0 && piezaAleatoriaColumn == 9 || indiceAleatorioPiezas == 2 && indiceAleatorioNumeroRotaciones == 3 && indiceAleatorioDireccionRotar == 1 && piezaAleatoriaColumn == 9){
                piezaAleatoriaColumn = 8;
                }else if(piezaAleatoria.matriz[0][0] == 1 && piezaAleatoria.matriz[0][1] == 1 && piezaAleatoria.matriz[0][2] == 1 && piezaAleatoria.matriz[0][3] == 1 && piezaAleatoriaColumn > 6){
                piezaAleatoriaColumn = 6;
                }else if(piezaAleatoria.matriz[0][2] == 1 && piezaAleatoria.matriz[1][2] == 1 && piezaAleatoria.matriz[2][2] == 1 && piezaAleatoria.matriz[3][2] == 1){
                    piezaAleatoria.moverColumnaIzquierda();
                    piezaAleatoria.moverColumnaIzquierda();
                }else if(piezaAleatoria.matriz[0][1] == 1 && piezaAleatoria.matriz[1][1] == 1 && piezaAleatoria.matriz[2][1] == 1 && piezaAleatoria.matriz[3][1] == 1){
                    piezaAleatoria.moverColumnaIzquierda();
                }else if(indiceAleatorioPiezas == 2 && indiceAleatorioNumeroRotaciones != 1 && indiceAleatorioNumeroRotaciones != 3 && piezaAleatoriaColumn > 7){
                   piezaAleatoriaColumn = 7;
                }else if(indiceAleatorioPiezas == 2 && indiceAleatorioNumeroRotaciones == 3 && indiceAleatorioDireccionRotar == 0 || indiceAleatorioPiezas == 2 && indiceAleatorioNumeroRotaciones == 1 && indiceAleatorioDireccionRotar == 1){
                    piezaAleatoria.moverColumnaIzquierda();
                    if(piezaAleatoriaColumn == 9){
                    piezaAleatoriaColumn = 8;
                }
                }else if(indiceAleatorioPiezas == 3 && indiceAleatorioNumeroRotaciones != 1 && indiceAleatorioNumeroRotaciones != 3 && piezaAleatoriaColumn > 7 || indiceAleatorioPiezas == 4 && indiceAleatorioNumeroRotaciones != 1 && indiceAleatorioNumeroRotaciones != 3 && piezaAleatoriaColumn > 7){
                   piezaAleatoriaColumn = 7;
                }else if(indiceAleatorioPiezas == 3 && indiceAleatorioDireccionRotar == 1 && indiceAleatorioNumeroRotaciones != 0 && indiceAleatorioNumeroRotaciones != 2 && piezaAleatoriaColumn == 9 || indiceAleatorioPiezas == 4 && indiceAleatorioDireccionRotar == 1 && indiceAleatorioNumeroRotaciones != 0 && indiceAleatorioNumeroRotaciones != 2 && piezaAleatoriaColumn == 9){
                piezaAleatoriaColumn = 8;
                }else if(indiceAleatorioPiezas == 3 && indiceAleatorioDireccionRotar == 0 && indiceAleatorioNumeroRotaciones != 0 && indiceAleatorioNumeroRotaciones != 2 && piezaAleatoriaColumn <9|| indiceAleatorioPiezas == 4 && indiceAleatorioDireccionRotar == 0 && indiceAleatorioNumeroRotaciones != 0 && indiceAleatorioNumeroRotaciones != 2 && piezaAleatoriaColumn <9){
                piezaAleatoria.moverColumnaIzquierda();
                }else if(indiceAleatorioPiezas == 3 && indiceAleatorioDireccionRotar == 0 && indiceAleatorioNumeroRotaciones != 0 && indiceAleatorioNumeroRotaciones != 2  && piezaAleatoriaColumn == 9|| indiceAleatorioPiezas == 4 && indiceAleatorioDireccionRotar == 0 && indiceAleatorioNumeroRotaciones != 0 && indiceAleatorioNumeroRotaciones != 2 && piezaAleatoriaColumn == 9){
                piezaAleatoriaColumn = 8;
                piezaAleatoria.moverColumnaIzquierda();
                }else if(indiceAleatorioPiezas == 5 && indiceAleatorioNumeroRotaciones != 0 && indiceAleatorioNumeroRotaciones != 2 && piezaAleatoriaColumn > 7 || indiceAleatorioPiezas == 6 && indiceAleatorioNumeroRotaciones != 0 && indiceAleatorioNumeroRotaciones != 2 && piezaAleatoriaColumn > 7){
                   piezaAleatoriaColumn = 7;
                }else if(indiceAleatorioPiezas == 5 && indiceAleatorioNumeroRotaciones != 1 && indiceAleatorioNumeroRotaciones != 3 && piezaAleatoriaColumn == 9 || indiceAleatorioPiezas == 6 && indiceAleatorioNumeroRotaciones == 0 && piezaAleatoriaColumn == 9 ){
                   piezaAleatoriaColumn = 8;
                }else if(indiceAleatorioPiezas == 6 && indiceAleatorioNumeroRotaciones == 2 && piezaAleatoriaColumn < 9){
                   piezaAleatoria.moverColumnaIzquierda();
                }else if(indiceAleatorioPiezas == 6 && indiceAleatorioNumeroRotaciones == 2 && piezaAleatoriaColumn == 9){
                    piezaAleatoriaColumn = 8;
                    piezaAleatoria.moverColumnaIzquierda();
                }
            }

    public int posiciones(int pos1, int pos2) {
        return board[pos1][pos2];
    }

    public void rotarPiezaDerecha() {
        limpiarPieza();
        // Verifica si la rotación hacia la derecha es posible
        if (piezaAleatoria.esPosibleRotarDerecha(pieceFila, piezaAleatoriaColumn, board)) {
            piezaAleatoria.rotarDerecha();
            agregarPiezasEnElBoard();
        } else {
            // Si la rotación no es posible, simplemente agrega la pieza en su estado actual
            agregarPiezasEnElBoard();
        }
    }

    public void rotarPiezaIzquierda() {
        limpiarPieza();
        // Verifica si la rotación hacia la izquierda es posible
        if (piezaAleatoria.esPosibleRotarIzquierda(pieceFila, piezaAleatoriaColumn, board)) {
            piezaAleatoria.rotarIzquierda();
            agregarPiezasEnElBoard();
        } else {
            // Si la rotación no es posible, simplemente agrega la pieza en su estado actual
            agregarPiezasEnElBoard();
        }
    }

    public void agregarPiezasEnElBoard() {
        for (int fila = 0; fila < 4; fila++) {
            for (int col = 0; col < 4; col++) {
                if (piezaAleatoria.matriz[fila][col] == 1) {
                    int boardRow = pieceFila + fila;
                    int boardCol = piezaAleatoriaColumn + col;

                    if (boardRow >= 0 && boardRow < 20 && boardCol >= 0 && boardCol < 10) {
                        board[boardRow][boardCol] = 1;
                    }
                }
            }
        }
    }

    public void limpiarPieza(){
        for (int fila = 0; fila < 4; fila++){
            for (int col = 0; col < 4; col++) {
                if (piezaAleatoria.matriz[fila][col] == 1) {
                    int boardRow = pieceFila + fila;
                    int boardCol = piezaAleatoriaColumn + col;

                    if (boardRow >= 0 && boardRow < 20 && boardCol >= 0 && boardCol < 10) {
                        board[boardRow][boardCol] = 0;
                    }
                }
            }
        }
    }

    public void moverPiezaAbajo() {
        limpiarPieza();
        pieceFila++; // Mueve la pieza una fila hacia abajo
        // Verifica si la nueva posición de la pieza es válida
        if (esMovimientoValido()) {
            agregarPiezasEnElBoard();
        } else {
            // Si el movimiento no es válido, restaura la posición anterior
            pieceFila--;
            agregarPiezasEnElBoard();
            bloquearPiezaEnLugar();
        }
    }
    
    private boolean esMovimientoValido() {
        for (int fila = 0; fila < 4; fila++) {
            for (int col = 0; col < 4; col++) {
                if (piezaAleatoria.matriz[fila][col] == 1) {
                    int boardRow = pieceFila + fila;
                    int boardCol = piezaAleatoriaColumn + col;
                    // Verifica si la pieza se sale del tablero o colisiona con otra pieza
                    if (boardRow >= 20 || boardCol < 0 || boardCol >= 10 || (boardRow >= 0 && boardRow < 20 && boardCol >= 0 && boardCol < 10 && board[boardRow][boardCol] == 1)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    private void bloquearPiezaEnLugar() {
        for (int fila = 0; fila < 4; fila++) {
            for (int col = 0; col < 4; col++) {
                if (piezaAleatoria.matriz[fila][col] == 1) {
                    int boardRow = pieceFila + fila;
                    int boardCol = piezaAleatoriaColumn + col;
    
                    if (boardRow >= 0 && boardRow < 20 && boardCol >= 0 && boardCol < 10) {
                        board[boardRow][boardCol] = 1;
                    }
                }
            }
        }
        // Genera una nueva pieza aleatoria y reinicia su posición
        generateNewPiece();
    }
    public int juegoTerminado() {
        // Verifica las primeras filas del tablero para determinar si no se pueden ingresar más piezas
        for(int fila = 0; fila < 1; fila++){
            for (int col = 0; col < board[fila].length; col++) {
                if (board[fila][col] == 1 ){
                    return 0; // La fila está ocupada, el juego ha terminado
                }else if(numeroDeFilasBorradas >= 5){
                    return 1;
                }
            }
        }
        return 2; // No hay filas ocupadas en las primeras filas, el juego continúa
    }

    public void lineCount(){
        for (int fila = board.length - 1; fila >= 0; fila--) {
            boolean filaLlena = true;
            // Verifica si todos los elementos de la fila son "1"
            for (int col = 0; col < board[fila].length; col++) {
                if (board[fila][col] != 1) {
                    filaLlena = false;
                    break;
                }
            }
            // Si la fila está llena, borra la fila moviendo las filas por encima hacia abajo
            if (filaLlena) {
                numeroDeFilasBorradas = numeroDeFilasBorradas + 1;
                for (int i = fila; i > 0; i--) {
                    // Copia la fila de arriba en la fila actual
                    System.arraycopy(board[i - 1], 0, board[i], 0, board[i].length);
                }
                // Establece la fila superior como una fila vacía
                Arrays.fill(board[0], 0);
                fila++; // Revisa la fila actual nuevamente, ya que ahora contiene las filas de arriba
            }
        }
    }
    
    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                // Verificar si hay una pieza en la posición (i, j)
                if (board[i][j] != 0) {
                    // Si hay una pieza, imprimir un carácter que represente la pieza
                    System.out.print("1"); // Puedes usar otro carácter según tus preferencias
                } else {
                    // Si no hay una pieza, imprimir un espacio en blanco
                    System.out.print("0");
                }
            }
            // Salto de línea al final de cada fila del tablero
            System.out.println();
        }
    }
    
}