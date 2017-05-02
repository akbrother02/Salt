package loadingdata.ashish.saltwithperfecto;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import loadingdata.ashish.saltwithperfecto.Model.Product;

/**
 * Created by Aashish on 5/1/2017.
 */

public class ItemUtil {
    private Context context;

    public ItemUtil(){}

    public ItemUtil(Context context){
        this.context = context;
    }

    public List<Product> parseProductData(String responseJson, Context context) {
    List<Product> productList = new ArrayList<>();

    try {

        JSONObject jsonObject=new JSONObject(responseJson);
        JSONArray responseObject = jsonObject.getJSONArray("Products");
//            Log.d("Produces Response: ",responseJson);
                for (int i = 0; i < responseObject.length(); i++) {
                    Product product = new Product();
                    if (responseObject.getJSONObject(i).has("Name"))
                        product.setName(responseObject.getJSONObject(i).getString("Name").trim());
                    if(responseObject.getJSONObject(i).has("Price"))
                        product.setPrice(responseObject.getJSONObject(i).getInt("Price"));
                        product.setCategoryId(responseObject.getJSONObject(i).getString("ProductId"));
                    JSONArray jsonArray1=responseObject.getJSONObject(i).getJSONArray("Images");
                    for(int j=0;j<jsonArray1.length();j++)
                    {
                        String images=jsonArray1.get(0).toString();
                        Log.d("Images",images);
                        product.setImages(images);
                        break;
                    }

                    productList.add(product);
                }

    } catch (Exception e) {
        e.printStackTrace();
    }

    return productList;
}

}
