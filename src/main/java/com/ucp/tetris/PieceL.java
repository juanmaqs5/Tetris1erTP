package com.ucp.tetris;

public class PieceL extends PieceBase {
    public PieceL(){
        piezaInicialRight();
    }

    public PieceL(int a){
        piezaInicialLeft();
    }

public void piezaInicialRight(){
    matriz[0][0]= 1;
    matriz[1][0]= 1;
    matriz[2][0]= 1;
    matriz[2][1]= 1;
}

public void piezaInicialLeft(){
    matriz[0][1]= 1;
    matriz[1][1]= 1;
    matriz[2][1]= 1;
    matriz[2][0]= 1;
}

public void rotarDerecha(){
    if (matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[2][0] == 1 && matriz[2][1] == 1){//rotar derecha L derecha
    limpiarMatriz();    
    matriz[1][0]= 1;
    matriz[1][1]= 1;
    matriz[1][2]= 1;
    matriz[2][0]= 1;
    }else if(matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1 && matriz[2][0] == 1){//rotar derecha 2 veces L derecha
    limpiarMatriz();
    matriz[0][0]= 1;
    matriz[0][1]= 1;
    matriz[1][1]= 1;
    matriz[2][1]= 1;
    }else if(matriz[0][0] == 1 && matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1){//rotar derecha 3 veces L derecha
    limpiarMatriz();
    matriz[1][0]= 1;
    matriz[1][1]= 1;
    matriz[1][2]= 1;
    matriz[0][2]= 1;
    }else if(matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1 && matriz[0][2] == 1){//rotar derecha 4 veces L derecha
    limpiarMatriz();
    matriz[0][0]= 1;
    matriz[1][0]= 1;
    matriz[2][0]= 1;
    matriz[2][1]= 1;
    }else if(matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1 && matriz[2][0] == 1){ //rotar derecha L izquierda //
    limpiarMatriz();
    matriz[0][0]= 1;
    matriz[1][0]= 1;
    matriz[1][1]= 1;
    matriz[1][2]= 1;
    }else if(matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1){//rotar derecha 2 veces L izquierda
    limpiarMatriz();
    matriz[0][1]= 1;
    matriz[0][2]= 1;
    matriz[1][1]= 1;
    matriz[2][1]= 1;
    }else if(matriz[0][1] == 1 && matriz[0][2] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1){//rotar derecha 3 veces L izquierda
    limpiarMatriz();
    matriz[1][0]= 1;
    matriz[1][1]= 1;
    matriz[1][2]= 1;
    matriz[2][2]= 1;
    }else if(matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1 && matriz[2][2] == 1){//rotar derecha 4 veces L izquierda
    limpiarMatriz();
    matriz[0][1]= 1;
    matriz[1][1]= 1;
    matriz[2][1]= 1;
    matriz[2][0]= 1;
    }else if(matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[0][1] == 1 && matriz[2][0] == 1){
    limpiarMatriz();
    matriz[1][0]= 1;
    matriz[1][1]= 1;
    matriz[1][2]= 1;
    matriz[2][2]= 1;
}
}

public void rotarIzquierda(){
    if (matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[2][0] == 1 && matriz[2][1] == 1){//rotar izquieda L derecha
        limpiarMatriz();
        matriz[1][0]= 1;
        matriz[1][1]= 1;
        matriz[1][2]= 1;
        matriz[0][2]= 1;
        }else if(matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1 && matriz[0][2] == 1){//rotar izquierda 2 veces L derecha
        limpiarMatriz();
        matriz[0][0]= 1;
        matriz[0][1]= 1;
        matriz[1][1]= 1;
        matriz[2][1]= 1;
        }else if(matriz[0][0] == 1 && matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1){//rotar izquierda 3 veces L derecha
        limpiarMatriz();
        matriz[1][0]= 1;
        matriz[1][1]= 1;
        matriz[1][2]= 1;
        matriz[2][0]= 1;
        }else if(matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1 && matriz[2][0] == 1){//rotar derecha 4 veces L derecha
        limpiarMatriz();
        matriz[0][0]= 1;
        matriz[1][0]= 1;
        matriz[2][0]= 1;
        matriz[2][1]= 1;
        }else if(matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1 && matriz[2][0] == 1){ //rotar izquierda L izquierda
        limpiarMatriz();
        matriz[1][0]= 1;
        matriz[1][1]= 1;
        matriz[1][2]= 1;
        matriz[2][2]= 1;
        }else if(matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1 && matriz[2][2] == 1){
        limpiarMatriz();
        matriz[0][1]= 1;
        matriz[0][2]= 1;
        matriz[1][1]= 1;
        matriz[2][1]= 1;
        }else if(matriz[0][1] == 1 && matriz[0][2] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1){
        limpiarMatriz();
        matriz[0][0]= 1;
        matriz[1][0]= 1;
        matriz[1][1]= 1;
        matriz[1][2]= 1;
        }else if(matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1){
        limpiarMatriz();
        matriz[0][1]= 1;
        matriz[1][1]= 1;
        matriz[2][1]= 1;
        matriz[2][0]= 1;
        }else if(matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[0][1] == 1 && matriz[2][0] == 1){
        limpiarMatriz();
        matriz[0][0]= 1;
        matriz[1][0]= 1;
        matriz[1][1]= 1;
        matriz[1][2]= 1;
}
}

@Override
public void moverColumnaIzquierda(){
        if(matriz[0][1] == 1 && matriz[0][2] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1){// L izquierda rotada dos veces
        limpiarMatriz();
        matriz[0][0]= 1;
        matriz[1][0]= 1;
        matriz[0][1]= 1;
        matriz[2][0]= 1;
        }
        }    
}