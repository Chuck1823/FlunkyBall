package malenerdgaming.com.flunkyball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    // App crashes when Arcade Button is pressed!!!

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        Button letsFlunkButton = (Button)findViewById(R.id.lets_flunk_button);
        Button howToFlunkButton = (Button)findViewById(R.id.how_to_flunk);

        letsFlunkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this, Flunk.class));
            }
        });

        howToFlunkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this, Flunk.class));
            }
        });
    }

}
