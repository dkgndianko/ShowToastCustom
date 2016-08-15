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

   // private static String TAG = ShowToastUtil.class.getSimpleName();


    /**
     * Show error toast
     * @param context
     * @param message
     * @param duration
     */
    public static void error(Context context, String message,int duration) {
        try {
            LayoutInflater inflater = LayoutInflater.from(context);
            View view = inflater.inflate(R.layout.error_toast, null);
            TextView textView = (TextView) view.findViewById(R.id.textView);
            textView.setText(message);
            showCustomToast(context, view,duration);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Show warming toast
     * @param context
     * @param message
     * @param duration
     */
    public static void warming(Context context,String message,int duration) {
        try{
        LayoutInflater inflater = LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.warming_toast, null);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText(message);
        showCustomToast(context,view,duration);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Show info toast
     * @param context
     * @param message
     * @param duration
     */
    public static void info(Context context,String message,int duration) {
        try{
        LayoutInflater inflater = LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.info_toast, null);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText(message);
        showCustomToast(context,view,duration);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Show success toast
     * @param context
     * @param message
     * @param duration
     */
    public static void success(Context context,String message,int duration) {
        try{
        LayoutInflater inflater = LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.succeess_toast, null);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText(message);
        showCustomToast(context,view,duration);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Show custom toasts
     * @param context
     * @param v
     * @param duration
     */
    public static void showCustomToast(Context context,View v,int duration){
        try{
        Toast customtoast=new Toast(context);
        customtoast.setView(v);
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,0, 0);
            // SHORT DURATION
            if(duration==0) {
                customtoast.setDuration(Toast.LENGTH_SHORT);
            }
            // LONG DURATION
            else if (duration==1){
                customtoast.setDuration(Toast.LENGTH_LONG);
            }
            else{

                throw new Exception("La durrée doit être 0 => courte durée ou 1 => longue durée");
            }
        customtoast.show();
        }catch (Exception e){
           e.printStackTrace();
        }
    }

}
