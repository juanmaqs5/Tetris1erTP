import static org.junit.Assert.*;

import org.junit.Test;

import com.ucp.tetris.PieceBase;
import com.ucp.tetris.PieceDog;

public class PieceDogTest {

    @Test
    public void PieceDogRight_Test(){
        PieceDog pieceDog = new PieceDog();
        assertEquals(1,pieceDog.posiciones(1, 0));
        assertEquals(1,pieceDog.posiciones(1, 1));
        assertEquals(1,pieceDog.posiciones(0, 1));
        assertEquals(1,pieceDog.posiciones(0, 2));

        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==1 && j==0 || i==1 && j==1 || i==0 && j==1 ||i==0 && j==2){
                    continue;
                }
                assertEquals(pieceDog.posiciones(i,j), 0);  
            }
    }
}

    @Test
    public void Posiciones_Test(){
        PieceBase pieceDog = new PieceDog();
        pieceDog.posiciones(0, 0);
        assertEquals(pieceDog.posiciones(0, 0), 0);
    }

    @Test
    public void PieceDogLeft_Test(){
        PieceDog pieceDog = new PieceDog(0);
        assertEquals(1,pieceDog.posiciones(0, 0));
        assertEquals(1,pieceDog.posiciones(0, 1));
        assertEquals(1,pieceDog.posiciones(1, 1));
        assertEquals(1,pieceDog.posiciones(1, 2));

        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==0 && j==0 || i==0 && j==1 || i==1 && j==1 ||i==1 && j==2){
                    continue;
                }
                assertEquals(pieceDog.posiciones(i,j), 0); 
    }
}
}
}
