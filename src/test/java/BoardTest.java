import static org.junit.Assert.*;

import org.junit.Test;

import com.ucp.tetris.Board;
import com.ucp.tetris.PieceBase;
import com.ucp.tetris.PieceSquare;
import com.ucp.tetris.PieceT;

public class BoardTest {
    @Test
    public void createBoard_Test(){
        Board board = new Board();
        for(int i = 0 ; i < 20 ;i ++){
            for(int j = 0 ; j < 10 ; j++){
                assertEquals(board.posiciones(i,j), 0);  
            }
    }
    }
    @Test
    public void agregarPiezasEnElBoard_Test(){
    Board board = new Board();
    Board board1 = new Board();
    board.generateNewPiece();
    board.agregarPiezasEnElBoard();
    assertNotEquals(board, board1);
    
    }
    
    @Test
    public void agregarUnaPiezaEnElBoard_Test(){
        Board board1 = new Board();
        board1.indiceAleatorioPiezas = 1;
        board1.piezaAleatoriaColumn = 9;
        board1.indiceAleatorioNumeroRotaciones = 0;
        board1.indiceAleatorioDireccionRotar = 0;
        board1.generateNewPiece();
        board1.agregarPiezasEnElBoard();
        assertEquals(board1.posiciones(0, 6),1);
        assertEquals(board1.posiciones(0, 7),1);
        assertEquals(board1.posiciones(0, 8),1);
        assertEquals(board1.posiciones(0, 9),1);
        for(int i = 0 ; i < 20 ;i ++){
            for(int j = 0 ; j < 10 ; j++){
                if(i==0 && j==6 || i==0 && j==7 || i==0 && j==8 ||i==0 && j==9){
                    continue;
                }
                assertEquals(board1.posiciones(i,j), 0);  
            }
    }
    }
    
    @Test
    public void corroborarFuncionamientoColumnaAleatoria_Test(){
        Board board1 = new Board(); 
        Board board2 = new Board();
        board1.generateNewPiece();
        board1.agregarPiezasEnElBoard();
        board2.generateNewPiece();
        board2.agregarPiezasEnElBoard();
       assertNotEquals(board1,board2);
    }
    
    @Test
    public void agregarUnaPiezaRotadaHaciaLaDerechaEnElBoard_Test(){
        Board board1 = new Board();
        board1.indiceAleatorioPiezas = 2;
        board1.indiceAleatorioDireccionRotar = 0;
        board1.indiceAleatorioNumeroRotaciones = 1;
        board1.piezaAleatoriaColumn = 0;
        board1.generateNewPiece();
        board1.agregarPiezasEnElBoard();
        assertEquals(1,board1.posiciones(0, 1));
        assertEquals(1,board1.posiciones(1, 1));
        assertEquals(1,board1.posiciones(2, 1));
        assertEquals(1,board1.posiciones(1, 0));
    }
    
    @Test
    public void agregarUnaPiezaRotadaHaciaLaIzquierdaEnElBoard_Test(){
        Board board1 = new Board();
        board1.indiceAleatorioPiezas = 2;
        board1.indiceAleatorioDireccionRotar = 1;
        board1.indiceAleatorioNumeroRotaciones = 1;
        board1.piezaAleatoriaColumn = 0;
        board1.generateNewPiece();
        board1.agregarPiezasEnElBoard();
        assertEquals(1,board1.posiciones(0, 0));
        assertEquals(1,board1.posiciones(1, 0));
        assertEquals(1,board1.posiciones(2, 0));
        assertEquals(1,board1.posiciones(1, 1));
    }
    
