package loadingdata.ashish.saltwithperfecto.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Feature {

@SerializedName("Fit")
@Expose
private String fit;
@SerializedName("ColorGroup")
@Expose
private String colorGroup;
@SerializedName("Wrinkle_free")
@Expose
private String wrinkleFree;
@SerializedName("Stretch")
@Expose
private String stretch;
@SerializedName("clothing")
@Expose
private String clothing;
@SerializedName("Lined")
@Expose
private String lined;
@SerializedName("Sheer")
@Expose
private String sheer;
@SerializedName("Machine_Wash")
@Expose
private String machineWash;
@SerializedName("Sleeve_Length")
@Expose
private String sleeveLength;

public String getFit() {
return fit;
}

public void setFit(String fit) {
this.fit = fit;
}

public String getColorGroup() {
return colorGroup;
}

public void setColorGroup(String colorGroup) {
this.colorGroup = colorGroup;
}

public String getWrinkleFree() {
return wrinkleFree;
}

public void setWrinkleFree(String wrinkleFree) {
this.wrinkleFree = wrinkleFree;
}

public String getStretch() {
return stretch;
}

public void setStretch(String stretch) {
this.stretch = stretch;
}

public String getClothing() {
return clothing;
}

public void setClothing(String clothing) {
this.clothing = clothing;
}

public String getLined() {
return lined;
}

public void setLined(String lined) {
this.lined = lined;
}

public String getSheer() {
return sheer;
}

public void setSheer(String sheer) {
this.sheer = sheer;
}

public String getMachineWash() {
return machineWash;
}

public void setMachineWash(String machineWash) {
this.machineWash = machineWash;
}

public String getSleeveLength() {
return sleeveLength;
}

public void setSleeveLength(String sleeveLength) {
this.sleeveLength = sleeveLength;
}

}