package com.ynov;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;


public class Shows {

    @Id
    public ObjectId _id;

    public String name;

    public Shows(){}

    public Shows(ObjectId _id, String name){
        this._id = _id;
        this.name = name;
    }

    public String getId(){
        return _id.toHexString();
    }
    public void setId(ObjectId _id){
        this._id = _id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
