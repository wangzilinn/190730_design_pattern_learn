package Adapter;

public class Demo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "mp3fileName");
        audioPlayer.play("mp4", "mp4fileName");
        audioPlayer.play("vlc", "vlcFileName");
        audioPlayer.play("avi", "aviFileName");
    }
}
