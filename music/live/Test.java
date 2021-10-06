package Questions.music.live;
import Questions.music.Playable;
import Questions.music.string.Veena;

import Questions.music.wind.Saxophone;
public class Test {
    public static void main(String[] args) {
        Veena v=new Veena();
        v.play();
        Saxophone s=new Saxophone();
        s.play();
        Playable p=new Playable() {
            @Override
            public void play() {
                System.out.println("playable");
            }
        };
        p.play();
    }
}
