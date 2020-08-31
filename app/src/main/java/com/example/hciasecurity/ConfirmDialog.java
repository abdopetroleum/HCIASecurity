package com.example.hciasecurity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;


public class ConfirmDialog extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = requireActivity().getLayoutInflater();
        View view=inflater.inflate(R.layout.confirm_layout, null);
        builder.setView(view);
        Bundle bundle = getArguments();
        TextView trueAndFalse=view.findViewById(R.id.true_false_score);
        trueAndFalse.setText(bundle.getString("TrueAndFalse"));
        TextView singleChoice=view.findViewById(R.id.singl_choice_score);
        singleChoice.setText(bundle.getString("SingleChoices"));
        TextView multipleChoice=view.findViewById(R.id.multiple_choice_score);
        multipleChoice.setText(bundle.getString("MultipleChoice"));
        View back=view.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
        View confirm=view.findViewById(R.id.confirm);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Exam)getActivity()).onConfirm();
                dismiss();
            }
        });

        return builder.create();
    }
}