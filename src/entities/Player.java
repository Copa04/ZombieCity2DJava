package entities;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import static utils.Constants.Directions.left;
import static utils.Constants.Directions.right;
import static utils.Constants.PlayerConstants.*;

public class Player extends Entity{

    private BufferedImage[][] animations;
    private int aniTick, aniIndex, aniSpeed = 10;
    private int playerAction = IDLE;
    private int playerDir = -1;
    private boolean moving = false;


    public Player(float x, float y) {
        super(x, y);
        loadAnimations();
    }

    public void update(){
        updateAnimationTic();
        setAnimation();
        updatePos();
    }
    public void render(Graphics g){
        g.drawImage(animations[playerAction][aniIndex], (int) x, (int) y, 128, 128, null);
    }

    public void setDirection(int direction){
        this.playerDir = direction;
        moving = true;
    }

    public void setMoving(boolean moving){
        this.moving = moving;
    }

    private void updateAnimationTic() {
        aniTick++;
        if(aniTick >= aniSpeed) {
            aniTick=0;
            aniIndex++;
            if(aniIndex >= GetSpriteAmmount(playerAction)) {
                aniIndex = 0;
            }
        }
    }

    private void setAnimation() {
        if(moving)
        {
            playerAction=RUNNING;
        }
        else playerAction=IDLE;
    }
    private void updatePos() {
        if(moving){
            switch(playerDir){
                case left:
                    x-=2;
                    break;
                case right:
                    x+=2;
                    break;
            }
        }
    }

//    private void loadAnimations() {
//       // InputStream is = getClass().getResourceAsStream("res/textures/Player_Sprite-Sheet.png");
//
//
//        try {
//        //    BufferedImage img = ImageIO.read(is);
//            BufferedImage img = ImageIO.read(new File("res/textures/Player_Sprite-Sheet.png"));
//            animations = new BufferedImage[2][15];     /// x = randuri, y = nr max coloane (15)
//
//            for(int j = 0; j< animations.length; j++)
//                for (int i = 0; i < animations[j].length; i++) {
//                    animations[j][i] = img.getSubimage(i * 128,j*128 , 128, 128);
//                }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                is.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//    }
    private void loadAnimations(){
        try{
          BufferedImage img = ImageIO.read(new File("res/textures/Player_Sprite-Sheet.png"));
            animations = new BufferedImage[2][15];     /// x = randuri, y = nr max coloane (15)

            for(int j = 0; j< animations.length; j++)
                for (int i = 0; i < animations[j].length; i++) {
                    animations[j][i] = img.getSubimage(i * 128,j*128 , 128, 128);
                }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}
