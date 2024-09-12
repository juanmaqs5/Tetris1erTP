package com.ucp.tetris;

public class PieceDog extends PieceBase{
    public PieceDog(){
        piezaInicialRight();
    }
    
    public PieceDog (int a){
        piezaInicialLeft();
    }

        public void piezaInicialRight(){
        matriz[1][0]= 1;
        matriz[1][1]= 1;
        matriz[0][1]= 1;
        matriz[0][2]= 1;
        }

        public void piezaInicialLeft(){
        limpiarMatriz();
        matriz[0][0]= 1;
        matriz[0][1]= 1;
        matriz[1][1]= 1;
        matriz[1][2]= 1;
        }    
        
        @Override
        public void rotarDerecha(){
            if (matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[0][1] == 1 && matriz[0][2] == 1){//rotar derecha perro derecho
            limpiarMatriz();    
            matriz[0][1]= 1;
            matriz[1][1]= 1;
            matriz[1][2]= 1;
            matriz[2][2]= 1;
            }else if(matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1 && matriz[2][2] == 1){//rotar derecha perro derecho rotado
            limpiarMatriz();
            matriz[1][0]= 1;
            matriz[1][1]= 1;
            matriz[0][1]= 1;
            matriz[0][2]= 1;
            }else if(matriz[0][0] == 1 && matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1){//rotar derecha perro izquierdo
            limpiarMatriz();
            matriz[0][2]= 1;
            matriz[1][2]= 1;
            matriz[1][1]= 1;
            matriz[2][1]= 1;
            }else if(matriz[0][2] == 1 && matriz[1][2] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1){//rotar derecha perro izquierdo rotado 
            limpiarMatriz();
            matriz[0][0]= 1;
            matriz[0][1]= 1;
            matriz[1][1]= 1;
            matriz[1][2]= 1;
        }else if(matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1){//rotar derecha perro izquierdo rotado izquierda
            limpiarMatriz();
            matriz[1][0]= 1;
            matriz[1][1]= 1;
            matriz[0][1]= 1;
            matriz[0][2]= 1;
    }else if(matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[1][0] == 1 && matriz[2][0] == 1){//rotar derecha perro izquierdo rotado izquierda
            limpiarMatriz();
            matriz[0][0]= 1;
            matriz[0][1]= 1;
            matriz[1][1]= 1;
            matriz[1][2]= 1;
    }
}
    @Override
    public void rotarIzquierda(){
        if (matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[0][1] == 1 && matriz[0][2] == 1){//rotar izquierdo perro derecho
            limpiarMatriz();    
            matriz[0][0]= 1;
            matriz[1][0]= 1;
            matriz[1][1]= 1;
            matriz[2][1]= 1;
            }else if(matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1){//rotar izquierda perro derecho rotado
            limpiarMatriz();
            matriz[1][0]= 1;
            matriz[1][1]= 1;
            matriz[0][1]= 1;
            matriz[0][2]= 1;
            }else if(matriz[0][0] == 1 && matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1){//rotar izquierda perro izquierdo 
            limpiarMatriz();
            matriz[0][1]= 1;
            matriz[1][1]= 1;
            matriz[1][0]= 1;
            matriz[2][0]= 1;
            }else if(matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[1][0] == 1 && matriz[2][0] == 1){//rotar izquierda perro izquierdo rotado.
            limpiarMatriz();
            matriz[0][0]= 1;
            matriz[0][1]= 1;
            matriz[1][1]= 1;
            matriz[1][2]= 1;
        }else if(matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1 && matriz[2][2] == 1){//rotar izquierda perro derecho rotado derecha
            limpiarMatriz();
            matriz[1][0]= 1;
            matriz[1][1]= 1;
            matriz[0][1]= 1;
            matriz[0][2]= 1;
        }else if(matriz[0][2] == 1 && matriz[1][2] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1){//rotar izquierda perro derecho rotado derecha
            limpiarMatriz();
            matriz[0][0]= 1;
            matriz[0][1]= 1;
            matriz[1][1]= 1;
            matriz[1][2]= 1;
}
}

    @Override
    public void moverColumnaIzquierda(){
            if(matriz[0][2] == 1 && matriz[1][2] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1){//perro izquieda rotado derecha
            limpiarMatriz();
            matriz[0][1]= 1;
            matriz[1][0]= 1;
            matriz[1][1]= 1;
            matriz[2][0]= 1;
            }
            else if(matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1 && matriz[2][2] == 1){//perro derecha rotado derecha
            limpiarMatriz();
            matriz[0][0]= 1;
            matriz[1][0]= 1;
            matriz[1][1]= 1;
            matriz[2][1]= 1;


            }
        }    
    }
