package coatocl.exaatocl.uiwithlinear;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener;

public class MainActivity extends AppCompatActivity
//        implements BottomNavigationView.OnNavigationItemSelectedListener
{

    BottomNavigationView bottomnav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomnav = findViewById(R.id.bottomnav);
        bottomnav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.home:
                        Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_LONG).show();
                        break;

                    case R.id.history:
                        Toast.makeText(MainActivity.this, "History", Toast.LENGTH_LONG).show();
                        break;

                    case R.id.scan:
                        Toast.makeText(MainActivity.this, "Scan", Toast.LENGTH_LONG).show();
                        break;

                    case R.id.myoffice:
                        Toast.makeText(MainActivity.this, "My Office", Toast.LENGTH_LONG).show();
                        break;

                    case R.id.setting:
                        Toast.makeText(MainActivity.this, "Setting", Toast.LENGTH_LONG).show();
                        break;
                    default:

                }
            }

        });
    }

}
