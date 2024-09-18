import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ucp.tetris.PieceDog;
import com.ucp.tetris.PieceL;
import com.ucp.tetris.PieceSquare;
import com.ucp.tetris.PieceStick;
import com.ucp.tetris.PieceT;

public class IRotatorTest { 

    @Before
    public void setUp() {
        new IRotatorTest(); 
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
}