    @Test
    public void rotarDerechaPiezaEnElBoard_Test(){
        Board board1 = new Board();
        PieceBase testPiece = new PieceT();
        board1.piezaAleatoria = testPiece;
        board1.piezaAleatoriaColumn = 0; 
        board1.agregarPiezasEnElBoard();
        assertEquals(board1.posiciones(0, 0),1);
        assertEquals(board1.posiciones(0, 1),1);
        assertEquals(board1.posiciones(0, 2),1);
        assertEquals(board1.posiciones(1, 1),1);
        board1.rotarPiezaDerecha();
        assertEquals(board1.posiciones(0, 1),1);
        assertEquals(board1.posiciones(1, 1),1);
        assertEquals(board1.posiciones(2, 1),1);
        assertEquals(board1.posiciones(1, 0),1);
    }
    
    @Test
    public void rotarIzquierdaPiezaEnElBoard_Test(){
        Board board1 = new Board();
        PieceBase testPiece = new PieceT();
        board1.piezaAleatoria = testPiece;
        board1.piezaAleatoriaColumn = 0; 
        board1.agregarPiezasEnElBoard();
        assertEquals(board1.posiciones(0, 0),1);
        assertEquals(board1.posiciones(0, 1),1);
        assertEquals(board1.posiciones(0, 2),1);
        assertEquals(board1.posiciones(1, 1),1);
        board1.rotarPiezaIzquierda();
        assertEquals(board1.posiciones(0, 1),1);
        assertEquals(board1.posiciones(1, 1),1);
        assertEquals(board1.posiciones(2, 1),1);
        assertEquals(board1.posiciones(1, 2),1);
    }
    
    @Test
    public void moverPiezaHaciaAbajo_Test(){
        Board board1 = new Board();
        PieceBase testPiece = new PieceSquare();
        board1.piezaAleatoria = testPiece;
        board1.piezaAleatoriaColumn = 0; 
        board1.agregarPiezasEnElBoard();
        board1.moverPiezaAbajo();
        assertEquals(board1.posiciones(1, 0),1);
        assertEquals(board1.posiciones(1, 1),1);
        assertEquals(board1.posiciones(2, 0),1);
        assertEquals(board1.posiciones(2, 1),1);
        board1.moverPiezaAbajo();
        assertEquals(board1.posiciones(2, 0),1);
        assertEquals(board1.posiciones(2, 1),1);
        assertEquals(board1.posiciones(3, 0),1);
        assertEquals(board1.posiciones(3, 1),1);
    }
    
    @Test
    public void moverHaciaAbajoYRotarPieza_Test(){
        Board board1 = new Board();
        board1.indiceAleatorioPiezas = 1;
        board1.piezaAleatoriaColumn = 0;
        board1.indiceAleatorioNumeroRotaciones = 0;
        board1.generateNewPiece();
        board1.agregarPiezasEnElBoard();
        board1.moverPiezaAbajo();
        assertEquals(board1.posiciones(1, 0),1);
        assertEquals(board1.posiciones(1, 1),1);
        assertEquals(board1.posiciones(1, 2),1);
        assertEquals(board1.posiciones(1, 3),1);
        board1.rotarPiezaDerecha();
        assertEquals(board1.posiciones(1, 2),1);
        assertEquals(board1.posiciones(2, 2),1);
        assertEquals(board1.posiciones(3, 2),1);
        assertEquals(board1.posiciones(4, 2),1);
        board1.moverPiezaAbajo();
        assertEquals(board1.posiciones(2, 2),1);
        assertEquals(board1.posiciones(3, 2),1);
        assertEquals(board1.posiciones(4, 2),1);
        assertEquals(board1.posiciones(5, 2),1);
        board1.rotarPiezaIzquierda();
        assertEquals(board1.posiciones(2, 0),1);
        assertEquals(board1.posiciones(2, 1),1);
        assertEquals(board1.posiciones(2, 2),1);
        assertEquals(board1.posiciones(2, 3),1);
        board1.moverPiezaAbajo();
        assertEquals(board1.posiciones(3, 0),1);
        assertEquals(board1.posiciones(3, 1),1);
        assertEquals(board1.posiciones(3, 2),1);
        assertEquals(board1.posiciones(3, 3),1);
    }
    
