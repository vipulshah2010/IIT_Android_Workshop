package vipshah.com.snackbarselectordemo;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout container = findViewById(R.id.container);

        imageButton = findViewById(R.id.imageButton);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar
                        .make(container, R.string.hello_world,
                                Snackbar.LENGTH_INDEFINITE);

                snackbar.setAction(R.string.dismiss, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.i("sample", getString(R.string.clicked_on_button));
                    }
                });

                snackbar.show();

            }
        });
    }
}
