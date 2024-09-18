import static org.junit.Assert.*;

import org.junit.Test;

import com.ucp.tetris.PieceT;

public class PieceTTest {
 @Test
    public void PieceT_Test(){
        PieceT pieceT = new PieceT();
        assertEquals(1,pieceT.posiciones(0, 0));
        assertEquals(1,pieceT.posiciones(0, 1));
        assertEquals(1,pieceT.posiciones(0, 2));
        assertEquals(1,pieceT.posiciones(1, 1));

        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==0 && j==0 || i==0 && j==1 || i==0 && j==2 ||i==1 && j==1){
                    continue;
                }
                assertEquals(pieceT.posiciones(i,j), 0);  
            }
        }
    }
}