    @Test
    public void alMoverHaciaAbajoSuperaLosLimitesDelBoard_Test(){
        Board board = new Board();
        board.indiceAleatorioPiezas = 0;
        board.piezaAleatoriaColumn = 0;
        board.generateNewPiece();
        board.agregarPiezasEnElBoard();
        for(int i = 0; i <22; i++){
            board.moverPiezaAbajo();
        }
        assertEquals(board.posiciones(18, 0),1);
        assertEquals(board.posiciones(19, 1),1);
    }
    
    @Test
    public void alMoverHaciaAbajoLasPiezasSeSuperponen_Test(){
        Board board = new Board();
        board.indiceAleatorioPiezas = 0;
        board.piezaAleatoriaColumn = 0;
        board.generateNewPiece();
        board.agregarPiezasEnElBoard();
        for(int i = 0; i <18; i++){
            board.moverPiezaAbajo();
        }
        board.generateNewPiece();
        board.agregarPiezasEnElBoard();
        for(int i = 0; i <18; i++){
            board.moverPiezaAbajo();
        }
        assertEquals(board.posiciones(16, 0),1);
        assertEquals(board.posiciones(17, 1),1);
        assertEquals(board.posiciones(18, 0),1);
        assertEquals(board.posiciones(19, 1),1);
    }
    
    @Test
    public void alRotarDerechaSuperaLosLimitesDelTablero_Test(){
        Board board = new Board();
        board.indiceAleatorioPiezas = 1;
        board.piezaAleatoriaColumn = 0;
        board.indiceAleatorioNumeroRotaciones = 0;
        board.generateNewPiece();
        board.agregarPiezasEnElBoard();
        for(int i = 0; i<19; i++){
        board.moverPiezaAbajo();
        }
        board.rotarPiezaDerecha();
        assertEquals(board.posiciones(19, 0),1);
        assertEquals(board.posiciones(19, 1),1);
        assertEquals(board.posiciones(19, 2),1);
        assertEquals(board.posiciones(19, 3),1);
    }
    
    @Test
    public void alRotarIzquierdaSuperaLosLimitesDelTablero_Test(){
        Board board = new Board();
        board.indiceAleatorioPiezas = 1;
        board.piezaAleatoriaColumn = 0;
        board.indiceAleatorioNumeroRotaciones = 0;
        board.generateNewPiece();
        board.agregarPiezasEnElBoard();
        for(int i = 0; i<19; i++){
        board.moverPiezaAbajo();
        }
        board.rotarPiezaDerecha();
        assertEquals(board.posiciones(19, 0),1);
        assertEquals(board.posiciones(19, 1),1);
        assertEquals(board.posiciones(19, 2),1);
        assertEquals(board.posiciones(19, 3),1);
    }
    
    @Test
    public void alRotarDerechaLasPiezasSeSuperponen_Test(){
        Board board = new Board();
        board.indiceAleatorioPiezas = 1;
        board.piezaAleatoriaColumn = 0;
        board.indiceAleatorioNumeroRotaciones = 0;
        board.generateNewPiece();
        board.agregarPiezasEnElBoard();
        for(int i = 0; i<19; i++){
        board.moverPiezaAbajo();
        }
        board.generateNewPiece();
        board.agregarPiezasEnElBoard();
        for(int i = 0; i<18; i++){
        board.moverPiezaAbajo();
        }
        board.generateNewPiece();
        board.agregarPiezasEnElBoard();
        for(int i = 0; i<17; i++){
        board.moverPiezaAbajo();
        }
        board.generateNewPiece();
        board.agregarPiezasEnElBoard();
        for(int i = 0; i<16; i++){
        board.moverPiezaAbajo();
        }
        board.rotarPiezaDerecha();
        assertEquals(board.posiciones(16, 0),1);
        assertEquals(board.posiciones(16, 1),1);
        assertEquals(board.posiciones(16, 2),1);
        assertEquals(board.posiciones(16, 3),1);
    }
    
