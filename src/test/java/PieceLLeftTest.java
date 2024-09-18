import static org.junit.Assert.*;

import org.junit.Test;

import com.ucp.tetris.PieceL;

public class PieceLLeftTest {
    @Test
    public void PieceLLeft_Test(){
        PieceL pieceL = new PieceL(0);       
        assertEquals(1,pieceL.posiciones(0, 1));
        assertEquals(1,pieceL.posiciones(1, 1));
        assertEquals(1,pieceL.posiciones(2, 1));
        assertEquals(1,pieceL.posiciones(2, 0));

        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==0 && j==1 || i==1 && j==1 || i==2 && j==1 ||i==2 && j==0){
                    continue;
                }
                assertEquals(pieceL.posiciones(i,j), 0);  
            }
        }
    }

}
