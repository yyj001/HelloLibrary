package com.ish.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by ish on 2018/3/15.
 */

public class NewToast {
    NewToast(Context context, String str){
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
    }
}