    @Test
    public void alRotarIzquierdaLasPiezasSeSuperponen_Test(){
        Board board = new Board();
        board.indiceAleatorioPiezas = 1;
        board.piezaAleatoriaColumn = 0;
        board.indiceAleatorioNumeroRotaciones = 0;
        board.generateNewPiece();
        board.agregarPiezasEnElBoard();
        for(int i = 0; i<19; i++){
        board.moverPiezaAbajo();
        }
        board.generateNewPiece();
        board.agregarPiezasEnElBoard();
        for(int i = 0; i<18; i++){
        board.moverPiezaAbajo();
        }
        board.generateNewPiece();
        board.agregarPiezasEnElBoard();
        for(int i = 0; i<17; i++){
        board.moverPiezaAbajo();
        }
        board.generateNewPiece();
        board.agregarPiezasEnElBoard();
        for(int i = 0; i<16; i++){
        board.moverPiezaAbajo();
        }
        board.rotarPiezaIzquierda();
        assertEquals(board.posiciones(16, 0),1);
        assertEquals(board.posiciones(16, 1),1);
        assertEquals(board.posiciones(16, 2),1);
        assertEquals(board.posiciones(16, 3),1);
    }
    
    @Test
    public void borrarLineTetris_Test(){
        Board board1 = new Board();
            board1.indiceAleatorioPiezas = 0;
            board1.piezaAleatoriaColumn = 0;
            board1.generateNewPiece();
            board1.agregarPiezasEnElBoard();
            for(int i = 0; i < 18; i++){
                board1.moverPiezaAbajo();
            }
    
            board1.indiceAleatorioPiezas = 0;
            board1.piezaAleatoriaColumn = 2;
            board1.generateNewPiece();
            board1.agregarPiezasEnElBoard();
            for(int j = 0; j < 18; j++){
                board1.moverPiezaAbajo();
            }
    
            board1.indiceAleatorioPiezas = 0;
            board1.piezaAleatoriaColumn = 4;
            board1.generateNewPiece();
            board1.agregarPiezasEnElBoard();
            for(int i = 0; i < 18; i++){
                board1.moverPiezaAbajo();
            }
    
            board1.indiceAleatorioPiezas = 0;
            board1.piezaAleatoriaColumn = 6;
            board1.generateNewPiece();
            board1.agregarPiezasEnElBoard();
            for(int j = 0; j < 18; j++){
                board1.moverPiezaAbajo();
            }
    
            board1.indiceAleatorioPiezas = 0;
            board1.piezaAleatoriaColumn = 8;
            board1.generateNewPiece();
            board1.agregarPiezasEnElBoard();
            for(int j = 0; j < 18; j++){
                board1.moverPiezaAbajo();
            }
    
            for(int i = 18 ; i < 20 ;i ++){
            for(int j = 0 ; j < 10 ; j++){
                assertEquals(board1.posiciones(i,j), 1);  
            }
        }
            board1.lineCount();
    
            for(int i = 18 ; i < 20 ;i ++){
            for(int j = 0 ; j < 10 ; j++){
                assertEquals(board1.posiciones(i,j), 0);  
            }
        }
    }
    
