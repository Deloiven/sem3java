package com.company;

import java.util.ArrayList;
import java.util.List;

public class gb4 {
    public static void main(String[] args) {
        List<ArrayList<Passanger>> arr=new ArrayList();
        for(int i=0; i<3; i++){
            ArrayList <Passanger> arr1=new ArrayList<>();
            for(int j=0; j<2;j++){
                Passanger pass=new Passanger();
                arr1.add(pass);
            }
            arr.add(arr1);
        }

        Passanger pass=new Passanger();
        arr.get(1).add(pass);
    }
}
class Passanger{

}