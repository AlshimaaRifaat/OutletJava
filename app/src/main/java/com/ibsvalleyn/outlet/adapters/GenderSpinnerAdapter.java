package com.ibsvalleyn.outlet.adapters;
import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

public class GenderSpinnerAdapter extends ArrayAdapter<String> {

    public GenderSpinnerAdapter(@NonNull Context context, int resource) {
        super( context, resource );
    }

    @Override
    public int getCount() {
        int count = super.getCount();

        return count>0 ? count-1 : count ;

    }
}
