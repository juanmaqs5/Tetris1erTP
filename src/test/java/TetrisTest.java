import static org.junit.Assert.*;

import java.util.function.Predicate;

import org.junit.Test;

import com.ucp.tetris.Board;
import com.ucp.tetris.PieceBase;
import com.ucp.tetris.Tetris;

public class TetrisTest {
        @Test
       public void create_Tetris(){
           Tetris t = new Tetris();
           assertNotNull(t);
       }
       
        @Test
    public void startTetris_Test(){
        Tetris tetris = new Tetris();
        Tetris tetris1 = new Tetris();
        tetris.start();
        tetris1.start();
        assertNotEquals(tetris, tetris1);
    }

    @Test
    public void tickMoverHaciaAbajoTetris_Test() {
        Tetris tetris = new Tetris();
        tetris.start();
        int filaInicial = tetris.board.pieceFila;
        int columnaInicial = tetris.board.piezaAleatoriaColumn;
        tetris.tick();
        int filaDespués = tetris.board.pieceFila;
        int columnaDespués = tetris.board.piezaAleatoriaColumn;
        assertEquals(filaInicial + 1, filaDespués);
        assertEquals(columnaInicial, columnaDespués);
    }

    @Test
    public void tickCountTetris_Test(){
        Tetris tetris = new Tetris();
        tetris.start();
        tetris.tick();
        tetris.tick();
        tetris.tick();
        assertEquals(tetris.tick(),3);
    }

    @Test
    public void rotarDerechaTetris_Test(){
        Tetris tetris = new Tetris();
        tetris.board.piezaAleatoriaColumn = 0;
        tetris.board.indiceAleatorioPiezas = 1;
        tetris.board.indiceAleatorioNumeroRotaciones = 0;
        tetris.start();
        assertEquals(1,tetris.board.posiciones(1, 0));
        assertEquals(1,tetris.board.posiciones(1, 1));
        assertEquals(1,tetris.board.posiciones(1, 2));
        assertEquals(1,tetris.board.posiciones(1, 3));
        tetris.rotateRight();
        assertEquals(1,tetris.board.posiciones(1, 2));
        assertEquals(1,tetris.board.posiciones(2, 2));
        assertEquals(1,tetris.board.posiciones(3, 2));
        assertEquals(1,tetris.board.posiciones(4, 2));
    }

    @Test
    public void rotarIzquierdaTetris_Test(){
        Tetris tetris = new Tetris();
        tetris.board.piezaAleatoriaColumn = 0;
        tetris.board.indiceAleatorioPiezas = 1;
        tetris.board.indiceAleatorioNumeroRotaciones = 0;
        tetris.start();
        assertEquals(1,tetris.board.posiciones(1, 0));
        assertEquals(1,tetris.board.posiciones(1, 1));
        assertEquals(1,tetris.board.posiciones(1, 2));
        assertEquals(1,tetris.board.posiciones(1, 3));
        tetris.rotateLeft();
        assertEquals(1,tetris.board.posiciones(1, 1));
        assertEquals(1,tetris.board.posiciones(2, 1));
        assertEquals(1,tetris.board.posiciones(3, 1));
        assertEquals(1,tetris.board.posiciones(4, 1));
    }

    @Test
    public void ganarJuegoTetris_Test(){
        Tetris tetris = new Tetris();
    tetris.board.piezaAleatoriaColumn = 0;
    tetris.board.indiceAleatorioPiezas = 0;
    tetris.start();
    for(int i = 0; i < 18; i++){
    tetris.tick();
    }
    tetris.board.piezaAleatoriaColumn = 2;
    for(int i = 0; i < 18; i++){
    tetris.tick();
    }
    tetris.board.piezaAleatoriaColumn = 4;
    for(int i = 0; i < 1; i++){
    tetris.tick();
    }tetris.board.piezaAleatoriaColumn = 6;
    for(int i = 0; i < 18; i++){
    tetris.tick();
    }
    tetris.board.piezaAleatoriaColumn = 8;
    for(int i = 0; i < 1; i++){
    tetris.tick();
    }
    tetris.board.piezaAleatoriaColumn = 0;
    for(int i = 0; i < 16; i++){
    tetris.tick();
    }
    tetris.board.piezaAleatoriaColumn = 2;
    for(int i = 0; i < 1; i++){
    tetris.tick();
    }
    tetris.board.piezaAleatoriaColumn = 4;
    for(int i = 0; i < 16; i++){
    tetris.tick();
    }tetris.board.piezaAleatoriaColumn = 6;
    for(int i = 0; i < 1; i++){
    tetris.tick();
    }
    tetris.board.piezaAleatoriaColumn = 8;
    for(int i = 0; i < 16; i++){
    tetris.tick();
    }
    tetris.board.piezaAleatoriaColumn = 0;
    for(int i = 0; i < 15; i++){
    tetris.tick();
    }
    tetris.board.piezaAleatoriaColumn = 2;
    for(int i = 0; i < 1; i++){
    tetris.tick();
    }
    tetris.board.piezaAleatoriaColumn = 4;
    for(int i = 0; i < 14; i++){
    tetris.tick();
    }tetris.board.piezaAleatoriaColumn = 6;
    for(int i = 0; i < 1; i++){
    tetris.tick();
    }
    tetris.board.piezaAleatoriaColumn = 8;
    for(int i = 0; i < 14; i++){
    tetris.tick();
    }
    assertEquals(tetris.state(), 1);
    }

    @Test
    public void canContinue_Test(){
        Tetris tetris = new Tetris();
        tetris.start();
        tetris.tick();
        tetris.tick();
        tetris.tick();
        assertEquals(tetris.state(), 2);
    }

    @Test
    public void perderJuegoTetris_Test(){
        Tetris tetris = new Tetris();
        tetris.start();
        while(tetris.state() == 2){
        tetris.tick();
        }
        assertEquals(tetris.state(), 0);
    }

    @Test
    public void requerimientoFuncional_Test(){
        Board board1 = new Board();
        board1.indiceAleatorioPiezas = 2;
        board1.indiceAleatorioDireccionRotar = 1;
        board1.indiceAleatorioNumeroRotaciones = 1;
        for(int i=0; i < 100; i++){
            board1.generateNewPiece();
        }
        Predicate<PieceBase> h = f->f.getClass().getSimpleName().contains("PieceT");
        long result = board1.listaObjetos.stream().filter(h).count();
        assertEquals(result, 100);
        Predicate<PieceBase> h1 = f->f.piezasDelLadoDerecho();
        long result1 = board1.listaObjetos.stream().filter(h1).count();
        assertTrue(result1>0);

}
}