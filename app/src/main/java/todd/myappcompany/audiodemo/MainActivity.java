package todd.myappcompany.audiodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = (MediaPlayer) MediaPlayer.create(this, R.raw.marbles);
    }

    public void play(View view) {

        mediaPlayer.start();
    }

    public void pause(View view) {

        mediaPlayer.pause();
    }


}