package assignment.fragment.rsantosh.com.assignment3;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements ButtonFragment.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override

    public void onRssItemSelected(String link) {

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Layout1 layout1; //Fragment 1
        Layout2 layout2; //Fragment 2
        Layout3 layout3; //Fragment 3
        Layout4 layout4; //Fragment 4

        if (link.equals("layout1")) {

            layout1 = new Layout1();
            fragmentTransaction.replace(R.id.layouts,layout1);
            fragmentTransaction.commit();

        } else if (link.equals("layout2")) {

            layout2 = new Layout2();
            fragmentTransaction.replace(R.id.layouts, layout2);
            fragmentTransaction.commit();

        } else if (link.equals("layout3")) {

            layout3 = new Layout3();
            fragmentTransaction.replace(R.id.layouts, layout3);
            fragmentTransaction.commit();

        } else if (link.equals("layout4")) {

            layout4 = new Layout4();
            fragmentTransaction.replace(R.id.layouts, layout4);
            fragmentTransaction.commit();

        }

    }
}
