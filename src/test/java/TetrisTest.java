import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.function.Predicate;
import org.junit.Test;

import com.ucp.tetris.Board;
import com.ucp.tetris.PieceBase;
import com.ucp.tetris.PieceDog;
import com.ucp.tetris.PieceL;
import com.ucp.tetris.PieceSquare;
import com.ucp.tetris.PieceStick;
import com.ucp.tetris.PieceT;
import com.ucp.tetris.Tetris;


public class TetrisTest {
     @Test
    public void create_Tetris(){
        Tetris t = new Tetris();
        assertNotNull(t);
    }

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

    @Test
    public void rotarDerechaSquare_Test(){
        PieceSquare pieceSquare = new PieceSquare();
        pieceSquare.rotarDerecha();
        assertEquals(1,pieceSquare.posiciones(0, 0));
        assertEquals(1,pieceSquare.posiciones(0, 1));
        assertEquals(1,pieceSquare.posiciones(1, 0));
        assertEquals(1,pieceSquare.posiciones(1, 1));

        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==0 && j==0 || i==0 && j==1 || i==1 && j==1 ||i==1 && j==0){
                    continue;
                }
                assertEquals(pieceSquare.posiciones(i,j), 0); 
    }
}
}

    @Test
    public void rotarIzquierdaSquare_Test(){
        PieceSquare pieceSquare = new PieceSquare();
        pieceSquare.rotarIzquierda();
        assertEquals(1,pieceSquare.posiciones(0, 0));
        assertEquals(1,pieceSquare.posiciones(0, 1));
        assertEquals(1,pieceSquare.posiciones(1, 0));
        assertEquals(1,pieceSquare.posiciones(1, 1));

        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==0 && j==0 || i==0 && j==1 || i==1 && j==0 ||i==1 && j==1){
                    continue;
                }
                assertEquals(pieceSquare.posiciones(i,j), 0); 
    }
}
}

    @Test
    public void RotarDerechaStick_Test(){
        PieceStick palo = new PieceStick();
        palo.rotarDerecha();
        assertEquals(1,palo.posiciones(0, 2));
        assertEquals(1,palo.posiciones(1, 2));
        assertEquals(1,palo.posiciones(2, 2));
        assertEquals(1,palo.posiciones(3, 2));

        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==0 && j==2 || i==1 && j==2 || i==2 && j==2 ||i==3 && j==2){
                    continue;
                }
                assertEquals(palo.posiciones(i,j), 0); 
    }
}
}

  @Test
    public void RotarIzquierdaStick_Test(){
        PieceStick palo = new PieceStick();
        palo.rotarIzquierda();
        assertEquals(1,palo.posiciones(0, 1));
        assertEquals(1,palo.posiciones(1, 1));
        assertEquals(1,palo.posiciones(2, 1));
        assertEquals(1,palo.posiciones(3, 1));

        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==0 && j==1 || i==1 && j==1 || i==2 && j==1 ||i==3 && j==1){
                    continue;
                }
                assertEquals(palo.posiciones(i,j), 0); 
    }
}
}

    @Test
    public void RotarDerecha2VecesStick_Test(){
        PieceStick palo = new PieceStick();
        palo.rotarDerecha();
        palo.rotarDerecha();
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

    @Test
    public void RotarIquierda2VecesStick_Test(){
        PieceStick palo = new PieceStick();
        palo.rotarIzquierda();
        palo.rotarIzquierda();
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

    @Test
     public void rotarDerechaT_Test(){
        PieceT pieceT = new PieceT();
        pieceT.rotarDerecha();
        assertEquals(1,pieceT.posiciones(0, 1));
        assertEquals(1,pieceT.posiciones(1, 1));
        assertEquals(1,pieceT.posiciones(1, 0));
        assertEquals(1,pieceT.posiciones(2, 1));

        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==0 && j==1 || i==1 && j==1 || i==1 && j==0 ||i==2 && j==1){
                    continue;
                }
                assertEquals(pieceT.posiciones(i,j), 0);  
            }
        }
     }

    @Test
     public void rotarIzquierdaT_Test(){
        PieceT pieceT = new PieceT();
        pieceT.rotarIzquierda();
        assertEquals(1,pieceT.posiciones(0, 1));
        assertEquals(1,pieceT.posiciones(1, 1));
        assertEquals(1,pieceT.posiciones(1, 2));
        assertEquals(1,pieceT.posiciones(2, 1));

        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==0 && j==1 || i==1 && j==1 || i==1 && j==2 ||i==2 && j==1){
                    continue;
                }
                assertEquals(pieceT.posiciones(i,j), 0);  
            }
        }
     }
    
    @Test
     public void rotarDerecha2VecesT_Test(){
        PieceT pieceT = new PieceT();
        pieceT.rotarDerecha();
        pieceT.rotarDerecha();
        assertEquals(1,pieceT.posiciones(0, 1));
        assertEquals(1,pieceT.posiciones(1, 0));
        assertEquals(1,pieceT.posiciones(1, 1));
        assertEquals(1,pieceT.posiciones(1, 2));

        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==0 && j==1 || i==1 && j==0 || i==1 && j==1 ||i==1 && j==2){
                    continue;
                }
                assertEquals(pieceT.posiciones(i,j), 0);  
            }
        }
     }

     @Test
     public void rotarIzquierda2VecesT_Test(){
        PieceT pieceT = new PieceT();
        pieceT.rotarIzquierda();
        pieceT.rotarIzquierda();
        assertEquals(1,pieceT.posiciones(0, 1));
        assertEquals(1,pieceT.posiciones(1, 0));
        assertEquals(1,pieceT.posiciones(1, 1));
        assertEquals(1,pieceT.posiciones(1, 2));

        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==0 && j==1 || i==1 && j==0 || i==1 && j==1 ||i==1 && j==2){
                    continue;
                }
                assertEquals(pieceT.posiciones(i,j), 0);  
            }
        }
     }

     @Test
     public void rotarDerecha3VecesT_Test(){
        PieceT pieceT = new PieceT();
        pieceT.rotarDerecha();
        pieceT.rotarDerecha();
        pieceT.rotarDerecha();
        assertEquals(1,pieceT.posiciones(0, 1));
        assertEquals(1,pieceT.posiciones(1, 1));
        assertEquals(1,pieceT.posiciones(1, 2));
        assertEquals(1,pieceT.posiciones(2, 1));

        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==0 && j==1 || i==1 && j==1 || i==1 && j==2 ||i==2 && j==1){
                    continue;
                }
                assertEquals(pieceT.posiciones(i,j), 0);  
            }
        }
     }

    @Test
    public void rotarIzquierda3VecesT_Test(){
        PieceT pieceT = new PieceT();
        pieceT.rotarIzquierda();
        pieceT.rotarIzquierda();
        pieceT.rotarIzquierda();
        assertEquals(1,pieceT.posiciones(0, 1));
        assertEquals(1,pieceT.posiciones(1, 1));
        assertEquals(1,pieceT.posiciones(1, 0));
        assertEquals(1,pieceT.posiciones(2, 1));

        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==0 && j==1 || i==1 && j==1 || i==1 && j==0 ||i==2 && j==1){
                    continue;
                }
                assertEquals(pieceT.posiciones(i,j), 0);  
            }
        }
     }

          @Test
     public void rotarDerecha4VecesT_Test(){
        PieceT pieceT = new PieceT();
        pieceT.rotarDerecha();
        pieceT.rotarDerecha();
        pieceT.rotarDerecha();
        pieceT.rotarDerecha();
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

    @Test
    public void rotarIzquierda4VecesT_Test(){
        PieceT pieceT = new PieceT();
        pieceT.rotarIzquierda();
        pieceT.rotarIzquierda();
        pieceT.rotarIzquierda();
        pieceT.rotarIzquierda();
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
    @Test
    public void rotarDerechaPieceLRight_Test(){
        PieceL pieceL = new PieceL();
        pieceL.rotarDerecha();
        assertEquals(1,pieceL.posiciones(1, 0));
        assertEquals(1,pieceL.posiciones(1, 1));
        assertEquals(1,pieceL.posiciones(1, 2));
        assertEquals(1,pieceL.posiciones(2, 0));
        
        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==1 && j==0 || i==1 && j==1 || i==1 && j==2 ||i==2 && j==0){
                    continue;
                }
                assertEquals(pieceL.posiciones(i,j), 0);  
            }
        }
    }

    @Test
    public void rotarIzquierdaPieceLRight_Test(){
        PieceL pieceL = new PieceL();
        pieceL.rotarIzquierda();
        assertEquals(1,pieceL.posiciones(1, 0));
        assertEquals(1,pieceL.posiciones(1, 1));
        assertEquals(1,pieceL.posiciones(1, 2));
        assertEquals(1,pieceL.posiciones(0, 2));
        
        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==1 && j==0 || i==1 && j==1 || i==1 && j==2 ||i==0 && j==2){
                    continue;
                }
                assertEquals(pieceL.posiciones(i,j), 0);  
            }
        }
    }

    @Test
    public void rotarDerecha2VecesPieceLRight_Test(){
        PieceL pieceL = new PieceL();
        pieceL.rotarDerecha();
        pieceL.rotarDerecha();
        assertEquals(1,pieceL.posiciones(0, 0));
        assertEquals(1,pieceL.posiciones(0, 1));
        assertEquals(1,pieceL.posiciones(1, 1));
        assertEquals(1,pieceL.posiciones(2, 1));
        
        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==0 && j==0 || i==0 && j==1 || i==1 && j==1 ||i==2 && j==1){
                    continue;
                }
                assertEquals(pieceL.posiciones(i,j), 0);  
            }
        }
    }

    @Test
    public void rotarIzquierda2VecesPieceLRight_Test(){
        PieceL pieceL = new PieceL();
        pieceL.rotarIzquierda();
        pieceL.rotarIzquierda();
        assertEquals(1,pieceL.posiciones(0, 0));
        assertEquals(1,pieceL.posiciones(0, 1));
        assertEquals(1,pieceL.posiciones(1, 1));
        assertEquals(1,pieceL.posiciones(2, 1));
        
        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==0 && j==0 || i==0 && j==1 || i==1 && j==1 ||i==2 && j==1){
                    continue;
                }
                assertEquals(pieceL.posiciones(i,j), 0);  
            }
        }
    }

        @Test
        public void rotarDerecha3VecesLRight_Test(){
        PieceL pieceL = new PieceL();
        pieceL.rotarDerecha();
        pieceL.rotarDerecha();
        pieceL.rotarDerecha();
        assertEquals(1,pieceL.posiciones(1, 0));
        assertEquals(1,pieceL.posiciones(1, 1));
        assertEquals(1,pieceL.posiciones(1, 2));
        assertEquals(1,pieceL.posiciones(0, 2));
        
        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==1 && j==0 || i==1 && j==1 || i==1 && j==2 ||i==0 && j==2){
                    continue;
                }
                assertEquals(pieceL.posiciones(i,j), 0);  
            }
        }
}
    @Test
        public void rotarIzquierda3VecesLRight_Test(){
        PieceL pieceL = new PieceL();
        pieceL.rotarIzquierda();
        pieceL.rotarIzquierda();
        pieceL.rotarIzquierda();
        assertEquals(1,pieceL.posiciones(1, 0));
        assertEquals(1,pieceL.posiciones(1, 1));
        assertEquals(1,pieceL.posiciones(1, 2));
        assertEquals(1,pieceL.posiciones(2, 0));
        
        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==1 && j==0 || i==1 && j==1 || i==1 && j==2 ||i==2 && j==0){
                    continue;
                }
                assertEquals(pieceL.posiciones(i,j), 0);  
            }
        }
}

    @Test
        public void rotarDerecha4VecesLRight_Test(){
        PieceL pieceL = new PieceL();
        pieceL.rotarDerecha();
        pieceL.rotarDerecha();
        pieceL.rotarDerecha();
        pieceL.rotarDerecha();
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

    @Test
        public void rotarIzquierda4VecesLRight_Test(){
        PieceL pieceL = new PieceL();
        pieceL.rotarIzquierda();
        pieceL.rotarIzquierda();
        pieceL.rotarIzquierda();
        pieceL.rotarIzquierda();
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

    @Test
    public void rotarDerechaPieceLLeft_Test(){
        PieceL pieceL = new PieceL(0);
        pieceL.rotarDerecha();
        assertEquals(1,pieceL.posiciones(0, 0));
        assertEquals(1,pieceL.posiciones(1, 0));
        assertEquals(1,pieceL.posiciones(1, 1));
        assertEquals(1,pieceL.posiciones(1, 2));
        
        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==0 && j==0 || i==1 && j==0 || i==1 && j==1 ||i==1 && j==2){
                    continue;
                }
                assertEquals(pieceL.posiciones(i,j), 0);  
            }
        }
    }

    @Test
    public void rotarIzquierdaPieceLLeft_Test(){
        PieceL pieceL = new PieceL(0);
        pieceL.rotarIzquierda();
        assertEquals(1,pieceL.posiciones(1, 0));
        assertEquals(1,pieceL.posiciones(1, 1));
        assertEquals(1,pieceL.posiciones(1, 2));
        assertEquals(1,pieceL.posiciones(2, 2));
        
        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==1 && j==0 || i==1 && j==1 || i==1 && j==2 ||i==2 && j==2){
                    continue;
                }
                assertEquals(pieceL.posiciones(i,j), 0);  
            }
        }
    }

    @Test
    public void rotarDerecha2VecesPieceLLeft_Test(){
        PieceL pieceL = new PieceL(0);
        pieceL.rotarDerecha();
        pieceL.rotarDerecha();
        assertEquals(1,pieceL.posiciones(0, 1));
        assertEquals(1,pieceL.posiciones(0, 2));
        assertEquals(1,pieceL.posiciones(1, 1));
        assertEquals(1,pieceL.posiciones(2, 1));
        
        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==0 && j==1 || i==0 && j==2 || i==1 && j==1 ||i==2 && j==1){
                    continue;
                }
                assertEquals(pieceL.posiciones(i,j), 0);  
            }
        }
    }

    @Test
    public void rotarIzquierda2VecesPieceLLeft_Test(){
        PieceL pieceL = new PieceL(0);
        pieceL.rotarIzquierda();
        pieceL.rotarIzquierda();
        assertEquals(1,pieceL.posiciones(0, 1));
        assertEquals(1,pieceL.posiciones(0, 2));
        assertEquals(1,pieceL.posiciones(1, 1));
        assertEquals(1,pieceL.posiciones(2, 1));
        
        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==0 && j==1 || i==0 && j==2 || i==1 && j==1 ||i==2 && j==1){
                    continue;
                }
                assertEquals(pieceL.posiciones(i,j), 0);  
            }
        }
    }

        @Test
        public void rotarDerecha3VecesLLeft_Test(){
        PieceL pieceL = new PieceL(0);
        pieceL.rotarDerecha();
        pieceL.rotarDerecha();
        pieceL.rotarDerecha();
        assertEquals(1,pieceL.posiciones(1, 0));
        assertEquals(1,pieceL.posiciones(1, 1));
        assertEquals(1,pieceL.posiciones(1, 2));
        assertEquals(1,pieceL.posiciones(2, 2));
        
        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==1 && j==0 || i==1 && j==1 || i==1 && j==2 ||i==2 && j==2){
                    continue;
                }
                assertEquals(pieceL.posiciones(i,j), 0);  
            }
        }
}

    @Test
    public void rotarIzquierda3VecesPieceLLeft_Test(){
        PieceL pieceL = new PieceL(0);
        pieceL.rotarIzquierda();
        pieceL.rotarIzquierda();
        pieceL.rotarIzquierda();
        assertEquals(1,pieceL.posiciones(0, 0));
        assertEquals(1,pieceL.posiciones(1, 0));
        assertEquals(1,pieceL.posiciones(1, 1));
        assertEquals(1,pieceL.posiciones(1, 2));
        
        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==0 && j==0 || i==1 && j==0 || i==1 && j==1 ||i==1 && j==2){
                    continue;
                }
                assertEquals(pieceL.posiciones(i,j), 0);  
            }
        }
    }

    @Test
        public void rotarDerecha4VecesLLeft_Test(){
        PieceL pieceL = new PieceL(0);
        pieceL.rotarDerecha();
        pieceL.rotarDerecha();
        pieceL.rotarDerecha();
        pieceL.rotarDerecha();
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

    @Test
        public void rotarIzquierda4VecesLLeft_Test(){
        PieceL pieceL = new PieceL(0);
        pieceL.rotarIzquierda();
        pieceL.rotarIzquierda();
        pieceL.rotarIzquierda();
        pieceL.rotarIzquierda();
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


    @Test
    public void rotarDerechaDogRight_Test(){
        PieceDog pieceDog = new PieceDog();
        pieceDog.rotarDerecha();
        assertEquals(1,pieceDog.posiciones(0, 1));
        assertEquals(1,pieceDog.posiciones(1, 1));
        assertEquals(1,pieceDog.posiciones(1, 2));
        assertEquals(1,pieceDog.posiciones(2, 2));

        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==0 && j==1 || i==1 && j==1 || i==1 && j==2 ||i==2 && j==2){
                    continue;
                }
                assertEquals(pieceDog.posiciones(i,j), 0);  
            }
    }
}

    @Test
    public void rotarIzquierdaDogRight_Test(){
        PieceDog pieceDog = new PieceDog();
        pieceDog.rotarIzquierda();
        assertEquals(1,pieceDog.posiciones(0, 0));
        assertEquals(1,pieceDog.posiciones(1, 0));
        assertEquals(1,pieceDog.posiciones(1, 1));
        assertEquals(1,pieceDog.posiciones(2, 1));

        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==0 && j==0 || i==1 && j==0 || i==1 && j==1 ||i==2 && j==1){
                    continue;
                }
                assertEquals(pieceDog.posiciones(i,j), 0);  
            }
    }
}

    @Test
    public void rotarDerecha2VecesDogRight_Test(){
        PieceDog pieceDog = new PieceDog();
        pieceDog.rotarDerecha();
        pieceDog.rotarDerecha();
        assertEquals(1,pieceDog.posiciones(0, 1));
        assertEquals(1,pieceDog.posiciones(0, 2));
        assertEquals(1,pieceDog.posiciones(1, 1));
        assertEquals(1,pieceDog.posiciones(1, 0));

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
    public void rotarIzquierda2VecesDogRight_Test(){
        PieceDog pieceDog = new PieceDog(0);
        pieceDog.rotarIzquierda();
        pieceDog.rotarIzquierda();
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

    @Test
    public void rotarDerechaDogLeft_Test(){
        PieceDog pieceDog = new PieceDog(0);
        pieceDog.rotarDerecha();
        assertEquals(1,pieceDog.posiciones(0, 2));
        assertEquals(1,pieceDog.posiciones(1, 2));
        assertEquals(1,pieceDog.posiciones(1, 1));
        assertEquals(1,pieceDog.posiciones(2, 1));

        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==0 && j==2 || i==1 && j==2 || i==1 && j==1 ||i==2 && j==1){
                    continue;
                }
                assertEquals(pieceDog.posiciones(i,j), 0); 
    }
}
}


    @Test
    public void rotarIzquierdaDogLeft_Test(){
        PieceDog pieceDog = new PieceDog(0);
        pieceDog.rotarIzquierda();
        assertEquals(1,pieceDog.posiciones(0, 1));
        assertEquals(1,pieceDog.posiciones(1, 1));
        assertEquals(1,pieceDog.posiciones(1, 0));
        assertEquals(1,pieceDog.posiciones(2, 0));

        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==0 && j==1 || i==1 && j==1 || i==1 && j==0 ||i==2 && j==0){
                    continue;
                }
                assertEquals(pieceDog.posiciones(i,j), 0); 
    }
}
}

    @Test
    public void rotarDerecha2VecesDogLeft_Test(){
        PieceDog pieceDog = new PieceDog(0);
        pieceDog.rotarDerecha();
        pieceDog.rotarDerecha();
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

     @Test
    public void rotarIzquierda2VecesDogLeft_Test(){
        PieceDog pieceDog = new PieceDog(0);
        pieceDog.rotarIzquierda();
        pieceDog.rotarIzquierda();
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

@Test
public void rotarIzquierdaDogRightRotadoDerecha(){
    PieceDog pieceDog = new PieceDog();
    pieceDog.rotarDerecha();
    pieceDog.rotarIzquierda();
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
public void rotarIzquierdaDogLeftRotadoDerecha(){
    PieceDog pieceDog = new PieceDog(0);
    pieceDog.rotarDerecha();
    pieceDog.rotarIzquierda();
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

@Test
public void moverColumnaIzquierdaDogLeft_Test(){
   PieceDog pieceDog = new PieceDog(0);
   pieceDog.rotarDerecha();
   pieceDog.moverColumnaIzquierda();
   assertEquals(1,pieceDog.posiciones(0, 1));
   assertEquals(1,pieceDog.posiciones(1, 0));
   assertEquals(1,pieceDog.posiciones(1, 1));
   assertEquals(1,pieceDog.posiciones(2, 0));

   for(int i = 0 ; i < 4 ;i ++){
       for(int j = 0 ; j < 4 ; j++){
           if(i==0 && j==1 || i==1 && j==0 || i==1 && j==1 ||i==2 && j==0){
               continue;
           }
           assertEquals(pieceDog.posiciones(i,j), 0);  
       }

}
} 

@Test
public void moverColumnaIzquierdaDogRight_Test(){
   PieceDog pieceDog = new PieceDog();
   pieceDog.rotarDerecha();
   pieceDog.moverColumnaIzquierda();
   assertEquals(1,pieceDog.posiciones(0, 0));
   assertEquals(1,pieceDog.posiciones(1, 0));
   assertEquals(1,pieceDog.posiciones(1, 1));
   assertEquals(1,pieceDog.posiciones(2, 1));

   for(int i = 0 ; i < 4 ;i ++){
       for(int j = 0 ; j < 4 ; j++){
           if(i==0 && j==0 || i==1 && j==0 || i==1 && j==1 ||i==2 && j==1){
               continue;
           }
           assertEquals(pieceDog.posiciones(i,j), 0);  
       }
}
}

@Test
public void rotarDerechaDogRightColumna0_test(){
   PieceDog pieceDog = new PieceDog();
   pieceDog.rotarDerecha();
   pieceDog.moverColumnaIzquierda();
   pieceDog.rotarDerecha();
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
public void rotarIzquierdaDogRightColumna0_test(){
   PieceDog pieceDog = new PieceDog();
   pieceDog.rotarDerecha();
   pieceDog.moverColumnaIzquierda();
   pieceDog.rotarIzquierda();
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
public void rotarDerechaDogLeftColumna0_test(){
   PieceDog pieceDog = new PieceDog(0);
   pieceDog.rotarDerecha();
   pieceDog.moverColumnaIzquierda();
   pieceDog.rotarDerecha();
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

@Test
public void rotarIzquierdaDogLeftColumna0_test(){
   PieceDog pieceDog = new PieceDog(0);
   pieceDog.rotarDerecha();
   pieceDog.moverColumnaIzquierda();
   pieceDog.rotarIzquierda();
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

@Test
public void moverColumnaIzquierdaLLeft_Test(){
   PieceL pieceL = new PieceL(0);
   pieceL.rotarDerecha();
   pieceL.rotarDerecha();
   pieceL.moverColumnaIzquierda();
   assertEquals(1,pieceL.posiciones(0, 0));
   assertEquals(1,pieceL.posiciones(1, 0));
   assertEquals(1,pieceL.posiciones(0, 1));
   assertEquals(1,pieceL.posiciones(2, 0));

   for(int i = 0 ; i < 4 ;i ++){
       for(int j = 0 ; j < 4 ; j++){
           if(i==0 && j==0 || i==1 && j==0 || i==0 && j==1 ||i==2 && j==0){
               continue;
           }
           assertEquals(pieceL.posiciones(i,j), 0);  
       }
}
}

@Test
public void rotarDerechaLLeftColumna0_Test(){
   PieceL pieceL = new PieceL(0);
   pieceL.rotarDerecha();
   pieceL.rotarDerecha();
   pieceL.moverColumnaIzquierda();
   pieceL.rotarDerecha();
   assertEquals(1,pieceL.posiciones(1, 0));
   assertEquals(1,pieceL.posiciones(1, 1));
   assertEquals(1,pieceL.posiciones(1, 2));
   assertEquals(1,pieceL.posiciones(2, 2));

   for(int i = 0 ; i < 4 ;i ++){
       for(int j = 0 ; j < 4 ; j++){
           if(i==1 && j==0 || i==1 && j==1 || i==1 && j==2 ||i==2 && j==2){
               continue;
           }
           assertEquals(pieceL.posiciones(i,j), 0);  
       }
    }
}

@Test
public void rotarIzquierdaLLeftColumna0_Test(){
    PieceL pieceL = new PieceL(0);
    pieceL.rotarDerecha();
    pieceL.rotarDerecha();
    pieceL.moverColumnaIzquierda();
    pieceL.rotarIzquierda();
    assertEquals(1,pieceL.posiciones(0, 0));
    assertEquals(1,pieceL.posiciones(1, 0));
    assertEquals(1,pieceL.posiciones(1, 1));
    assertEquals(1,pieceL.posiciones(1, 2));
        
        for(int i = 0 ; i < 4 ;i ++){
            for(int j = 0 ; j < 4 ; j++){
                if(i==0 && j==0 || i==1 && j==0 || i==1 && j==1 ||i==1 && j==2){
                    continue;
                }
                assertEquals(pieceL.posiciones(i,j), 0);  
            }
        }
}

@Test
public void moverColumnaIzquierdaStick_Test(){
   PieceStick pieceStick = new PieceStick();
   pieceStick.rotarDerecha();
   pieceStick.moverColumnaIzquierda();
   assertEquals(1,pieceStick.posiciones(0, 1));
   assertEquals(1,pieceStick.posiciones(1, 1));
   assertEquals(1,pieceStick.posiciones(2, 1));
   assertEquals(1,pieceStick.posiciones(3, 1));

   for(int i = 0 ; i < 4 ;i ++){
       for(int j = 0 ; j < 4 ; j++){
           if(i==0 && j==1 || i==1 && j==1 || i==2 && j==1 ||i==3 && j==1){
               continue;
           }
           assertEquals(pieceStick.posiciones(i,j), 0);  
       }
}
}

@Test
public void moverColumna2VecesIzquierdaStick_Test(){
   PieceStick pieceStick = new PieceStick();
   pieceStick.rotarDerecha();
   pieceStick.moverColumnaIzquierda();
    pieceStick.moverColumnaIzquierda();
   assertEquals(1,pieceStick.posiciones(0, 0));
   assertEquals(1,pieceStick.posiciones(1, 0));
   assertEquals(1,pieceStick.posiciones(2, 0));
   assertEquals(1,pieceStick.posiciones(3, 0));

   for(int i = 0 ; i < 4 ;i ++){
       for(int j = 0 ; j < 4 ; j++){
           if(i==0 && j==0 || i==1 && j==0 || i==2 && j==0 ||i==3 && j==0){
               continue;
           }
           assertEquals(pieceStick.posiciones(i,j), 0);  
       }
}
}


@Test
public void rotarIzquierdaStickDColuma1_Test(){
    PieceStick pieceStick = new PieceStick();
    pieceStick.rotarDerecha();
    pieceStick.moverColumnaIzquierda();
    pieceStick.rotarIzquierda();
       
    assertEquals(1,pieceStick.posiciones(0, 0));
    assertEquals(1,pieceStick.posiciones(0, 1));
    assertEquals(1,pieceStick.posiciones(0, 2));
    assertEquals(1,pieceStick.posiciones(0, 3));

    for(int i = 0 ; i < 4 ;i ++){
        for(int j = 0 ; j < 4 ; j++){
            if(i==0 && j==0 || i==0 && j==1 || i==0 && j==2 ||i==0 && j==3){
                continue;
            }
            assertEquals(pieceStick.posiciones(i,j), 0);  
        }
    }
}

@Test
public void rotarIzquierdaStickIColuma1_Test(){
    PieceStick pieceStick = new PieceStick();
    pieceStick.rotarIzquierda();
    pieceStick.moverColumnaIzquierda();
    pieceStick.rotarIzquierda();
       
    assertEquals(1,pieceStick.posiciones(0, 0));
    assertEquals(1,pieceStick.posiciones(0, 1));
    assertEquals(1,pieceStick.posiciones(0, 2));
    assertEquals(1,pieceStick.posiciones(0, 3));

    for(int i = 0 ; i < 4 ;i ++){
        for(int j = 0 ; j < 4 ; j++){
            if(i==0 && j==0 || i==0 && j==1 || i==0 && j==2 ||i==0 && j==3){
                continue;
            }
            assertEquals(pieceStick.posiciones(i,j), 0);  
        }
    }
}

@Test
public void rotarDerechaStickDColuma1_Test(){
   PieceStick pieceStick = new PieceStick();
   pieceStick.rotarDerecha();
   pieceStick.moverColumnaIzquierda();
   pieceStick.rotarDerecha();
  
   assertEquals(1,pieceStick.posiciones(0, 0));
   assertEquals(1,pieceStick.posiciones(0, 1));
   assertEquals(1,pieceStick.posiciones(0, 2));
   assertEquals(1,pieceStick.posiciones(0, 3));

   for(int i = 0 ; i < 4 ;i ++){
       for(int j = 0 ; j < 4 ; j++){
           if(i==0 && j==0 || i==0 && j==1 || i==0 && j==2 ||i==0 && j==3){
               continue;
           }
           assertEquals(pieceStick.posiciones(i,j), 0);  
       }
    }
}

@Test
public void rotarDerechaStickIColuma1_Test(){
   PieceStick pieceStick = new PieceStick();
   pieceStick.rotarIzquierda();
   pieceStick.moverColumnaIzquierda();
   pieceStick.rotarDerecha();
  
   assertEquals(1,pieceStick.posiciones(0, 0));
   assertEquals(1,pieceStick.posiciones(0, 1));
   assertEquals(1,pieceStick.posiciones(0, 2));
   assertEquals(1,pieceStick.posiciones(0, 3));

   for(int i = 0 ; i < 4 ;i ++){
       for(int j = 0 ; j < 4 ; j++){
           if(i==0 && j==0 || i==0 && j==1 || i==0 && j==2 ||i==0 && j==3){
               continue;
           }
           assertEquals(pieceStick.posiciones(i,j), 0);  
       }
    }
}

@Test
public void rotarIzquierdaStickColuma0_Test(){
    PieceStick pieceStick = new PieceStick();
    pieceStick.rotarDerecha();
    pieceStick.moverColumnaIzquierda();
    pieceStick.rotarIzquierda();
       
    assertEquals(1,pieceStick.posiciones(0, 0));
    assertEquals(1,pieceStick.posiciones(0, 1));
    assertEquals(1,pieceStick.posiciones(0, 2));
    assertEquals(1,pieceStick.posiciones(0, 3));

    for(int i = 0 ; i < 4 ;i ++){
        for(int j = 0 ; j < 4 ; j++){
            if(i==0 && j==0 || i==0 && j==1 || i==0 && j==2 ||i==0 && j==3){
                continue;
            }
            assertEquals(pieceStick.posiciones(i,j), 0);  
        }
    }
}

@Test
public void rotarDerechaStickColuma0_Test(){
   PieceStick pieceStick = new PieceStick();
   pieceStick.rotarDerecha();
   pieceStick.moverColumnaIzquierda();
   pieceStick.moverColumnaIzquierda();
   pieceStick.rotarDerecha();
  
   assertEquals(1,pieceStick.posiciones(0, 0));
   assertEquals(1,pieceStick.posiciones(0, 1));
   assertEquals(1,pieceStick.posiciones(0, 2));
   assertEquals(1,pieceStick.posiciones(0, 3));

   for(int i = 0 ; i < 4 ;i ++){
       for(int j = 0 ; j < 4 ; j++){
           if(i==0 && j==0 || i==0 && j==1 || i==0 && j==2 ||i==0 && j==3){
               continue;
           }
           assertEquals(pieceStick.posiciones(i,j), 0);  
       }
    }
}

@Test
public void moverColumaIzquierdaT_Test(){
   PieceT pieceT = new PieceT();
   pieceT.rotarIzquierda();
   pieceT.moverColumnaIzquierda();
  
   assertEquals(1,pieceT.posiciones(0, 0));
   assertEquals(1,pieceT.posiciones(1, 0));
   assertEquals(1,pieceT.posiciones(2, 0));
   assertEquals(1,pieceT.posiciones(1, 1));
   for(int i = 0 ; i < 4 ;i ++){
       for(int j = 0 ; j < 4 ; j++){
           if(i==0 && j==0 || i==1 && j==0 || i==2 && j==0 ||i==1 && j==1){
               continue;
           }
           assertEquals(pieceT.posiciones(i,j), 0);  
       }
    }
}

@Test
public void rotarDerechaTColumna0_Test(){
   PieceT pieceT = new PieceT();
   pieceT.rotarIzquierda();
   pieceT.moverColumnaIzquierda();
   pieceT.rotarDerecha();
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

@Test
public void rotarIzquierdaTColumna0_Test(){
   PieceT pieceT = new PieceT();
   pieceT.rotarIzquierda();
   pieceT.moverColumnaIzquierda();
   pieceT.rotarIzquierda();
   assertEquals(1,pieceT.posiciones(1, 0));
   assertEquals(1,pieceT.posiciones(1, 1));
   assertEquals(1,pieceT.posiciones(1, 2));
   assertEquals(1,pieceT.posiciones(0, 1));
   for(int i = 0 ; i < 4 ;i ++){
       for(int j = 0 ; j < 4 ; j++){
           if(i==0 && j==1 || i==1 && j==0 || i==1 && j==2 ||i==1 && j==1){
               continue;
           }
           assertEquals(pieceT.posiciones(i,j), 0);  
       }
    }
}

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