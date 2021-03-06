package nyc.c4q.fragmentsinclassex.fragements;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import nyc.c4q.fragmentsinclassex.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    public static final String MAIN_TEXT_KEY = "mainTextKey";
    private EditText editText;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    private View rootView;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       rootView = inflater.inflate(R.layout.fragment_main, container, false);
       editText = (EditText) rootView.findViewById(R.id.fragment_edit_text);
       button1 = (Button) rootView.findViewById(R.id.fragment_button01);
       button2 = (Button) rootView.findViewById(R.id.fragment_button02);
       button3 = (Button) rootView.findViewById(R.id.fragment_button03);
       button4 = (Button) rootView.findViewById(R.id.fragment_button04);
       button5 = (Button) rootView.findViewById(R.id.fragment_button05);

       button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Fragment1 fragment1 = new Fragment1();
               FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
               FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

               String textFromMainFragment = editText.getText().toString();
               Bundle bundle = new Bundle();
               bundle.putString(MAIN_TEXT_KEY, textFromMainFragment);
               fragment1.setArguments(bundle);

               fragmentTransaction.replace(R.id.main_container, fragment1).addToBackStack(MAIN_TEXT_KEY);
               fragmentTransaction.commit();
           }
       });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment2 fragment2 = new Fragment2();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                String textFromMainFragment = editText.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString(MAIN_TEXT_KEY, textFromMainFragment);
                fragment2.setArguments(bundle);

                fragmentTransaction.replace(R.id.main_container, fragment2).addToBackStack(MAIN_TEXT_KEY);
                fragmentTransaction.commit();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment3 fragment3 = new Fragment3();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                String textFromMainFragment = editText.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString(MAIN_TEXT_KEY, textFromMainFragment);
                fragment3.setArguments(bundle);

                fragmentTransaction.replace(R.id.main_container, fragment3).addToBackStack(MAIN_TEXT_KEY);
                fragmentTransaction.commit();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment4 fragment4 = new Fragment4();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                String textFromMainFragment = editText.getText().toString();
                 Bundle bundle = new Bundle();
                 bundle.putString(MAIN_TEXT_KEY, textFromMainFragment);
                 fragment4.setArguments(bundle);

                 fragmentTransaction.replace(R.id.main_container, fragment4).addToBackStack(MAIN_TEXT_KEY);
                 fragmentTransaction.commit();

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment5 fragment5 = new Fragment5();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                String textFromMainFragment = editText.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString(MAIN_TEXT_KEY, textFromMainFragment);
                fragment5.setArguments(bundle);

                fragmentTransaction.replace(R.id.main_container, fragment5).addToBackStack(MAIN_TEXT_KEY);
                fragmentTransaction.commit();

            }
        });


       return rootView;
    }

}
