import static org.junit.Assert.*;

import org.junit.Test;

import com.ucp.tetris.PieceL;

public class PieceLRightTest {
  @Test
    public void PieceLRight_Test(){
        PieceL pieceL = new PieceL();
        assertEquals(1,pieceL.posiciones(0, 0));
        assertEquals(1,pieceL.posiciones(1, 0));
        assertEquals(1,pieceL.posiciones(2, 0));
        assertEquals(1,pieceL.posiciones(2, 1));
        
        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==0 && j==0 || i==1 && j==0 || i==2 && j==0 ||i==2 && j==1){
                    continue;
                }
                assertEquals(pieceL.posiciones(i,j), 0);  
            }
        }
    }

}
