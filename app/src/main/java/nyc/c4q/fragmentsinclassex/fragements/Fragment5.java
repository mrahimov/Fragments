package nyc.c4q.fragmentsinclassex.fragements;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import nyc.c4q.fragmentsinclassex.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment5 extends Fragment {

    private View rootView;
    private TextView textView;

    public Fragment5() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_fragment5, container, false);
        textView = (TextView) rootView.findViewById(R.id.fragment5_textview);

        Bundle bundle = getArguments();
        String text5 = bundle.getString(MainFragment.MAIN_TEXT_KEY);
        textView.setText(text5);

        return rootView;
    }

}
