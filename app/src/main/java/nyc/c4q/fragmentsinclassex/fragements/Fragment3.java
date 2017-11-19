package nyc.c4q.fragmentsinclassex.fragements;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import nyc.c4q.fragmentsinclassex.R;

import static nyc.c4q.fragmentsinclassex.fragements.MainFragment.MAIN_TEXT_KEY;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment3 extends Fragment {

    private View rootView;
    private TextView textView;


    public Fragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_fragment3, container, false);
        textView = (TextView) rootView.findViewById(R.id.fragment3_textview);

        Bundle bundle = getArguments();
        String text3 = bundle.getString(MainFragment.MAIN_TEXT_KEY);
        textView.setText(text3);

        return rootView;
    }

}
