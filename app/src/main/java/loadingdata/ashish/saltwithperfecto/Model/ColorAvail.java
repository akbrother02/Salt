package loadingdata.ashish.saltwithperfecto.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ColorAvail {

@SerializedName("Color")
@Expose
private String color;
@SerializedName("ColorCode")
@Expose
private String colorCode;

public String getColor() {
return color;
}

public void setColor(String color) {
this.color = color;
}

public String getColorCode() {
return colorCode;
}

public void setColorCode(String colorCode) {
this.colorCode = colorCode;
}

}