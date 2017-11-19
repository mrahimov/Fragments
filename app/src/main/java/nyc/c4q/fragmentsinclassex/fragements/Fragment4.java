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
public class Fragment4 extends Fragment {

    private View rootView;
    private TextView textView;

    public Fragment4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_fragment4, container, false);
        textView = (TextView) rootView.findViewById(R.id.fragment4_textview);

        Bundle bundle = getArguments();
        String text4 = bundle.getString(MainFragment.MAIN_TEXT_KEY);
        textView.setText(text4);

        return rootView;
    }

}
