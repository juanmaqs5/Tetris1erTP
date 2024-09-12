package com.ucp.tetris;

public class Tetris{
    public Board board = new Board();
    public Clock clock = new Clock();
    public Tetris(){
    }

    public void start(){
        board.generateNewPiece();
        board.agregarPiezasEnElBoard();
        board.moverPiezaAbajo();
    }

    public int state(){
        board.lineCount();
        if(board.juegoTerminado() == 0){
            System.out.println("GAME OVER");
            return 0;
        }else if(board.juegoTerminado() == 1){
            System.out.println("YOU WIN");
            return 1;
        }
 return 2;
    }

    public int tick(){
        board.moverPiezaAbajo();
        clock.tick();
        return clock.tick;
        }
    
    public void rotateRight(){
        board.rotarPiezaDerecha();
    }

    public void rotateLeft(){
        board.rotarPiezaIzquierda();

    }

    public int posiciones(int pos1, int pos2) {
        return board.posiciones(pos1, pos2);
    }

    public void printTetris() {
        board.printBoard();
}
}

