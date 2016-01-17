package com;


public class Bulding {

    String age;
    String area;
    String type;
    Double height;
    Double width;


    public Bulding (){
        System.out.println("Введите имя здания");
    }


    public void  checkAgeOfBuilding() {
        int ageParse = Integer.parseInt(age);
        if(ageParse > 100){
            System.out.println(" Ваше здание имеет историчискую ценность ");
        }else {
            System.out.println(" Ваше здание ничего не представляет для истории ");
        }
    }
    public  String getAreaOfBuilding(){
        return (" Место нахождения здания " + area);
    }

    public String getTypeOfBuilding() {
        return (" Ваше здание из   " + type);
    }

    public Double getHeightOfBuilding() {
        return Double.valueOf((" Введите высоту здания " + height));
    }

    public Double getWidthOfBuilding() {
        return Double.valueOf(((" Введите ширину  здания " + width)));
    }

}
