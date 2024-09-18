import static org.junit.Assert.*;

import org.junit.Test;

import com.ucp.tetris.PieceStick;

public class PieceStickTest {
  @Test
    public void PieceStick_Test(){
        PieceStick palo = new PieceStick();
        assertEquals(1,palo.posiciones(0, 0));
        assertEquals(1,palo.posiciones(0, 1));
        assertEquals(1,palo.posiciones(0, 2));
        assertEquals(1,palo.posiciones(0, 3));

        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==0 && j==0 || i==0 && j==1 || i==0 && j==2 ||i==0 && j==3){
                    continue;
                }
                assertEquals(palo.posiciones(i,j), 0);  
            }
        }
    }
}
