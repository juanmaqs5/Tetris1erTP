package com.ucp.tetris;

public class PieceT extends PieceBase{

public PieceT(){
    piezaInicial();

}

public void piezaInicial(){
    matriz[0][0]= 1;
    matriz[0][1]= 1;
    matriz[0][2]= 1;
    matriz[1][1]= 1;
}

@Override
public void rotarDerecha() {
    if (matriz[0][0] == 1 && matriz[0][1] == 1 && matriz[0][2] == 1 && matriz[1][1] == 1) { //rotar derecha T inicial
        limpiarMatriz();
        matriz[0][1] = 1;
        matriz[1][1] = 1;
        matriz[1][0] = 1;
        matriz[2][1] = 1;
        }else if (matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[1][0] == 1 && matriz[2][1] == 1) { //rotar derecha 2 veces 
        limpiarMatriz();
        matriz[1][0] = 1;
        matriz[1][1] = 1;
        matriz[1][2] = 1;
        matriz[0][1] = 1;
        }else if (matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1 && matriz[0][1] == 1) {//rotar derecha 3 veces
        limpiarMatriz();
        matriz[0][1] = 1;
        matriz[1][1] = 1;
        matriz[1][2] = 1;
        matriz[2][1] = 1;
        }else if (matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1 && matriz[1][2] == 1) {//rotar derecha 4 veces
        limpiarMatriz();
        matriz[0][0]= 1;
        matriz[0][1]= 1;
        matriz[0][2]= 1;
        matriz[1][1]= 1;
        }else if (matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[2][0] == 1 && matriz[1][1] == 1) { //rotar derecha T en columa 0
        limpiarMatriz();
        matriz[0][0]= 1;
        matriz[0][1]= 1;
        matriz[0][2]= 1;
        matriz[1][1]= 1;
    }
}
@Override
public void rotarIzquierda(){
    if (matriz[0][0] == 1 && matriz[0][1] == 1 && matriz[0][2] == 1 && matriz[1][1] == 1) {//rotar izquierda T inicial
        limpiarMatriz();
        matriz[0][1] = 1;
        matriz[1][1] = 1;
        matriz[1][2] = 1;
        matriz[2][1] = 1;
        }else if (matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1 && matriz[2][1] == 1) {//rotar izquierda 2 veces
        limpiarMatriz();
        matriz[1][0] = 1;
        matriz[1][1] = 1;
        matriz[1][2] = 1;
        matriz[0][1] = 1;
        }else if (matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1 && matriz[0][1] == 1) {//rotar izquierda 3 veces
        limpiarMatriz();
        matriz[0][1] = 1;
        matriz[1][1] = 1;
        matriz[1][0] = 1;
        matriz[2][1] = 1;
        }else if (matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[1][0] == 1 && matriz[2][1] == 1) {//rotar izquierda 4 veces
        limpiarMatriz();
        matriz[0][0]= 1;
        matriz[0][1]= 1;
        matriz[0][2]= 1;
        matriz[1][1]= 1;
        }else if (matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[2][0] == 1 && matriz[1][1] == 1) { 
        limpiarMatriz();
        matriz[1][0] = 1;
        matriz[1][1] = 1;
        matriz[1][2] = 1;
        matriz[0][1] = 1;
    }
}

@Override
public void moverColumnaIzquierda(){
    if(matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1 && matriz[1][2] == 1){
        limpiarMatriz();
        matriz[0][0]= 1;
        matriz[1][0]= 1;
        matriz[2][0]= 1;
        matriz[1][1]= 1;
}
}
}
