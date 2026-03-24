package ru.mirea.afanaseva.dialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class MyProgressDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        ProgressDialog dialog = new ProgressDialog(getActivity());
        dialog.setTitle("Загрузка");
        dialog.setMessage("Подождите...");
        dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);

        new Handler().postDelayed(() -> dialog.dismiss(), 2000);

        return dialog;
    }
}
