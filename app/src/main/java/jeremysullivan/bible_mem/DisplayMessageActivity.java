package jeremysullivan.bible_mem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent message_intent = getIntent();
        String message = message_intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView message_textView = (TextView) findViewById(R.id.textView);
        message_textView.setText(message);
    }
}
