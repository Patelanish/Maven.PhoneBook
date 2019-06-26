package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    List<String> listPhoneNames = new ArrayList<>();
    List<String> ListNames = new ArrayList<>();
    Map<String, List<String>> map = new LinkedHashMap<>();





    public PhoneBook(Map<String, List<String>> map) {
        this.map = map;



    }

    public PhoneBook() {
        this(new LinkedHashMap<String, List<String>>());
    }

    public void add(String name, String phoneNumber) {
        if(map.containsKey(name))
            map.get(name).add(phoneNumber);
        else {
            map.put(name, listPhoneNames);
            add(name, phoneNumber);
        }

    }

    public void addAll(String name, String... phoneNumbers) {
        map.put(name, Arrays.asList(phoneNumbers));
    }

    public void remove(String name) {
        map.remove(name);
    }

    public Boolean hasEntry(String name) {
        String phoneNumber = null;
        if(listPhoneNames.contains(phoneNumber)){
            return true;}
            return false;
        }


    public List<String> lookup(String name) {
        return map.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        String result = "";
        for (Map.Entry<String, List<String>> entry: map.entrySet() )
            result = entry.getKey();
        return result;
    }

    public List<String> getAllContactNames() {
        listPhoneNames.addAll(map.keySet());
        return listPhoneNames;
    }

    public Map<String, List<String>> getMap() {
        return this.map;
    }

    private class Entry<T, T1> {
    }
}
