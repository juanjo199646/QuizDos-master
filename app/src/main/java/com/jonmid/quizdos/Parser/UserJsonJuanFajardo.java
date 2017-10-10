package com.jonmid.quizdos.Parser;

import com.jonmid.quizdos.Models.UserModelJuanFajardo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JUANJO FAJARDO on 10/10/2017.
 */

public class UserJsonJuanFajardo {

    public static List<UserModelJuanFajardo> getData(String content) throws JSONException {
        JSONArray jsonArray = new JSONArray(content);
        List<UserModelJuanFajardo> userModelJuanFajardoList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject item = jsonArray.getJSONObject(i);


            UserModelJuanFajardo userModelJuanFajardo = new UserModelJuanFajardo();
            userModelJuanFajardo.setName(item.getString("name"));
            userModelJuanFajardo.setUsername(item.getString("username"));
            userModelJuanFajardo.setEmail(item.getString("email"));
            userModelJuanFajardo.setPhone(item.getString("phone"));

            userModelJuanFajardoList.add(userModelJuanFajardo);
        }
        return userModelJuanFajardoList;
    }
}
