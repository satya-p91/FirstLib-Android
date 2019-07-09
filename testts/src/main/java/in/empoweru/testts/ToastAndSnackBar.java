package in.empoweru.testts;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ToastAndSnackBar {

    public static final String TAG = ToastAndSnackBar.class.getSimpleName();

    public static void showToast(String toastMessage, Context context){
        Toast toast = Toast.makeText(context, toastMessage, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }


    public static void showSnackBar(LinearLayout layout,String message){
        final Snackbar snackbar = Snackbar.make(layout, message,Snackbar.LENGTH_INDEFINITE);
        snackbar.setAction("Cancel", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar.dismiss();
            }
        });
        snackbar.show();
    }

}
