package GLAB7;

import com.sun.source.tree.Tree;

import java.util.Map;
import java.util.TreeMap;

public class PhoneDirectoryWithTreeMap {
    private TreeMap<String, String> data;

    public PhoneDirectoryWithTreeMap(){
        this.data =  new TreeMap<String, String> ();
    }

    public String getNumber( String name){
        return this.data.get(name);

    }

    public void putNumber(String name, String number){
        if ( name == null || number == null)
            throw  new IllegalArgumentException("Name and Number cannot be null");
        this.data.put(name,number);
    }


    public void print (){
        for ( Map.Entry<String,String> entry :  this.data.entrySet() ){
            System.out.println(entry.getKey() + ":  " + entry.getValue());
        }

    }




}
