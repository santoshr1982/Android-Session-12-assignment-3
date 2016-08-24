package assignment.fragment.rsantosh.com.assignment3;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ButtonFragment extends Fragment {

    private OnItemSelectedListener listener;



    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_button, container, false);



        Button ButtonLayout1 = (Button) view.findViewById(R.id.button_layout1);

        Button ButtonLayout2 = (Button) view.findViewById(R.id.button_layout2);

        Button ButtonLayout3 = (Button) view.findViewById(R.id.button_layout3);

        Button ButtonLayout4 = (Button) view.findViewById(R.id.button_layout4);



        ButtonLayout1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                updateDetail("layout1");

            }

        });



        ButtonLayout2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                updateDetail("layout2");

            }

        });


        ButtonLayout3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                updateDetail("layout3");

            }

        });



        ButtonLayout4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                updateDetail("layout4");

            }

        });



        return view;

    }



    public interface OnItemSelectedListener {

        public void onRssItemSelected(String link);

    }



    @Override

    public void onAttach(Activity activity) {

        super.onAttach(activity);

        if (activity instanceof OnItemSelectedListener) {

            listener = (OnItemSelectedListener) activity;

        } else {

            throw new ClassCastException(activity.toString() + " must implemenet MyListFragment.OnItemSelectedListener");

        }

    }



    // May also be triggered from the Activity

    public void updateDetail(String s) {

        listener.onRssItemSelected(s);

    }
}
