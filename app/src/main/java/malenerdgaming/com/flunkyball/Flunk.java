package malenerdgaming.com.flunkyball;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Flunk extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arcade_mode);

        final Button backButton = (Button)findViewById(R.id.back_button);
        final ImageView ball = (ImageView)findViewById(R.id.ball);
        final Animation letItRain = AnimationUtils.loadAnimation(this, R.anim.gravity_pull);

        ball.startAnimation(letItRain);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Flunk.this, Menu.class));
            }
        });

        ball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Make it pop up
            }
        });
    }
}
