package loadingdata.ashish.saltwithperfecto.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Product {

@SerializedName("ProductId")
@Expose
private String productId;
@SerializedName("CategoryId")
@Expose
private String categoryId;
@SerializedName("Name")
@Expose
private String name;
@SerializedName("TagLine")
@Expose
private String tagLine;
@SerializedName("Collection")
@Expose
private String collection;
@SerializedName("ColorAvail")
@Expose
private ColorAvail colorAvail;
@SerializedName("SizeAvail")
@Expose
private List<SizeAvail> sizeAvail = null;
@SerializedName("FabricCare")
@Expose
private String fabricCare;
@SerializedName("Fabric")
@Expose
private String fabric;
@SerializedName("Price")
@Expose
private Integer price;
@SerializedName("Internal_Name")
@Expose
private String internalName;
@SerializedName("Discount")
@Expose
private Integer discount;
@SerializedName("PairedProduct")
@Expose
private List<String> pairedProduct = null;
@SerializedName("Images")
@Expose
private String images = null;
@SerializedName("Details")
@Expose
private String details;
@SerializedName("Description")
@Expose
private String description;
@SerializedName("Tags")
@Expose
private List<String> tags = null;
@SerializedName("Features")
@Expose
private List<Feature> features = null;
@SerializedName("Islaunch")
@Expose
private String islaunch;
@SerializedName("Created_at")
@Expose
private String createdAt;
@SerializedName("Cate_View_Img")
@Expose
private String cateViewImg;
@SerializedName("Qty")
@Expose
private Integer qty;
@SerializedName("_version_")
@Expose
private Integer version;
@SerializedName("hasvideo")
@Expose
private Boolean hasvideo;
@SerializedName("vposition")
@Expose
private Boolean vposition;

public String getProductId() {
return productId;
}

public void setProductId(String productId) {
this.productId = productId;
}

public String getCategoryId() {
return categoryId;
}

public void setCategoryId(String categoryId) {
this.categoryId = categoryId;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getTagLine() {
return tagLine;
}

public void setTagLine(String tagLine) {
this.tagLine = tagLine;
}

public String getCollection() {
return collection;
}

public void setCollection(String collection) {
this.collection = collection;
}

public ColorAvail getColorAvail() {
return colorAvail;
}

public void setColorAvail(ColorAvail colorAvail) {
this.colorAvail = colorAvail;
}

public List<SizeAvail> getSizeAvail() {
return sizeAvail;
}

public void setSizeAvail(List<SizeAvail> sizeAvail) {
this.sizeAvail = sizeAvail;
}

public String getFabricCare() {
return fabricCare;
}

public void setFabricCare(String fabricCare) {
this.fabricCare = fabricCare;
}

public String getFabric() {
return fabric;
}

public void setFabric(String fabric) {
this.fabric = fabric;
}

public Integer getPrice() {
return price;
}

public void setPrice(Integer price) {
this.price = price;
}

public String getInternalName() {
return internalName;
}

public void setInternalName(String internalName) {
this.internalName = internalName;
}

public Integer getDiscount() {
return discount;
}

public void setDiscount(Integer discount) {
this.discount = discount;
}

public List<String> getPairedProduct() {
return pairedProduct;
}

public void setPairedProduct(List<String> pairedProduct) {
this.pairedProduct = pairedProduct;
}

public String getImages() {
return images;
}

public void setImages(String images) {
this.images = images;
}

public String getDetails() {
return details;
}

public void setDetails(String details) {
this.details = details;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public List<String> getTags() {
return tags;
}

public void setTags(List<String> tags) {
this.tags = tags;
}

public List<Feature> getFeatures() {
return features;
}

public void setFeatures(List<Feature> features) {
this.features = features;
}

public String getIslaunch() {
return islaunch;
}

public void setIslaunch(String islaunch) {
this.islaunch = islaunch;
}

public String getCreatedAt() {
return createdAt;
}

public void setCreatedAt(String createdAt) {
this.createdAt = createdAt;
}

public String getCateViewImg() {
return cateViewImg;
}

public void setCateViewImg(String cateViewImg) {
this.cateViewImg = cateViewImg;
}

public Integer getQty() {
return qty;
}

public void setQty(Integer qty) {
this.qty = qty;
}

public Integer getVersion() {
return version;
}

public void setVersion(Integer version) {
this.version = version;
}

public Boolean getHasvideo() {
return hasvideo;
}

public void setHasvideo(Boolean hasvideo) {
this.hasvideo = hasvideo;
}

public Boolean getVposition() {
return vposition;
}

public void setVposition(Boolean vposition) {
this.vposition = vposition;
}

}