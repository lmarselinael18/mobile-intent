package id.ac.polinema.intent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileParcelableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        // TODO: bind here

        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            // TODO: display value here
        }
    }

    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    Bundle extras = getIntent().getExtras();
    
}
