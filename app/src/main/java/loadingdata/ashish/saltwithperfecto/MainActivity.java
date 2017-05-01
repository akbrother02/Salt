package loadingdata.ashish.saltwithperfecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

import developer.shivam.perfecto.OnNetworkRequest;
import developer.shivam.perfecto.Perfecto;
import loadingdata.ashish.saltwithperfecto.Model.Product;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GetAllData();
    }

    private void GetAllData() {
        JSONObject jsonObject=new JSONObject();
                try
                {
                    jsonObject.put("name","all");
                }catch(Exception e)
                {
                    e.printStackTrace();
                }
        Perfecto.with(MainActivity.this)
                .fromUrl("http://43.252.91.22:97/shop/getAllProducts")
                .ofTypePost(jsonObject)
                .connect(new OnNetworkRequest() {
                    @Override
                    public void onStart() {

                    }

                    @Override
                    public void onSuccess(String s) {
                        try{
                            JSONObject jsonObject1=new JSONObject(s);

                            JSONArray jsonArray=jsonObject1.getJSONArray("Products");
                            for(int i=0;i<jsonArray.length();i++)
                            {
                               String name=jsonArray.getJSONObject(i).getString("ProductId");
                                Log.d("Product name",name);
                                JSONArray jsonArray1=jsonArray.getJSONObject(i).getJSONArray("Images");
                                for(int j=0;j<jsonArray1.length();j++)
                                {
                                    String images=jsonArray1.get(0).toString();
                                    Log.d("Images",images);
                                    break;
                                }




                            }

                    }catch (Exception e)
                        {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onFailure(int i, String s, String s1) {
                        Log.d("Error", s);
                    }
                });


    }
}
