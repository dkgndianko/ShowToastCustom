package com.sensoftsarl.showcustomtoast;

import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by doulab on 11/08/16.
 */
public class ShowToastUtil extends Activity {

    private static String TAG = ShowToastUtil.class.getSimpleName();
    // Error toast
    public static void error(Context context, String message) {
        try {

            LayoutInflater inflater = LayoutInflater.from(context);
            View view = inflater.inflate(R.layout.error_toast, null);
            TextView textView = (TextView) view.findViewById(R.id.textView);
            textView.setText(message);
            showCostomToast(context, view);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    // Warming toast
    public static void warming(Context context,String message) {
        try{
        LayoutInflater inflater = LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.warming_toast, null);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText(message);
        showCostomToast(context,view);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    // Info toast
    public static void info(Context context,String message) {
        try{
        LayoutInflater inflater = LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.info_toast, null);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText(message);
        showCostomToast(context,view);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void showCostomToast(Context context,View v){
        try{
        Toast customtoast=new Toast(context);
        customtoast.setView(v);
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,0, 0);
        customtoast.setDuration(Toast.LENGTH_LONG);
        customtoast.show();
        }catch (Exception e){
           e.printStackTrace();
        }
    }

}
