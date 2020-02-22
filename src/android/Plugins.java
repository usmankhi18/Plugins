package villa.usman.plugins;

import android.content.Intent;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaInterface;

import org.json.JSONArray;
import org.json.JSONException;

/**
 * This class echoes a string called from JavaScript.
 */
public class Plugins extends CordovaPlugin
{
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException
    {
        if (action.equals("activity"))
        {
            this.activity(args, callbackContext);
            return true;
        }else if (action.equals("camera"))
        {
            this.camera (args, callbackContext);
            return true;
        }

        return false;
    }



    private void activity(JSONArray args, CallbackContext callbackContext)
    {
      if (args != null)
      {
        try
        {
          String p1 =  args.getJSONObject(0).getString("param1");
          Intent intent = new Intent(this.cordova.getActivity().getApplicationContext(), NewActivity.class);
          intent.putExtra("result",p1);
          this.cordova.getActivity().startActivity(intent);
          callbackContext.success("Success");
        }catch(Exception ex){
            callbackContext.error("Invalid activity operation");
        }

        } else
        {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }

    private void camera(JSONArray args, CallbackContext callbackContext)
    {
        if (args != null)
        {
           try
           {
             Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
             this.cordova.getActivity().startActivity(intent);
                callbackContext.success("Success");
            } catch (Exception e)
            {
                callbackContext.error("Invalid camera operation");
            }

        } else
        {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }

}
