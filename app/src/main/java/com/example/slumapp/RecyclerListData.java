package com.example.slumapp;

public class RecyclerListData {
    private String name,date,status;

    public RecyclerListData(){
    }
    public RecyclerListData(String name,String detail,String year){
        this.name=name;
        this.date=date;
        this.status=status;

    }
    public String getName(){
        return name;
    }
    public String getDate(){
        return date;
    }
    public String getStatus(){
        return status;
    }
    public void setName(String name){
        this.name=name;

    }
    public void setDate(String date){
        this.date=date;

    }
    public void setStatus(String status){
        this.status=status;

    }


}
