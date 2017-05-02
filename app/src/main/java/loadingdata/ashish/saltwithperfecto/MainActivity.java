package loadingdata.ashish.saltwithperfecto;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import developer.shivam.perfecto.OnNetworkRequest;
import developer.shivam.perfecto.Perfecto;
import loadingdata.ashish.saltwithperfecto.Model.Product;

public class MainActivity extends AppCompatActivity {

    LinearLayoutManager linearLayoutManager;
    List<Product> productList = new ArrayList<>();
    Context mContext;
    ProductItemAdapter productItemAdapter;
    GridView foodItemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        foodItemList = (GridView) findViewById(R.id.gridView1);
        GetAllData();
    }

    private void GetAllData() {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("name", "all");
        } catch (Exception e) {
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
                        try {

                            productList = new ItemUtil().parseProductData(s, getApplicationContext());

                                if (productItemAdapter == null)
                                    productItemAdapter = new ProductItemAdapter(productList,MainActivity.this);
                                foodItemList.setAdapter(productItemAdapter);



                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onFailure(int i, String s, String s1) {
                        Log.d("Error", s);
                    }
                });


    }

    private class ProductItemAdapter extends BaseAdapter {

        private  LayoutInflater inflater=null;
        Context context;

        ProductItemAdapter(List<Product> list,Context context) {
            productList = list;
            this.context=context;
            inflater = ( LayoutInflater )getApplicationContext().
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        }

        @Override
        public int getCount() {
            return productList.size();
        }

        @Override
        public Product getItem(int i) {
            return productList.get(i);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        class Holder {
            ImageView ivProductImage;
            TextView tvProductName,tvPrice;

        }

        @Override
        public View getView(final int position, View view, ViewGroup viewGroup) {

            final Holder holder;
            View rowView;

            rowView = inflater.inflate(R.layout.list_row, null);

                holder = new Holder();

                holder.ivProductImage = (ImageView) rowView.findViewById(R.id.imageView1);
                holder.tvProductName = (TextView) rowView.findViewById(R.id.textname);
                holder.tvPrice=(TextView)rowView.findViewById(R.id.price);
                rowView.setTag(holder);


            holder.tvProductName.setText(productList.get(position).getName());
            holder.tvPrice.setText(productList.get(position).getPrice()+"");
            Picasso
                    .with(getApplicationContext())
                    .load("http://43.252.91.22:100/"+productList.get(position).getCategoryId()+"/thumb.jpg")
                    .into(holder.ivProductImage);
            return rowView;
        }
    }
}
