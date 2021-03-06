/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.com.inhand.common.smart.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 *厂家
 * @author 晓洁
 */
public class Vender {
    @Id
    @JsonProperty("_id")
    private ObjectId id;	         //唯一标识
    private ObjectId oid;	         //机构ID
    private String name;
     private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
     

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getOid() {
        return oid;
    }

    public void setOid(ObjectId oid) {
        this.oid = oid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
