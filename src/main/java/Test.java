import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Test {

    public static void main(String args[]){

        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "MUD GUI";
        config.width = 800;
        config.height = 600;
        new LwjglApplication(new MUDGui(), config);
    }
}