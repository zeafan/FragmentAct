package com.example.mohamedg.fragmentact;


import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {

    EditText etBarCode;
    EditText etNotes;
    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_fragment2, container, false);
        etNotes = view.findViewById(R.id.etNotes);
        etBarCode = view.findViewById(R.id.etBarCode);
        return view;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }
    @Override
    public void onStart() {
        etBarCode.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                ((MainActivity)getActivity()).currentCustomer.BarCode=charSequence.toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        etNotes.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                ((MainActivity)getActivity()).currentCustomer.Notes=charSequence.toString();

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        super.onStart();
    }
    @Override
    public void onAttach(Context context) {
        Toast.makeText(context, "onAttach_frag1", Toast.LENGTH_SHORT).show();
        super.onAttach(context);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Toast.makeText(getContext(), "ActivityCreated_frag1", Toast.LENGTH_SHORT).show();
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onAttachFragment(Fragment childFragment) {
        Toast.makeText(getContext(), "onAttachFragment_frag1", Toast.LENGTH_SHORT).show();
        super.onAttachFragment(childFragment);
    }

    @Override
    public void onResume() {
        Toast.makeText(getContext(), "onResume_frag1", Toast.LENGTH_SHORT).show();
        super.onResume();
    }

    @Override
    public void onPause() {
        Toast.makeText(getContext(), "onPause_frag1", Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    public void onStop() {
        Toast.makeText(getContext(), "onStop_frag1", Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Toast.makeText(getContext(), "onDestroyView_frag1", Toast.LENGTH_SHORT).show();
        super.onDestroyView();
    }

    @Override
    public void onDetach() {
        Toast.makeText(getContext(), "onDetach_frag1", Toast.LENGTH_SHORT).show();
        super.onDetach();
    }

    @Override
    public void onDestroyOptionsMenu() {
        Toast.makeText(getContext(), "onDestroyOptionsMenu_frag1", Toast.LENGTH_SHORT).show();
        super.onDestroyOptionsMenu();
    }

    @Override
    public void onDestroy() {
        Toast.makeText(getContext(), "onDestroy_frag1", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Toast.makeText(getContext(), "onCreate_frag1", Toast.LENGTH_SHORT).show();
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Toast.makeText(getContext(), "onViewCreated_frag1", Toast.LENGTH_SHORT).show();
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        Toast.makeText(getContext(), "onViewStateRestored_frag1", Toast.LENGTH_SHORT).show();
        super.onViewStateRestored(savedInstanceState);
    }
}