    @Test
    public void ganarJuegoEnElBoard_Test(){
        Board board1 = new Board();
            board1.indiceAleatorioPiezas = 0;
            board1.piezaAleatoriaColumn = 0;
            board1.generateNewPiece();
            board1.agregarPiezasEnElBoard();
            for(int i = 0; i < 18; i++){
                board1.moverPiezaAbajo();
            }
            board1.indiceAleatorioPiezas = 0;
            board1.piezaAleatoriaColumn = 2;
            board1.generateNewPiece();
            board1.agregarPiezasEnElBoard();
            for(int j = 0; j < 18; j++){
                board1.moverPiezaAbajo();
            }
            board1.indiceAleatorioPiezas = 0;
            board1.piezaAleatoriaColumn = 4;
            board1.generateNewPiece();
            board1.agregarPiezasEnElBoard();
            for(int i = 0; i < 18; i++){
                board1.moverPiezaAbajo();
            }
            board1.indiceAleatorioPiezas = 0;
            board1.piezaAleatoriaColumn = 6;
            board1.generateNewPiece();
            board1.agregarPiezasEnElBoard();
            for(int j = 0; j < 18; j++){
                board1.moverPiezaAbajo();
            }
    
            board1.indiceAleatorioPiezas = 0;
            board1.piezaAleatoriaColumn = 8;
            board1.generateNewPiece();
            board1.agregarPiezasEnElBoard();
            for(int j = 0; j < 18; j++){
                board1.moverPiezaAbajo();
            }
            board1.indiceAleatorioPiezas = 0;
            board1.piezaAleatoriaColumn = 0;
            board1.generateNewPiece();
            board1.agregarPiezasEnElBoard();
            for(int i = 0; i < 16; i++){
                board1.moverPiezaAbajo();
            }
    
            board1.indiceAleatorioPiezas = 0;
            board1.piezaAleatoriaColumn = 2;
            board1.generateNewPiece();
            board1.agregarPiezasEnElBoard();
            for(int j = 0; j < 16; j++){
                board1.moverPiezaAbajo();
            }
    
            board1.indiceAleatorioPiezas = 0;
            board1.piezaAleatoriaColumn = 4;
            board1.generateNewPiece();
            board1.agregarPiezasEnElBoard();
            for(int i = 0; i < 16; i++){
                board1.moverPiezaAbajo();
            }
    
            board1.indiceAleatorioPiezas = 0;
            board1.piezaAleatoriaColumn = 6;
            board1.generateNewPiece();
            board1.agregarPiezasEnElBoard();
            for(int j = 0; j < 16; j++){
                board1.moverPiezaAbajo();
            }
    
            board1.indiceAleatorioPiezas = 0;
            board1.piezaAleatoriaColumn = 8;
            board1.generateNewPiece();
            board1.agregarPiezasEnElBoard();
            for(int j = 0; j < 16; j++){
                board1.moverPiezaAbajo();
            }
    
            board1.indiceAleatorioPiezas = 0;
            board1.piezaAleatoriaColumn = 0;
            board1.generateNewPiece();
            board1.agregarPiezasEnElBoard();
            for(int i = 0; i < 14; i++){
                board1.moverPiezaAbajo();
            }
    
            board1.indiceAleatorioPiezas = 0;
            board1.piezaAleatoriaColumn = 2;
            board1.generateNewPiece();
            board1.agregarPiezasEnElBoard();
            for(int j = 0; j < 14; j++){
                board1.moverPiezaAbajo();
            }
    
            board1.indiceAleatorioPiezas = 0;
            board1.piezaAleatoriaColumn = 4;
            board1.generateNewPiece();
            board1.agregarPiezasEnElBoard();
            for(int i = 0; i < 14; i++){
                board1.moverPiezaAbajo();
            }
            board1.indiceAleatorioPiezas = 0;
            board1.piezaAleatoriaColumn = 6;
            board1.generateNewPiece();
            board1.agregarPiezasEnElBoard();
            for(int j = 0; j < 14; j++){
                board1.moverPiezaAbajo();
            }
    
            board1.indiceAleatorioPiezas = 0;
            board1.piezaAleatoriaColumn = 8;
            board1.generateNewPiece();
            board1.agregarPiezasEnElBoard();
            for(int j = 0; j < 14; j++){
                board1.moverPiezaAbajo();
            }
    
            while (board1.juegoTerminado() == 2){
            board1.piezaAleatoriaColumn = 0;
            board1.moverPiezaAbajo();
            board1.lineCount();
        }
        assertEquals(board1.juegoTerminado(), 1);
    }
}
