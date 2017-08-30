package jeremysullivan.bible_mem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.Bible_Mem.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    // Example of a call to a native method
 //   TextView tv = (TextView) findViewById(R.id.sample_text);
 //   tv.setText(stringFromJNI());
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
  //  public native String stringFromJNI();

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    //Send Message button click function
    public void sendMessage(View view){
        Intent message_intent = new Intent(this, DisplayMessageActivity.class);
        EditText input_text_Object = (EditText) findViewById(R.id.editText);
        String input_text = input_text_Object.getText().toString();
        message_intent.putExtra(EXTRA_MESSAGE, input_text);
        startActivity(message_intent);
    }
}
