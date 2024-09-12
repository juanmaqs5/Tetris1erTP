package com.ucp.tetris;

public class PieceStick extends PieceBase{

public PieceStick(){
    piezaInicial();
}

public void piezaInicial(){
    matriz[0][0]= 1;
    matriz[0][1]= 1;
    matriz[0][2]= 1;
    matriz[0][3]= 1;
}

@Override
public void rotarDerecha(){
    if (matriz[0][0] == 1 && matriz[0][1] == 1 && matriz[0][2] == 1 && matriz[0][3] == 1){//rotar derecha Stick
        limpiarMatriz();    
        matriz[0][2]= 1;
        matriz[1][2]= 1;
        matriz[2][2]= 1;
        matriz[3][2]= 1;
        }else if(matriz[0][2] == 1 && matriz[1][2] == 1 && matriz[2][2] == 1 && matriz[3][2] == 1){//rotar derecha Stick rotado
        limpiarMatriz();
        matriz[0][0]= 1;
        matriz[0][1]= 1;
        matriz[0][2]= 1;
        matriz[0][3]= 1;
        //Rotaciones cuando se mueven las columnas 
        }else if(matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1 && matriz[3][1] == 1){
        limpiarMatriz();
        matriz[0][0]= 1;
        matriz[0][1]= 1;
        matriz[0][2]= 1;
        matriz[0][3]= 1;
        }else if(matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[2][0] == 1 && matriz[3][0] == 1){
        limpiarMatriz();
        matriz[0][0]= 1;
        matriz[0][1]= 1;
        matriz[0][2]= 1;
        matriz[0][3]= 1;
    }
}

@Override
public void rotarIzquierda(){
    if (matriz[0][0] == 1 && matriz[0][1] == 1 && matriz[0][2] == 1 && matriz[0][3] == 1){
        limpiarMatriz();    
        matriz[0][1]= 1;
        matriz[1][1]= 1;
        matriz[2][1]= 1;
        matriz[3][1]= 1;
        }else if(matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1 && matriz[3][1] == 1){
        limpiarMatriz();
        matriz[0][0]= 1;
        matriz[0][1]= 1;
        matriz[0][2]= 1;
        matriz[0][3]= 1;
        //Rotaciones cuando se mueven las columnas 
        }else if(matriz[0][2] == 1 && matriz[1][2] == 1 && matriz[2][2] == 1 && matriz[3][2] == 1){
        limpiarMatriz();
        matriz[0][0]= 1;
        matriz[0][1]= 1;
        matriz[0][2]= 1;
        matriz[0][3]= 1;
        }else if(matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[2][0] == 1 && matriz[3][0] == 1){
        limpiarMatriz();
        matriz[0][0]= 1;
        matriz[0][1]= 1;
        matriz[0][2]= 1;
        matriz[0][3]= 1;
    }
}

@Override
public void moverColumnaIzquierda(){
        if(matriz[0][2] == 1 && matriz[1][2] == 1 && matriz[2][2] == 1 && matriz[3][2] == 1){
        limpiarMatriz();
        matriz[0][1]= 1;
        matriz[1][1]= 1;
        matriz[2][1]= 1;
        matriz[3][1]= 1;
        }
        else if(matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1 && matriz[3][1] == 1){
        limpiarMatriz();
        matriz[0][0]= 1;
        matriz[1][0]= 1;
        matriz[2][0]= 1;
        matriz[3][0]= 1;
        }
    }
}
