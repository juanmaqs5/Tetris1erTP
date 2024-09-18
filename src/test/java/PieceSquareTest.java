import static org.junit.Assert.*;

import org.junit.Test;

import com.ucp.tetris.PieceSquare;

public class PieceSquareTest {
  @Test
    public void PieceSquare_Test(){
        PieceSquare pieceCuadrado = new PieceSquare();
        assertEquals(pieceCuadrado.posiciones(0, 0),1);
        assertEquals(pieceCuadrado.posiciones(0, 1),1);
        assertEquals(pieceCuadrado.posiciones(1, 0),1);
        assertEquals(pieceCuadrado.posiciones(1, 1),1);

        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==0 && j==0 || i==0 && j==1 || i==1 && j==0 ||i==1 && j==1){
                continue;
            }
            assertEquals(pieceCuadrado.posiciones(i,j), 0);  
            }
        }
    }
}
