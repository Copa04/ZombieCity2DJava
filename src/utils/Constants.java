package utils;

public class Constants {

    public static class Directions{
        public static final int left = 0;
        public static final int right = 1;
    }

    public static class PlayerConstants{
        public static final int IDLE = 0;

        public static final int RUNNING = 1;
        public static final int JUMPING = 2;
        public static final int FALLING = 3;
        public static final int HIT = 4;
        public static final int CHROUCH = 5;

        public static int GetSpriteAmmount(int player_action) {
            switch (player_action) {
                case RUNNING:
                    return 15;
                case IDLE:
                    return 4;
                case JUMPING:
                case FALLING:
                case HIT:
                case CHROUCH:
                default:
                    return 1;
            }
        }
    }
}
