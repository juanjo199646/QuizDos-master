package com.jonmid.quizdos.Parser;

import com.jonmid.quizdos.Models.CommentModelJuanFajardo;
import com.jonmid.quizdos.Models.UserModelJuanFajardo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JUANJO FAJARDO on 10/10/2017.
 */

public class CommentJsonJuanFajardo {

    public static List<CommentModelJuanFajardo> getData(String content) throws JSONException {
        JSONArray jsonArray = new JSONArray(content);
        List<CommentModelJuanFajardo> commentModelJuanFajardo = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject item = jsonArray.getJSONObject(i);


           CommentModelJuanFajardo commentModelJuanFajardo1 = new CommentModelJuanFajardo();
            commentModelJuanFajardo1.setName(item.getString("name"));
           commentModelJuanFajardo1.setBody(item.getString("body"));
            commentModelJuanFajardo1.setEmail(item.getString("email"));


            commentModelJuanFajardo.add(commentModelJuanFajardo1);
        }
        return commentModelJuanFajardo;
    }

}
