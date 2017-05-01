package loadingdata.ashish.saltwithperfecto.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SizeAvail {

@SerializedName("Size")
@Expose
private String size;
@SerializedName("AvailQty")
@Expose
private Integer availQty;

public String getSize() {
return size;
}

public void setSize(String size) {
this.size = size;
}

public Integer getAvailQty() {
return availQty;
}

public void setAvailQty(Integer availQty) {
this.availQty = availQty;
}

}