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
        for (int i = 0; i < jsonArray.length(); i++){
            JSONObject item = jsonArray.getJSONObject(i);

            JSONArray languages = item.getJSONArray("languages");
            JSONObject languagesItem = languages.getJSONObject(0);

            UserModelJuanFajardo userModelJuanFajardo = new UserModelJuanFajardo();
            userModelJuanFajardo.setSubregion(item.getString("subregion"));
            userModelJuanFajardo.setLanguages(languagesItem.getString("nativeName"));
            userModelJuanFajardo.setArea(item.getInt("area"));

            userModelJuanFajardoList.add(userModelJuanFajardo);
        }
        return userModelJuanFajardoList;
    }
