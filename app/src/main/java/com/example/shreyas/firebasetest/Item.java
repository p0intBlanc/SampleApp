
package com.example.shreyas.firebasetest;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("favoriteFruit")
    @Expose
    public String favoriteFruit;
    @SerializedName("tags")
    @Expose
    public List<String> tags = null;
    @SerializedName("registered")
    @Expose
    public String registered;
    @SerializedName("about")
    @Expose
    public String about;
    @SerializedName("address")
    @Expose
    public String address;
    @SerializedName("phone")
    @Expose
    public String phone;
    @SerializedName("company")
    @Expose
    public String company;
    @SerializedName("eyeColor")
    @Expose
    public String eyeColor;
    @SerializedName("age")
    @Expose
    public Integer age;
    @SerializedName("picture")
    @Expose
    public String picture;
    @SerializedName("balance")
    @Expose
    public String balance;
    @SerializedName("_id")
    @Expose
    public String id;

}
