package foxy.papa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String quotes[] = {"A jak pan Jezus powiedział?","Jeszcze jak","Nie mogę powiedzieć","Nie","Tak","Nie dali mi nigdy","Co?","Może","Jeden rabin powie tak, inny powie nie"};

    TextView mText;
    Button mButton;
    ImageView mPapaImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mText = (TextView) findViewById(R.id.papaText);
        mPapaImage = (ImageView) findViewById(R.id.papaImage);
        mButton = (Button) findViewById(R.id.papaButton);


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int index = new Random().nextInt(quotes.length);
                mText.setText(quotes[index]);
                YoYo.with(Techniques.Swing)
                        .duration(500)
                        .playOn(mPapaImage);
            }
        });
    }
}
